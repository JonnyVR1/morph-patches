package com.p046p1.mobile.putong.live.external.page.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.apibean.LivePushNoticeItemBean;
import com.p046p1.mobile.putong.live.external.page.setting.LiveFollowPushNoticeItemView;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VSwitch;
import p147v.VText;
import p149l.f5c0;
import p149l.hxs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFollowPushNoticeItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46153d;

    /* JADX INFO: renamed from: e */
    public VText f46154e;

    /* JADX INFO: renamed from: f */
    public VSwitch f46155f;

    /* JADX INFO: renamed from: g */
    public C12580a f46156g;

    public LiveFollowPushNoticeItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m70680p(C12581b.a aVar, LivePushNoticeItemBean livePushNoticeItemBean, C12580a c12580a, View view) {
        if (aVar != null) {
            aVar.mo70775a(c12580a, !livePushNoticeItemBean.isPushEnabled());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f46153d = (VDraweeView) findViewById(f5c0.f95108k);
        this.f46154e = (VText) findViewById(f5c0.f95070a1);
        this.f46155f = (VSwitch) findViewById(f5c0.f95007H1);
    }

    /* JADX INFO: renamed from: q */
    public void m70681q(final C12580a c12580a, final C12581b.a aVar) {
        this.f46156g = c12580a;
        final LivePushNoticeItemBean livePushNoticeItemBeanM70755H = c12580a.m70755H();
        String str = livePushNoticeItemBeanM70755H.anchorAvatar;
        if (str != null && !str.isEmpty()) {
            hxs.m133406s("context_common", this.f46153d, livePushNoticeItemBeanM70755H.anchorAvatar);
        }
        VText vText = this.f46154e;
        String str2 = livePushNoticeItemBeanM70755H.anchorName;
        if (str2 == null) {
            str2 = "";
        }
        vText.setText(str2);
        this.f46155f.setChecked(livePushNoticeItemBeanM70755H.isPushEnabled());
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.fds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveFollowPushNoticeItemView.m70680p(aVar, livePushNoticeItemBeanM70755H, c12580a, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m70682z(boolean z) {
        VSwitch vSwitch = this.f46155f;
        if (vSwitch != null) {
            vSwitch.setChecked(z);
        }
        C12580a c12580a = this.f46156g;
        if (c12580a == null || c12580a.m70755H() == null) {
            return;
        }
        this.f46156g.m70755H().setPushEnabled(z);
    }

    public LiveFollowPushNoticeItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFollowPushNoticeItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
