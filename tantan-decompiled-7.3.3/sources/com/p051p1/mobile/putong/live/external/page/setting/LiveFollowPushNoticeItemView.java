package com.p051p1.mobile.putong.live.external.page.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.apibean.LivePushNoticeItemBean;
import com.p051p1.mobile.putong.live.external.page.setting.LiveFollowPushNoticeItemView;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VSwitch;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.ldc0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveFollowPushNoticeItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f47001d;

    /* JADX INFO: renamed from: e */
    public VText f47002e;

    /* JADX INFO: renamed from: f */
    public VSwitch f47003f;

    /* JADX INFO: renamed from: g */
    public C12743a f47004g;

    public LiveFollowPushNoticeItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m71863p(C12744b.a aVar, LivePushNoticeItemBean livePushNoticeItemBean, C12743a c12743a, View view) {
        if (aVar != null) {
            aVar.mo71958a(c12743a, !livePushNoticeItemBean.isPushEnabled());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f47001d = (VDraweeView) findViewById(ldc0.f131565k);
        this.f47002e = (VText) findViewById(ldc0.f131527a1);
        this.f47003f = (VSwitch) findViewById(ldc0.f131464H1);
    }

    /* JADX INFO: renamed from: q */
    public void m71864q(final C12743a c12743a, final C12744b.a aVar) {
        this.f47004g = c12743a;
        final LivePushNoticeItemBean livePushNoticeItemBeanM71938H = c12743a.m71938H();
        String str = livePushNoticeItemBeanM71938H.anchorAvatar;
        if (str != null && !str.isEmpty()) {
            izs.m142868s("context_common", this.f47001d, livePushNoticeItemBeanM71938H.anchorAvatar);
        }
        VText vText = this.f47002e;
        String str2 = livePushNoticeItemBeanM71938H.anchorName;
        if (str2 == null) {
            str2 = "";
        }
        vText.setText(str2);
        this.f47003f.setChecked(livePushNoticeItemBeanM71938H.isPushEnabled());
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.gfs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveFollowPushNoticeItemView.m71863p(aVar, livePushNoticeItemBeanM71938H, c12743a, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m71865z(boolean z) {
        VSwitch vSwitch = this.f47003f;
        if (vSwitch != null) {
            vSwitch.setChecked(z);
        }
        C12743a c12743a = this.f47004g;
        if (c12743a == null || c12743a.m71938H() == null) {
            return;
        }
        this.f47004g.m71938H().setPushEnabled(z);
    }

    public LiveFollowPushNoticeItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFollowPushNoticeItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
