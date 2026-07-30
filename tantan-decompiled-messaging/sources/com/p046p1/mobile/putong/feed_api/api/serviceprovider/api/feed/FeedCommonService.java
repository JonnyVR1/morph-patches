package com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.HashSet;
import p149l.vrx;

/* JADX INFO: loaded from: classes12.dex */
public interface FeedCommonService extends IProvider {
    /* JADX INFO: renamed from: B5 */
    void mo60228B5(Act act, Video video, String str);

    /* JADX INFO: renamed from: H0 */
    String mo60229H0();

    /* JADX INFO: renamed from: O0 */
    HashSet<String> mo60230O0(Envelope envelope, Integer num);

    /* JADX INFO: renamed from: R0 */
    vrx mo60231R0();

    /* JADX INFO: renamed from: nh */
    vrx mo60232nh();
}
