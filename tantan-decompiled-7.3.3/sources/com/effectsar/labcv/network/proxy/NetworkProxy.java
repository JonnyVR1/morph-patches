package com.effectsar.labcv.network.proxy;

import com.amazing.annotation.EffectKeep;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class NetworkProxy {

    @EffectKeep
    public interface IOnRequestCallback {
    }

    @EffectKeep
    private static native void on_request(IOnRequestCallback iOnRequestCallback);

    @EffectKeep
    private static native void on_response(Response response);
}
