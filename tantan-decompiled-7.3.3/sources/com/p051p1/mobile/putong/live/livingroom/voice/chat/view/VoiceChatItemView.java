package com.p051p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import java.util.List;
import p151v.VLinear;
import p153l.arl;
import p153l.biv;
import p153l.bnl0;
import p153l.nsv;
import p153l.qa00;
import p153l.qcj;
import p153l.u9n0;
import p153l.uqb0;
import p153l.yql;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatItemView extends RelativeLayout implements arl {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f53897a;

    /* JADX INFO: renamed from: b */
    public VLinear f53898b;

    /* JADX INFO: renamed from: c */
    public VoiceChatItem f53899c;

    /* JADX INFO: renamed from: d */
    public VoiceChatItem f53900d;

    public VoiceChatItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m79222f(yql yqlVar, LiveMessage liveMessage, View view) {
        yqlVar.mo73877b(this.f53897a, liveMessage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ boolean m79223g(yql yqlVar, LiveMessage liveMessage, View view) {
        yqlVar.mo73877b(this.f53900d, liveMessage);
        return true;
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
        this.f53899c.mo73677M();
        this.f53900d.mo73677M();
    }

    /* JADX INFO: renamed from: e */
    public final void m79224e(View view) {
        u9n0.m195106a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m79225h(final yql yqlVar, final LiveMessage liveMessage, boolean z) {
        List<SpannableStringBuilder> list = liveMessage.spanList;
        if (list != null && list.size() >= 2) {
            this.f53899c.f49609c.setPadding(0, 0, 0, 0);
            this.f53899c.m73699e(yqlVar, liveMessage, list.get(0), 2);
            this.f53900d.m73699e(yqlVar, liveMessage, list.get(1), 1);
        }
        final LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        CommonMaskAvatarView commonMaskAvatarView = this.f53897a;
        if (liveUserInfo != null) {
            biv.m104519d(commonMaskAvatarView, qa00.f156338y, nsv.m164636f(liveUserInfo).m164639c(liveUserInfo.userId, liveUserInfo.userMask, liveUserInfo.isMaskMode), true, new qcj() { // from class: l.q9n0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveUserInfo) obj).userImage;
                }
            });
        } else {
            biv.m104522g(commonMaskAvatarView, qa00.f156338y, "defaultUrl", null, null);
        }
        bnl0.m105509E0(this.f53897a, new View.OnClickListener() { // from class: l.r9n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yqlVar.mo73880e(liveUserInfo, liveMessage.seq);
            }
        });
        this.f53897a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.s9n0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f166958a.m79222f(yqlVar, liveMessage, view);
            }
        });
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if ((extInfo == null || !extInfo.isSystemReplaceMessage) && !TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            this.f53900d.f49609c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.t9n0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f172651a.m79223g(yqlVar, liveMessage, view);
                }
            });
        }
        this.f53900d.f49609c.setPadding(qa00.m175859d(12.0f), qa00.m175859d(8.0f), qa00.m175859d(12.0f), qa00.m175859d(8.0f));
        bnl0.m105554f0(this.f53899c.f49609c, qa00.m175859d(2.0f));
        bnl0.m105537U(this.f53900d, z ? 0 : qa00.m175859d(6.0f));
        bnl0.m105540X(this.f53899c, qa00.m175859d(6.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79224e(this);
        this.f53900d.setLongClickArea(IChatItemLongClickArea.LongClickArea.CONTENT);
    }

    public VoiceChatItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChatItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
