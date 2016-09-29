package com.forbetter;


import org.junit.Test;


public class AssertTest
{
    @Test
    public void isNull()
        throws Exception
    {
//        Assert.isNull("", ErrorCode.ParamIllegal);
        Assert.isNull(null, ErrorCode.ParamIllegal);
    }

    @Test
    public void notNull()
        throws Exception
    {
        Assert.notNull("",ErrorCode.ParamIllegal);
//        Assert.notNull(null,ErrorCode.ParamIllegal);
    }

}