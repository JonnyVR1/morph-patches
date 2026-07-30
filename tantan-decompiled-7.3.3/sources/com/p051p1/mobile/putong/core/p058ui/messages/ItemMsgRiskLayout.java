package com.p051p1.mobile.putong.core.p058ui.messages;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.HarassAlertInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMsgRiskLayout;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.nae0;
import p153l.o1j0;
import p153l.tcq;
import p153l.z20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMsgRiskLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f32165c;

    /* JADX INFO: renamed from: d */
    public VImage f32166d;

    /* JADX INFO: renamed from: e */
    public VText f32167e;

    /* JADX INFO: renamed from: f */
    public VText f32168f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f32169g;

    /* JADX INFO: renamed from: h */
    public VLinear f32170h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f32171i;

    /* JADX INFO: renamed from: j */
    public VText f32172j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f32173k;

    /* JADX INFO: renamed from: l */
    public VText f32174l;

    /* JADX INFO: renamed from: m */
    public VText f32175m;

    public ItemMsgRiskLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m49716Q(Message message, String str, String str2) {
        if (TextUtils.equals(str, "cancel")) {
            return;
        }
        CoreModule.f18264c.f20384f0.m34170vq(message, true);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m49717R(Message message, View view) {
        o1j0.m165651y("感谢反馈，探探将持续保持良好的社交环境");
        CoreModule.f18264c.f20384f0.m34170vq(message, false);
    }

    /* JADX INFO: renamed from: A */
    public void m49718A(final Message message) {
        HarassAlertInfo harassAlertInfo;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (harassAlertInfo = messageAdditionalData.harassAlertInfo) == null || TextUtils.equals(harassAlertInfo.status, "reported") || TextUtils.equals(message.additionalData.harassAlertInfo.status, "ignored")) {
            bnl0.m105524M(this.f32175m, true);
            bnl0.m105524M(this.f32170h, false);
            return;
        }
        bnl0.m105524M(this.f32175m, false);
        bnl0.m105524M(this.f32170h, true);
        bnl0.m105509E0(this.f32171i, new View.OnClickListener() { // from class: l.qcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemMsgRiskLayout.m49717R(message, view);
            }
        });
        final String str = (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.harassAlertInfo)) ? message.additionalData.harassAlertInfo.triggeredMsgID : null;
        bnl0.m105509E0(this.f32173k, new View.OnClickListener() { // from class: l.rcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162245a.m49720T(message, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m49719S(View view) {
        tcq.m190490a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m49720T(final Message message, String str, View view) {
        nae0.m162084n((Activity) getContext(), Uri.parse("tantan://msgReport?uid=" + message.owner + "&conType=hitModelMessage&value=maleHarass&msgId=" + str), new z20() { // from class: l.scq
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                ItemMsgRiskLayout.m49716Q(message, (String) obj, (String) obj2);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49719S(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32166d.setImageResource(ibc0.f113901R5);
            this.f32167e.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32168f.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32172j.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32174l.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32175m.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemMsgRiskLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMsgRiskLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
