package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageMomentGuide;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMomentGuidePhaseTwo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.bkb0;
import p149l.c3c0;
import p149l.c4g0;
import p149l.dml;
import p149l.e30;
import p149l.mkd0;
import p149l.mqi0;
import p149l.mrz;
import p149l.nvc0;
import p149l.osi0;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.ura;
import p149l.v19;
import p149l.vrz;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMomentGuidePhaseTwo extends ItemBase {

    /* JADX INFO: renamed from: A */
    public VText f31302A;

    /* JADX INFO: renamed from: B */
    public ImageView f31303B;

    /* JADX INFO: renamed from: C */
    public dml f31304C;

    /* JADX INFO: renamed from: D */
    public boolean f31305D;

    /* JADX INFO: renamed from: E */
    public String f31306E;

    /* JADX INFO: renamed from: F */
    public boolean f31307F;

    /* JADX INFO: renamed from: G */
    public c4g0 f31308G;

    /* JADX INFO: renamed from: v */
    public View f31309v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f31310w;

    /* JADX INFO: renamed from: x */
    public ImageView f31311x;

    /* JADX INFO: renamed from: y */
    public ImageView f31312y;

    /* JADX INFO: renamed from: z */
    public VText f31313z;

    public ItemMomentGuidePhaseTwo(Context context) {
        super(context);
        this.f31306E = null;
        this.f31307F = false;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m48510i(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m48512k(CoreMomentInfo coreMomentInfo, boolean z, Throwable th) {
        CoreModule.m29934N().mo60345d(th);
        CoreModule.m29934N().mo60334Yc(coreMomentInfo, OMSDialogPositon.p_chat_view, false, v19.m196541b(th), z);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m48515n(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m48520s(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m48521w(String str, int i, String str2, String str3, String str4, View view) {
        if (CoreModule.m29935P().m94658i().mo158369e4()) {
            zvf0.m220399u("e_moment", OMSDialogPositon.p_chat_view, vwb.m200311Y("live_moment_type", "revision"), vwb.m200311Y("moment_id", str), vwb.m200311Y("moment_photo_numbers", Integer.valueOf(i)), vwb.m200311Y("moment_type", str2), vwb.m200311Y("order", 0), vwb.m200311Y("owner_id", str3), vwb.m200311Y("recommend_tag_type", ""), vwb.m200311Y("report", ""), vwb.m200311Y("video_time", str4));
            Intent intentArgsToMomentDetailAct = CoreModule.m29934N().argsToMomentDetailAct(getContext(), "chat", str, str3);
            if (intentArgsToMomentDetailAct == null) {
                return;
            }
            getContext().startActivity(intentArgsToMomentDetailAct);
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m48522A(final CoreMomentInfo coreMomentInfo, View view) {
        if (coreMomentInfo == null) {
            osi0.m165783g("该动态因为隐私设置，已不可见");
        } else {
            final boolean z = coreMomentInfo.haveLiked;
            this.f31304C.mo67374c(m48525t(), CoreModule.m29934N().mo60289Kn(coreMomentInfo.owner, coreMomentInfo.f56008id, !coreMomentInfo.haveLiked, OMSDialogPositon.p_chat_view)).subscribe(mkd0.m154956H(new e30() { // from class: l.paq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147997a.m48530z(coreMomentInfo, z, (roj0) obj);
                }
            }, new e30() { // from class: l.gaq
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemMomentGuidePhaseTwo.m48512k(coreMomentInfo, z, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m48523C(final String str, final String str2) {
        if (this.f31305D) {
            return;
        }
        this.f31305D = true;
        this.f31304C.mo67374c(m48525t(), m48525t().lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.jaq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117111a.m48527v(str, str2, (C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public void m48524D(String str, String str2) {
        int i;
        final CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m29934N().mo60397us(str, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfo == null) {
            coreMomentInfo = (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(str, CoreMomentInfo.JSON_ADAPTER);
            mkd0.m154992z(this.f31308G);
            this.f31308G = CoreModule.m29934N().momentRefresh(str2, str, CoreMomentInfo.JSON_ADAPTER).filter(new w9j() { // from class: l.kaq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((CoreMomentInfo) obj));
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.laq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127234a.m48528x((CoreMomentInfo) obj);
                }
            }, new e30() { // from class: l.maq
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemMomentGuidePhaseTwo.m48520s((Throwable) obj);
                }
            }));
        }
        if (NullChecker.m81303a(coreMomentInfo)) {
            if (coreMomentInfo.haveLiked) {
                i = ura.m195053e().m195057d().mo33699I4() ? c3c0.f78681Y4 : c3c0.f78673X4;
            } else {
                i = ura.m195053e().m195057d().mo33699I4() ? c3c0.f78734e5 : c3c0.f78725d5;
            }
            this.f31303B.setImageResource(i);
        } else {
            this.f31303B.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78734e5 : c3c0.f78725d5);
        }
        if (NullChecker.m81303a(this.f31303B.getParent()) && ((View) this.f31303B.getParent()).getTouchDelegate() == null) {
            this.f31303B.post(new Runnable() { // from class: l.naq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137928a.m48529y();
                }
            });
        }
        xdl0.m208329E0(this.f31303B, new View.OnClickListener() { // from class: l.oaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142857a.m48522A(coreMomentInfo, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, Message message, Message message2, Message message3) {
        MessageMomentGuide messageMomentGuide;
        final int size;
        String str;
        super.mo48034g(dmlVar, message, message2, message3);
        this.f31304C = dmlVar;
        try {
            messageMomentGuide = !TextUtils.isEmpty(message.msgData) ? MessageMomentGuide.JSON_ADAPTER.parse(message.msgData) : null;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        if (!TextUtils.equals(this.f31306E, message.f56011id)) {
            this.f31306E = message.f56011id;
            this.f31307F = false;
            this.f31305D = false;
            xdl0.m208344M(this.f31312y, false);
            xdl0.m208344M(this.f31311x, false);
        }
        boolean zM81303a = NullChecker.m81303a(messageMomentGuide);
        View view = this.f31309v;
        if (!zM81303a) {
            view.setOnClickListener(null);
            this.f31309v.setOnLongClickListener(null);
            this.f31309v.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        final String str2 = messageMomentGuide.f20446id;
        final String str3 = messageMomentGuide.ownerId;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str3);
        String str4 = (userM169430Pa == null || userM169430Pa.isFemale()) ? "她发布了动态" : "他发布了动态";
        this.f31313z.setText(mqi0.f135261m.format(new Date((long) messageMomentGuide.createdTime)));
        VText vText = this.f31302A;
        if (!TextUtils.isEmpty(messageMomentGuide.desc)) {
            str4 = messageMomentGuide.desc;
        }
        vText.setText(str4);
        this.f31309v.setOnLongClickListener(null);
        nvc0 nvc0Var = new nvc0(t100.m186890d(80.0f), t100.m186890d(80.0f));
        if (messageMomentGuide.type != 1 || vwb.m200296J(messageMomentGuide.imageUrlList)) {
            if (messageMomentGuide.type == 2 && !vwb.m200296J(messageMomentGuide.imageUrlList)) {
                this.f31311x.setVisibility(0);
                qib0.f154691G.m102337O0(this.f31310w, messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, null);
                m48526u(messageMomentGuide);
            } else if (messageMomentGuide.type == 4) {
                bkb0 bkb0Var = qib0.f154691G;
                VDraweeView vDraweeView = this.f31310w;
                StringBuilder sb = new StringBuilder("res://");
                sb.append(CoreModule.f17544b.getPackageName());
                sb.append("/");
                sb.append(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78752g5 : c3c0.f78743f5);
                bkb0Var.m102331L0(vDraweeView, sb.toString());
            } else {
                bkb0 bkb0Var2 = qib0.f154691G;
                VDraweeView vDraweeView2 = this.f31310w;
                StringBuilder sb2 = new StringBuilder("res://");
                sb2.append(CoreModule.f17544b.getPackageName());
                sb2.append("/");
                sb2.append(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78716c5 : c3c0.f78707b5);
                bkb0Var2.m102331L0(vDraweeView2, sb2.toString());
            }
            size = 0;
        } else {
            size = messageMomentGuide.imageUrlList.size();
            qib0.f154691G.m102337O0(this.f31310w, messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, null);
            xdl0.m208344M(this.f31312y, size > 1);
            m48526u(messageMomentGuide);
        }
        m48523C(str2, str3);
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
        if (!this.f31307F) {
            this.f31307F = true;
            zvf0.m220368A("e_moment", OMSDialogPositon.p_chat_view, vwb.m200311Y("live_moment_type", "revision"), vwb.m200311Y("moment_id", str2), vwb.m200311Y("moment_photo_numbers", Integer.valueOf(size)), vwb.m200311Y("moment_type", str), vwb.m200311Y("order", 0), vwb.m200311Y("owner_id", str3), vwb.m200311Y("recommend_tag_type", ""), vwb.m200311Y("report", ""), vwb.m200311Y("video_time", str5));
        }
        final String str6 = str;
        xdl0.m208329E0(this.f31309v, new View.OnClickListener() { // from class: l.faq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f96641a.m48521w(str2, size, str6, str3, str5, view2);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31307F = false;
        mkd0.m154992z(this.f31308G);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31309v = findViewById(y4c0.f196081Z);
        this.f31310w = (VDraweeView) findViewById(y4c0.f196209r2);
        this.f31311x = (ImageView) findViewById(y4c0.f196168l3);
        this.f31312y = (ImageView) findViewById(y4c0.f196244w2);
        this.f31313z = (VText) findViewById(y4c0.f196038R4);
        this.f31302A = (VText) findViewById(y4c0.f195931A2);
        this.f31303B = (ImageView) findViewById(y4c0.f195999L1);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31313z.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31302A.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31312y.setImageResource(c3c0.f78689Z4);
            this.f31303B.setImageResource(c3c0.f78734e5);
            xdl0.m208346N(this.f31311x, c3c0.f78698a5);
            xdl0.m208346N(this.f31310w, c3c0.f78716c5);
        }
    }

    /* JADX INFO: renamed from: t */
    public Act m48525t() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: u */
    public final void m48526u(MessageMomentGuide messageMomentGuide) {
        ConversationAdditional conversationAdditional;
        vrz vrzVarMo48973j0;
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(messageMomentGuide.ownerId);
        if (conversationM32856Xe == null || (conversationAdditional = conversationM32856Xe.additional) == null || conversationAdditional.localMomentInfo == null || (vrzVarMo48973j0 = ((MessagesAct) m48525t()).f31640f.m156455e0().mo48973j0()) == null || !vrzVarMo48973j0.f182793b || v19.m196542c((long) conversationM32856Xe.additional.localMomentInfo.lastMomentExpandedTime)) {
            return;
        }
        conversationM32856Xe.additional.localMomentInfo.lastMomentExpandedTime = mqi0.m155944o();
        mrz.m156105n(conversationM32856Xe.mo223809clone()).subscribe(mkd0.m154956H(new e30() { // from class: l.haq
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemMomentGuidePhaseTwo.m48510i((roj0) obj);
            }
        }, new e30() { // from class: l.iaq
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemMomentGuidePhaseTwo.m48515n((Throwable) obj);
            }
        }));
        vrzVarMo48973j0.m156457g0().m147186e0(messageMomentGuide, this);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m48527v(String str, String str2, C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m48524D(str, str2);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m48528x(CoreMomentInfo coreMomentInfo) {
        int i;
        if (coreMomentInfo.haveLiked) {
            i = ura.m195053e().m195057d().mo33699I4() ? c3c0.f78681Y4 : c3c0.f78673X4;
        } else {
            i = ura.m195053e().m195057d().mo33699I4() ? c3c0.f78734e5 : c3c0.f78725d5;
        }
        this.f31303B.setImageResource(i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m48529y() {
        Rect rect = new Rect();
        this.f31303B.getHitRect(rect);
        int i = rect.top;
        int i2 = t100.f167263l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f31303B.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f31303B));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m48530z(CoreMomentInfo coreMomentInfo, boolean z, roj0 roj0Var) {
        int i;
        boolean z2 = coreMomentInfo.haveLiked;
        coreMomentInfo.haveLiked = !z2;
        if (z2) {
            i = ura.m195053e().m195057d().mo33699I4() ? c3c0.f78734e5 : c3c0.f78725d5;
        } else {
            i = ura.m195053e().m195057d().mo33699I4() ? c3c0.f78681Y4 : c3c0.f78673X4;
        }
        this.f31303B.setImageResource(i);
        if (coreMomentInfo.haveLiked) {
            mrz.m156102k(m48525t(), coreMomentInfo);
        }
        CoreModule.m29934N().mo60334Yc(coreMomentInfo, OMSDialogPositon.p_chat_view, false, 201, z);
    }

    public ItemMomentGuidePhaseTwo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31306E = null;
        this.f31307F = false;
    }

    public ItemMomentGuidePhaseTwo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31306E = null;
        this.f31307F = false;
    }
}
