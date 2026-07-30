package com.googlecode.mp4parser.authoring.tracks;

import java.util.HashMap;
import java.util.Map;
import p153l.azk0;
import p153l.kgk;
import p153l.no4;
import p153l.po4;

/* JADX INFO: loaded from: classes7.dex */
class CencEncryptingTrackImpl$1 extends HashMap<kgk, long[]> {
    final /* synthetic */ no4 this$0;

    public CencEncryptingTrackImpl$1(no4 no4Var, Map map) {
        super(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public long[] put(kgk kgkVar, long[] jArr) {
        if (!(kgkVar instanceof po4)) {
            return (long[]) super.put(kgkVar, jArr);
        }
        azk0.m101074a("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
        return null;
    }
}
