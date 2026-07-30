package com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Video;
import com.p1.mobile.android.app.Act;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.HashSet;
import l.vrx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface FeedCommonService extends IProvider {
    /* JADX INFO: renamed from: B5 */
    void mo1154B5(Act act, Video video, String str);

    /* JADX INFO: renamed from: H0 */
    String mo1155H0();

    /* JADX INFO: renamed from: O0 */
    HashSet<String> mo1156O0(Envelope envelope, Integer num);

    /* JADX INFO: renamed from: R0 */
    vrx mo1157R0();

    /* JADX INFO: renamed from: nh */
    vrx mo1158nh();
}
