package com.open.proxy.aop;import com.open.proxy.aop.advisor.Advisor;/** * @author jinming.wu * @date 2014-4-7 */public abstract class AbstractProxy implements Proxy {    protected TargetSource targetSource;    protected Advisor      advisor;    public AbstractProxy(TargetSource targetSource, Advisor advisor) {        this.targetSource = targetSource;        this.advisor = advisor;    }}