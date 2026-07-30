package com.googlecode.mp4parser.authoring.tracks;

import java.util.HashMap;
import java.util.Map;
import p149l.on4;
import p149l.qn4;
import p149l.udk;
import p149l.upk0;

/* JADX INFO: loaded from: classes7.dex */
class CencEncryptingTrackImpl$1 extends HashMap<udk, long[]> {
    final /* synthetic */ on4 this$0;

    public CencEncryptingTrackImpl$1(on4 on4Var, Map map) {
        super(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public long[] put(udk udkVar, long[] jArr) {
        if (!(udkVar instanceof qn4)) {
            return (long[]) super.put(udkVar, jArr);
        }
        upk0.m194883a("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
        return null;
    }
}
