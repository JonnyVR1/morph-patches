package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.livingroom.virtual.endSuggest.SuggestedStopped;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class bpl0 {
    /* JADX INFO: renamed from: a */
    public static C22306c<SuggestedStopped> m103079a(String str, String str2) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/voiceLives"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), mt0.m156174a(OMSTemplateModeType.page, "voice_room"), mt0.m156174a("action", "stopped"), mt0.m156174a("source", str), mt0.m156174a("oldLiveIds", str2)), "requestEndSuggest", new c7t(SuggestedStopped.class, "suggestedStopped"));
    }
}
