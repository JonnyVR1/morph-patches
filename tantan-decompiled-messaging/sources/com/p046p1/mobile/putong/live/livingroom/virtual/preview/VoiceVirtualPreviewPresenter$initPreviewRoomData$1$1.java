package com.p046p1.mobile.putong.live.livingroom.virtual.preview;

import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* synthetic */ class VoiceVirtualPreviewPresenter$initPreviewRoomData$1$1 extends FunctionReferenceImpl implements Function2<ArrayList<BLiveVoice>, BLiveVoiceRoomAsset, Pair<? extends ArrayList<BLiveVoice>, ? extends BLiveVoiceRoomAsset>> {
    public static final VoiceVirtualPreviewPresenter$initPreviewRoomData$1$1 INSTANCE = new VoiceVirtualPreviewPresenter$initPreviewRoomData$1$1();

    public VoiceVirtualPreviewPresenter$initPreviewRoomData$1$1() {
        super(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Pair<ArrayList<BLiveVoice>, BLiveVoiceRoomAsset> invoke(ArrayList<BLiveVoice> arrayList, BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        return new Pair<>(arrayList, bLiveVoiceRoomAsset);
    }
}
