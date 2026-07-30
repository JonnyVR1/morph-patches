package com.p051p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p151v.VLinear;
import p151v.VText;
import p153l.arl;
import p153l.biv;
import p153l.bnl0;
import p153l.d9n0;
import p153l.nsv;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.yql;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatInternalItemView extends ConstraintLayout implements arl {

    /* JADX INFO: renamed from: i */
    public static int f53891i;

    /* JADX INFO: renamed from: d */
    public VText f53892d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f53893e;

    /* JADX INFO: renamed from: f */
    public VLinear f53894f;

    /* JADX INFO: renamed from: g */
    public VoiceChatItem f53895g;

    /* JADX INFO: renamed from: h */
    public VoiceChatItem f53896h;

    public VoiceChatInternalItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: o0 */
    public static String m79211o0(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m79212p0(long j) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.setTimeInMillis(j);
        return i == calendar.get(1);
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
        this.f53895g.mo73677M();
        this.f53896h.mo73677M();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m79213m0(View view) {
        d9n0.m115085a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m79214n0() {
        C0223a c0223a = new C0223a();
        c0223a.m1149c(this);
        if (f53891i == 0) {
            f53891i = (int) ((bnl0.m105518J(this.f53892d.getContext()).x / 2.0f) - (this.f53892d.getWidth() / 2.0f));
        }
        c0223a.m1152f(this.f53892d.getId(), 6, 0, 6, f53891i);
        c0223a.m1164s(this.f53892d.getId(), 0);
        c0223a.m1147a(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79213m0(this);
        this.f53896h.setLongClickArea(IChatItemLongClickArea.LongClickArea.CONTENT);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean m79215q0(yql yqlVar, LiveMessage liveMessage, View view) {
        yqlVar.mo73877b(this.f53893e, liveMessage);
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean m79216r0(yql yqlVar, LiveMessage liveMessage, View view) {
        yqlVar.mo73877b(this.f53896h, liveMessage);
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public void m79217s0(final yql yqlVar, final LiveMessage liveMessage, boolean z) {
        List<SpannableStringBuilder> list = liveMessage.spanList;
        if (list != null && list.size() >= 2) {
            this.f53895g.f49609c.setPadding(0, 0, 0, 0);
            this.f53895g.m73699e(yqlVar, liveMessage, list.get(0), 2);
            this.f53896h.m73699e(yqlVar, liveMessage, list.get(1), 1);
        }
        final LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        CommonMaskAvatarView commonMaskAvatarView = this.f53893e;
        if (liveUserInfo != null) {
            biv.m104518c(commonMaskAvatarView, qa00.f156338y, nsv.m164636f(liveUserInfo).m164639c(liveUserInfo.userId, liveUserInfo.userMask, liveUserInfo.isMaskMode), new qcj() { // from class: l.y8n0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveUserInfo) obj).userImage;
                }
            }, 0);
        } else {
            biv.m104522g(commonMaskAvatarView, qa00.f156338y, "defaultUrl", null, null);
        }
        bnl0.m105509E0(this.f53893e, new View.OnClickListener() { // from class: l.z8n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yqlVar.mo73880e(liveUserInfo, liveMessage.seq);
            }
        });
        this.f53893e.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.a9n0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f69060a.m79215q0(yqlVar, liveMessage, view);
            }
        });
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if ((extInfo == null || !extInfo.isSystemReplaceMessage) && !TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            this.f53896h.f49609c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.b9n0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f75598a.m79216r0(yqlVar, liveMessage, view);
                }
            });
        }
        this.f53896h.f49609c.setPadding(qa00.m175859d(12.0f), qa00.m175859d(8.0f), qa00.m175859d(12.0f), qa00.m175859d(8.0f));
        bnl0.m105554f0(this.f53895g.f49609c, qa00.m175859d(2.0f));
        bnl0.m105537U(this.f53896h, z ? 0 : qa00.m175859d(6.0f));
        bnl0.m105540X(this.f53895g, qa00.m175859d(6.0f));
        long j = liveMessage.createTime - liveMessage.preMessageTime;
        VText vText = this.f53892d;
        if (j <= AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(4);
        VText vText2 = this.f53892d;
        long j2 = liveMessage.createTime;
        vText2.setText(m79211o0(j2, m79212p0(j2) ? "MM月dd日 HH:mm" : "yyyy年MM月dd日 HH:mm"));
        this.f53892d.post(new Runnable() { // from class: l.c9n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f80508a.m79214n0();
            }
        });
    }

    public VoiceChatInternalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChatInternalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
