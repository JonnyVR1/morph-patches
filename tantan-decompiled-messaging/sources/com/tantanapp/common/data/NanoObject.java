package com.tantanapp.common.data;

import com.google.protobuf.nano.MessageNano;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class NanoObject extends MessageNano implements Cloneable, Serializable {
    public static final double HACK_NULL = -231321.22322312d;
    protected int hashCode = 0;

    public void nullCheck() {
    }

    @Override // com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageNano mo223809clone() throws CloneNotSupportedException {
        return super.mo223809clone();
    }
}
