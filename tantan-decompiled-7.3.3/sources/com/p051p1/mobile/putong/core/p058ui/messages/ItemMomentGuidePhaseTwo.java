package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageMomentGuide;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMomentGuidePhaseTwo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.e39;
import p153l.edc0;
import p153l.fsb0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.j000;
import p153l.jyb;
import p153l.kcg0;
import p153l.pol;
import p153l.psd0;
import p153l.pzi0;
import p153l.q3d0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.s000;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMomentGuidePhaseTwo extends ItemBase {

    /* JADX INFO: renamed from: A */
    public VText f32150A;

    /* JADX INFO: renamed from: B */
    public ImageView f32151B;

    /* JADX INFO: renamed from: C */
    public pol f32152C;

    /* JADX INFO: renamed from: D */
    public boolean f32153D;

    /* JADX INFO: renamed from: E */
    public String f32154E;

    /* JADX INFO: renamed from: F */
    public boolean f32155F;

    /* JADX INFO: renamed from: G */
    public kcg0 f32156G;

    /* JADX INFO: renamed from: v */
    public View f32157v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f32158w;

    /* JADX INFO: renamed from: x */
    public ImageView f32159x;

    /* JADX INFO: renamed from: y */
    public ImageView f32160y;

    /* JADX INFO: renamed from: z */
    public VText f32161z;

    public ItemMomentGuidePhaseTwo(Context context) {
        super(context);
        this.f32154E = null;
        this.f32155F = false;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m49693i(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m49695k(CoreMomentInfo coreMomentInfo, boolean z, Throwable th) {
        CoreModule.m30932N().mo61529d(th);
        CoreModule.m30932N().mo61518Yc(coreMomentInfo, OMSDialogPositon.p_chat_view, false, e39.m119255b(th), z);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m49698n(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m49703s(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m49704w(String str, int i, String str2, String str3, String str4, View view) {
        if (CoreModule.m30933P().m143412i().mo180461e4()) {
            i4g0.m138523u("e_moment", OMSDialogPositon.p_chat_view, jyb.m147494Y("live_moment_type", "revision"), jyb.m147494Y("moment_id", str), jyb.m147494Y("moment_photo_numbers", Integer.valueOf(i)), jyb.m147494Y("moment_type", str2), jyb.m147494Y("order", 0), jyb.m147494Y("owner_id", str3), jyb.m147494Y("recommend_tag_type", ""), jyb.m147494Y("report", ""), jyb.m147494Y("video_time", str4));
            Intent intentArgsToMomentDetailAct = CoreModule.m30932N().argsToMomentDetailAct(getContext(), "chat", str, str3);
            if (intentArgsToMomentDetailAct == null) {
                return;
            }
            getContext().startActivity(intentArgsToMomentDetailAct);
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m49705A(final CoreMomentInfo coreMomentInfo, View view) {
        if (coreMomentInfo == null) {
            r1j0.m179420g("该动态因为隐私设置，已不可见");
        } else {
            final boolean z = coreMomentInfo.haveLiked;
            this.f32152C.mo68557c(m49708t(), CoreModule.m30932N().mo61473Kn(coreMomentInfo.owner, coreMomentInfo.f56856id, !coreMomentInfo.haveLiked, OMSDialogPositon.p_chat_view)).subscribe(psd0.m173597H(new y20() { // from class: l.pcq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151622a.m49713z(coreMomentInfo, z, (uxj0) obj);
                }
            }, new y20() { // from class: l.gcq
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemMomentGuidePhaseTwo.m49695k(coreMomentInfo, z, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m49706C(final String str, final String str2) {
        if (this.f32153D) {
            return;
        }
        this.f32153D = true;
        this.f32152C.mo68557c(m49708t(), m49708t().lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.jcq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120085a.m49710v(str, str2, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public void m49707D(String str, String str2) {
        int i;
        final CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m30932N().mo61581us(str, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfo == null) {
            coreMomentInfo = (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(str, CoreMomentInfo.JSON_ADAPTER);
            psd0.m173633z(this.f32156G);
            this.f32156G = CoreModule.m30932N().momentRefresh(str2, str, CoreMomentInfo.JSON_ADAPTER).filter(new qcj() { // from class: l.kcq
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((CoreMomentInfo) obj));
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.lcq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f131374a.m49711x((CoreMomentInfo) obj);
                }
            }, new y20() { // from class: l.mcq
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemMomentGuidePhaseTwo.m49703s((Throwable) obj);
                }
            }));
        }
        if (NullChecker.m82486a(coreMomentInfo)) {
            if (coreMomentInfo.haveLiked) {
                i = gta.m132210e().m132214d().mo34702I4() ? ibc0.f113956Y4 : ibc0.f113948X4;
            } else {
                i = gta.m132210e().m132214d().mo34702I4() ? ibc0.f114009e5 : ibc0.f114000d5;
            }
            this.f32151B.setImageResource(i);
        } else {
            this.f32151B.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114009e5 : ibc0.f114000d5);
        }
        if (NullChecker.m82486a(this.f32151B.getParent()) && ((View) this.f32151B.getParent()).getTouchDelegate() == null) {
            this.f32151B.post(new Runnable() { // from class: l.ncq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141393a.m49712y();
                }
            });
        }
        bnl0.m105509E0(this.f32151B, new View.OnClickListener() { // from class: l.ocq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146726a.m49705A(coreMomentInfo, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, Message message, Message message2, Message message3) {
        MessageMomentGuide messageMomentGuide;
        final int size;
        String str;
        super.mo49217g(polVar, message, message2, message3);
        this.f32152C = polVar;
        try {
            messageMomentGuide = !TextUtils.isEmpty(message.msgData) ? MessageMomentGuide.JSON_ADAPTER.parse(message.msgData) : null;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        if (!TextUtils.equals(this.f32154E, message.f56859id)) {
            this.f32154E = message.f56859id;
            this.f32155F = false;
            this.f32153D = false;
            bnl0.m105524M(this.f32160y, false);
            bnl0.m105524M(this.f32159x, false);
        }
        boolean zM82486a = NullChecker.m82486a(messageMomentGuide);
        View view = this.f32157v;
        if (!zM82486a) {
            view.setOnClickListener(null);
            this.f32157v.setOnLongClickListener(null);
            this.f32157v.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        final String str2 = messageMomentGuide.f21188id;
        final String str3 = messageMomentGuide.ownerId;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str3);
        String str4 = (userM116503Pa == null || userM116503Pa.isFemale()) ? "她发布了动态" : "他发布了动态";
        this.f32161z.setText(pzi0.f154866m.format(new Date((long) messageMomentGuide.createdTime)));
        VText vText = this.f32150A;
        if (!TextUtils.isEmpty(messageMomentGuide.desc)) {
            str4 = messageMomentGuide.desc;
        }
        vText.setText(str4);
        this.f32157v.setOnLongClickListener(null);
        q3d0 q3d0Var = new q3d0(qa00.m175859d(80.0f), qa00.m175859d(80.0f));
        if (messageMomentGuide.type != 1 || jyb.m147479J(messageMomentGuide.imageUrlList)) {
            if (messageMomentGuide.type == 2 && !jyb.m147479J(messageMomentGuide.imageUrlList)) {
                this.f32159x.setVisibility(0);
                uqb0.f180374G.m127121O0(this.f32158w, messageMomentGuide.imageUrlList.get(0), true, false, q3d0Var, null);
                m49709u(messageMomentGuide);
            } else if (messageMomentGuide.type == 4) {
                fsb0 fsb0Var = uqb0.f180374G;
                VDraweeView vDraweeView = this.f32158w;
                StringBuilder sb = new StringBuilder("res://");
                sb.append(CoreModule.f18263b.getPackageName());
                sb.append("/");
                sb.append(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114027g5 : ibc0.f114018f5);
                fsb0Var.m127115L0(vDraweeView, sb.toString());
            } else {
                fsb0 fsb0Var2 = uqb0.f180374G;
                VDraweeView vDraweeView2 = this.f32158w;
                StringBuilder sb2 = new StringBuilder("res://");
                sb2.append(CoreModule.f18263b.getPackageName());
                sb2.append("/");
                sb2.append(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113991c5 : ibc0.f113982b5);
                fsb0Var2.m127115L0(vDraweeView2, sb2.toString());
            }
            size = 0;
        } else {
            size = messageMomentGuide.imageUrlList.size();
            uqb0.f180374G.m127121O0(this.f32158w, messageMomentGuide.imageUrlList.get(0), true, false, q3d0Var, null);
            bnl0.m105524M(this.f32160y, size > 1);
            m49709u(messageMomentGuide);
        }
        m49706C(str2, str3);
        int i = messageMomentGuide.type;
        if (i == 4) {
            str = "voice";
        } else if (i == 1) {
            str = ReminderAction.photo;
        } else if (i == 2) {
            str = "video";
        } else {
            str = i == 3 ? "word" : "";
        }
        final String str5 = messageMomentGuide.videoDuration;
        if (!this.f32155F) {
            this.f32155F = true;
            i4g0.m138492A("e_moment", OMSDialogPositon.p_chat_view, jyb.m147494Y("live_moment_type", "revision"), jyb.m147494Y("moment_id", str2), jyb.m147494Y("moment_photo_numbers", Integer.valueOf(size)), jyb.m147494Y("moment_type", str), jyb.m147494Y("order", 0), jyb.m147494Y("owner_id", str3), jyb.m147494Y("recommend_tag_type", ""), jyb.m147494Y("report", ""), jyb.m147494Y("video_time", str5));
        }
        final String str6 = str;
        bnl0.m105509E0(this.f32157v, new View.OnClickListener() { // from class: l.fcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98249a.m49704w(str2, size, str6, str3, str5, view2);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32155F = false;
        psd0.m173633z(this.f32156G);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32157v = findViewById(edc0.f93316Z);
        this.f32158w = (VDraweeView) findViewById(edc0.f93444r2);
        this.f32159x = (ImageView) findViewById(edc0.f93403l3);
        this.f32160y = (ImageView) findViewById(edc0.f93479w2);
        this.f32161z = (VText) findViewById(edc0.f93273R4);
        this.f32150A = (VText) findViewById(edc0.f93166A2);
        this.f32151B = (ImageView) findViewById(edc0.f93234L1);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32161z.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32150A.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32160y.setImageResource(ibc0.f113964Z4);
            this.f32151B.setImageResource(ibc0.f114009e5);
            bnl0.m105526N(this.f32159x, ibc0.f113973a5);
            bnl0.m105526N(this.f32158w, ibc0.f113991c5);
        }
    }

    /* JADX INFO: renamed from: t */
    public Act m49708t() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: u */
    public final void m49709u(MessageMomentGuide messageMomentGuide) {
        ConversationAdditional conversationAdditional;
        s000 s000VarMo50157k0;
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(messageMomentGuide.ownerId);
        if (conversationM33859Xe == null || (conversationAdditional = conversationM33859Xe.additional) == null || conversationAdditional.localMomentInfo == null || (s000VarMo50157k0 = ((MessagesAct) m49708t()).f32488f.m143372e0().mo50157k0()) == null || !s000VarMo50157k0.f165649b || e39.m119256c((long) conversationM33859Xe.additional.localMomentInfo.lastMomentExpandedTime)) {
            return;
        }
        conversationM33859Xe.additional.localMomentInfo.lastMomentExpandedTime = pzi0.m174454o();
        j000.m142895n(conversationM33859Xe.mo225055clone()).subscribe(psd0.m173597H(new y20() { // from class: l.hcq
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemMomentGuidePhaseTwo.m49693i((uxj0) obj);
            }
        }, new y20() { // from class: l.icq
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemMomentGuidePhaseTwo.m49698n((Throwable) obj);
            }
        }));
        s000VarMo50157k0.m143374g0().m133257e0(messageMomentGuide, this);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m49710v(String str, String str2, C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m49707D(str, str2);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m49711x(CoreMomentInfo coreMomentInfo) {
        int i;
        if (coreMomentInfo.haveLiked) {
            i = gta.m132210e().m132214d().mo34702I4() ? ibc0.f113956Y4 : ibc0.f113948X4;
        } else {
            i = gta.m132210e().m132214d().mo34702I4() ? ibc0.f114009e5 : ibc0.f114000d5;
        }
        this.f32151B.setImageResource(i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m49712y() {
        Rect rect = new Rect();
        this.f32151B.getHitRect(rect);
        int i = rect.top;
        int i2 = qa00.f156325l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f32151B.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f32151B));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m49713z(CoreMomentInfo coreMomentInfo, boolean z, uxj0 uxj0Var) {
        int i;
        boolean z2 = coreMomentInfo.haveLiked;
        coreMomentInfo.haveLiked = !z2;
        if (z2) {
            i = gta.m132210e().m132214d().mo34702I4() ? ibc0.f114009e5 : ibc0.f114000d5;
        } else {
            i = gta.m132210e().m132214d().mo34702I4() ? ibc0.f113956Y4 : ibc0.f113948X4;
        }
        this.f32151B.setImageResource(i);
        if (coreMomentInfo.haveLiked) {
            j000.m142892k(m49708t(), coreMomentInfo);
        }
        CoreModule.m30932N().mo61518Yc(coreMomentInfo, OMSDialogPositon.p_chat_view, false, 201, z);
    }

    public ItemMomentGuidePhaseTwo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32154E = null;
        this.f32155F = false;
    }

    public ItemMomentGuidePhaseTwo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32154E = null;
        this.f32155F = false;
    }
}
