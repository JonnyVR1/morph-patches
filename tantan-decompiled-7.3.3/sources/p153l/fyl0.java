package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.livingroom.virtual.endSuggest.SuggestedStopped;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class fyl0 {
    /* JADX INFO: renamed from: a */
    public static C22421c<SuggestedStopped> m128122a(String str, String str2) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/voiceLives"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), st0.m187803a(OMSTemplateModeType.page, "voice_room"), st0.m187803a("action", "stopped"), st0.m187803a("source", str), st0.m187803a("oldLiveIds", str2)), "requestEndSuggest", new d9t(SuggestedStopped.class, "suggestedStopped"));
    }
}
