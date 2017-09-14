package io.swagger.api;

import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-14T02:48:30.681Z")

@Controller
public class VehiclesApiController implements VehiclesApi {

    public ResponseEntity<InlineResponse2001> driveState(@ApiParam(value = "The ID number of the car",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> setTemps(@ApiParam(value = "The ID number of the car.",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The desired temperature on the driver's side in celcius.", required = true) @RequestParam(value = "driverTemp", required = true) String driverTemp,
        @ApiParam(value = "The desired temperature on the passenger's side in celcius.", required = true) @RequestParam(value = "passengerTemp", required = true) String passengerTemp) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

}
