package io.swagger.api;

import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-14T02:48:30.681Z")

@Api(value = "vehicles", description = "the vehicles API")
public interface VehiclesApi {

    @ApiOperation(value = "", notes = "Returns the driving and position state of the vehile.", response = InlineResponse2001.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InlineResponse2001.class) })
    @RequestMapping(value = "/vehicles/{id}/data_request/drive_state",
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> driveState(@ApiParam(value = "The ID number of the car",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "", notes = "Set the temperature target for the HVAC system.", response = InlineResponse2002.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = InlineResponse2002.class) })
    @RequestMapping(value = "/vehicles/{id}/command/set_temps",
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> setTemps(@ApiParam(value = "The ID number of the car.",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The desired temperature on the driver's side in celcius.", required = true) @RequestParam(value = "driverTemp", required = true) String driverTemp,
        @ApiParam(value = "The desired temperature on the passenger's side in celcius.", required = true) @RequestParam(value = "passengerTemp", required = true) String passengerTemp);

}
