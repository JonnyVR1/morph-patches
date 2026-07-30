package com.p046p1.mobile.putong.core.p053ui.messages;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.HarassAlertInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMsgRiskLayout;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.f30;
import p149l.j2e0;
import p149l.lsi0;
import p149l.taq;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMsgRiskLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f31317c;

    /* JADX INFO: renamed from: d */
    public VImage f31318d;

    /* JADX INFO: renamed from: e */
    public VText f31319e;

    /* JADX INFO: renamed from: f */
    public VText f31320f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f31321g;

    /* JADX INFO: renamed from: h */
    public VLinear f31322h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f31323i;

    /* JADX INFO: renamed from: j */
    public VText f31324j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f31325k;

    /* JADX INFO: renamed from: l */
    public VText f31326l;

    /* JADX INFO: renamed from: m */
    public VText f31327m;

    public ItemMsgRiskLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m48533Q(Message message, String str, String str2) {
        if (TextUtils.equals(str, "cancel")) {
            return;
        }
        CoreModule.f17545c.f19642f0.m33167vq(message, true);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m48534R(Message message, View view) {
        lsi0.m151595y("感谢反馈，探探将持续保持良好的社交环境");
        CoreModule.f17545c.f19642f0.m33167vq(message, false);
    }

    /* JADX INFO: renamed from: A */
    public void m48535A(final Message message) {
        HarassAlertInfo harassAlertInfo;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (harassAlertInfo = messageAdditionalData.harassAlertInfo) == null || TextUtils.equals(harassAlertInfo.status, "reported") || TextUtils.equals(message.additionalData.harassAlertInfo.status, "ignored")) {
            xdl0.m208344M(this.f31327m, true);
            xdl0.m208344M(this.f31322h, false);
            return;
        }
        xdl0.m208344M(this.f31327m, false);
        xdl0.m208344M(this.f31322h, true);
        xdl0.m208329E0(this.f31323i, new View.OnClickListener() { // from class: l.qaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemMsgRiskLayout.m48534R(message, view);
            }
        });
        final String str = (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.harassAlertInfo)) ? message.additionalData.harassAlertInfo.triggeredMsgID : null;
        xdl0.m208329E0(this.f31325k, new View.OnClickListener() { // from class: l.raq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158548a.m48537T(message, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m48536S(View view) {
        taq.m187766a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m48537T(final Message message, String str, View view) {
        j2e0.m139447n((Activity) getContext(), Uri.parse("tantan://msgReport?uid=" + message.owner + "&conType=hitModelMessage&value=maleHarass&msgId=" + str), new f30() { // from class: l.saq
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                ItemMsgRiskLayout.m48533Q(message, (String) obj, (String) obj2);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48536S(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31318d.setImageResource(c3c0.f78626R5);
            this.f31319e.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31320f.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31324j.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31326l.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31327m.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemMsgRiskLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMsgRiskLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
