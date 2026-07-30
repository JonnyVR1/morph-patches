package com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.HashSet;
import p153l.s0y;

/* JADX INFO: loaded from: classes13.dex */
public interface FeedCommonService extends IProvider {
    /* JADX INFO: renamed from: B5 */
    void mo61412B5(Act act, Video video, String str);

    /* JADX INFO: renamed from: H0 */
    String mo61413H0();

    /* JADX INFO: renamed from: O0 */
    HashSet<String> mo61414O0(Envelope envelope, Integer num);

    /* JADX INFO: renamed from: R0 */
    s0y mo61415R0();

    /* JADX INFO: renamed from: nh */
    s0y mo61416nh();
}
