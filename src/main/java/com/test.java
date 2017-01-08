package com;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by viktor on 1/8/17.
 */
public class test {
    @Temporal(TemporalType.TIMESTAMP)
    Date currentTime;
}
