package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMomentGuidePhaseTwo;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageMomentGuide;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import l.a1c0;
import l.bkb0;
import l.c3c0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.nvc0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.ura;
import l.v19;
import l.vrz;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.ym2;
import l.zvf0;
import org.eclipse.jetty.http.HttpStatus;
import p003l.c4g0;
import p003l.dml;
import p003l.e30;
import p003l.ksz;
import p003l.m250;
import p003l.mrz;
import p003l.w9j;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMomentGuidePhaseTwo extends ItemBase {

    /* JADX INFO: renamed from: A */
    public VText f1193A;

    /* JADX INFO: renamed from: B */
    public ImageView f1194B;

    /* JADX INFO: renamed from: C */
    public dml f1195C;

    /* JADX INFO: renamed from: D */
    public boolean f1196D;

    /* JADX INFO: renamed from: E */
    public String f1197E;

    /* JADX INFO: renamed from: F */
    public boolean f1198F;

    /* JADX INFO: renamed from: G */
    public c4g0 f1199G;

    /* JADX INFO: renamed from: v */
    public View f1200v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f1201w;

    /* JADX INFO: renamed from: x */
    public ImageView f1202x;

    /* JADX INFO: renamed from: y */
    public ImageView f1203y;

    /* JADX INFO: renamed from: z */
    public VText f1204z;

    public ItemMomentGuidePhaseTwo(Context context) {
        super(context);
        this.f1197E = null;
        this.f1198F = false;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m1594i(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m1596k(CoreMomentInfo coreMomentInfo, boolean z, Throwable th) {
        CoreModule.N().d(th);
        CoreModule.N().Yc(coreMomentInfo, "p_chat_view", false, v19.b(th), z);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m1599n(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m1604s(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m1605w(String str, int i, String str2, String str3, String str4, View view) {
        if (CoreModule.P().i().e4()) {
            zvf0.u("e_moment", "p_chat_view", new j760[]{vwb.Y("live_moment_type", "revision"), vwb.Y("moment_id", str), vwb.Y("moment_photo_numbers", Integer.valueOf(i)), vwb.Y("moment_type", str2), vwb.Y("order", 0), vwb.Y("owner_id", str3), vwb.Y("recommend_tag_type", ""), vwb.Y("report", ""), vwb.Y("video_time", str4)});
            Intent intentArgsToMomentDetailAct = CoreModule.N().argsToMomentDetailAct(getContext(), "chat", str, str3);
            if (intentArgsToMomentDetailAct == null) {
                return;
            }
            getContext().startActivity(intentArgsToMomentDetailAct);
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m1606A(final CoreMomentInfo coreMomentInfo, View view) {
        if (coreMomentInfo == null) {
            osi0.g("该动态因为隐私设置，已不可见");
        } else {
            final boolean z = coreMomentInfo.haveLiked;
            this.f1195C.mo3522c(m1609t(), CoreModule.N().Kn(coreMomentInfo.owner, ((CopyObject) coreMomentInfo).id, !coreMomentInfo.haveLiked, "p_chat_view")).subscribe((m250) mkd0.H(new e30() { // from class: l.paq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6337a.m1614z(coreMomentInfo, z, (roj0) obj);
                }
            }, new e30() { // from class: l.gaq
                @Override // p003l.e30
                public final void call(Object obj) {
                    ItemMomentGuidePhaseTwo.m1596k(coreMomentInfo, z, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1607C(final String str, final String str2) {
        if (this.f1196D) {
            return;
        }
        this.f1196D = true;
        this.f1195C.mo3522c(m1609t(), m1609t().lifecycle()).subscribe((m250) mkd0.G(new e30() { // from class: l.jaq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4600a.m1611v(str, str2, (c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public void m1608D(String str, String str2) {
        int i;
        final CoreMomentInfo coreMomentInfoUs = CoreModule.N().us(str, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfoUs == null) {
            coreMomentInfoUs = (CoreMomentInfo) CoreModule.N().Mh(str, CoreMomentInfo.JSON_ADAPTER);
            mkd0.z(this.f1199G);
            this.f1199G = CoreModule.N().momentRefresh(str2, str, CoreMomentInfo.JSON_ADAPTER).filter(new w9j() { // from class: l.kaq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((CoreMomentInfo) obj));
                }
            }).subscribe((m250) mkd0.H(new e30() { // from class: l.laq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f5236a.m1612x((CoreMomentInfo) obj);
                }
            }, new e30() { // from class: l.maq
                @Override // p003l.e30
                public final void call(Object obj) {
                    ItemMomentGuidePhaseTwo.m1604s((Throwable) obj);
                }
            }));
        }
        if (NullChecker.a(coreMomentInfoUs)) {
            if (coreMomentInfoUs.haveLiked) {
                i = ura.e().d().I4() ? c3c0.Y4 : c3c0.X4;
            } else {
                i = ura.e().d().I4() ? c3c0.e5 : c3c0.d5;
            }
            this.f1194B.setImageResource(i);
        } else {
            this.f1194B.setImageResource(ura.e().d().I4() ? c3c0.e5 : c3c0.d5);
        }
        if (NullChecker.a(this.f1194B.getParent()) && ((View) this.f1194B.getParent()).getTouchDelegate() == null) {
            this.f1194B.post(new Runnable() { // from class: l.naq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5854a.m1613y();
                }
            });
        }
        xdl0.E0(this.f1194B, new View.OnClickListener() { // from class: l.oaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6075a.m1606A(coreMomentInfoUs, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, Message message, Message message2, Message message3) {
        MessageMomentGuide messageMomentGuide;
        final int size;
        String str;
        super.mo1114g(dmlVar, message, message2, message3);
        this.f1195C = dmlVar;
        try {
            messageMomentGuide = !TextUtils.isEmpty(message.msgData) ? (MessageMomentGuide) MessageMomentGuide.JSON_ADAPTER.parse(message.msgData) : null;
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        if (!TextUtils.equals(this.f1197E, ((DbObject) message).id)) {
            this.f1197E = ((DbObject) message).id;
            this.f1198F = false;
            this.f1196D = false;
            xdl0.M(this.f1203y, false);
            xdl0.M(this.f1202x, false);
        }
        boolean zA = NullChecker.a(messageMomentGuide);
        View view = this.f1200v;
        if (!zA) {
            view.setOnClickListener(null);
            this.f1200v.setOnLongClickListener(null);
            this.f1200v.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        final String str2 = messageMomentGuide.id;
        final String str3 = messageMomentGuide.ownerId;
        User userPa = CoreModule.c.e0.Pa(str3);
        CharSequence charSequence = (userPa == null || userPa.isFemale()) ? "她发布了动态" : "他发布了动态";
        this.f1204z.setText(mqi0.m.format(new Date((long) messageMomentGuide.createdTime)));
        AppCompatTextView appCompatTextView = this.f1193A;
        if (!TextUtils.isEmpty(messageMomentGuide.desc)) {
            charSequence = messageMomentGuide.desc;
        }
        appCompatTextView.setText(charSequence);
        this.f1200v.setOnLongClickListener(null);
        nvc0 nvc0Var = new nvc0(t100.d(80.0f), t100.d(80.0f));
        if (messageMomentGuide.type != 1 || vwb.J(messageMomentGuide.imageUrlList)) {
            if (messageMomentGuide.type == 2 && !vwb.J(messageMomentGuide.imageUrlList)) {
                this.f1202x.setVisibility(0);
                qib0.G.O0(this.f1201w, (String) messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, (ym2) null);
                m1610u(messageMomentGuide);
            } else if (messageMomentGuide.type == 4) {
                bkb0 bkb0Var = qib0.G;
                VDraweeView vDraweeView = this.f1201w;
                StringBuilder sb = new StringBuilder("res://");
                sb.append(CoreModule.b.getPackageName());
                sb.append("/");
                sb.append(ura.e().d().I4() ? c3c0.g5 : c3c0.f5);
                bkb0Var.L0(vDraweeView, sb.toString());
            } else {
                bkb0 bkb0Var2 = qib0.G;
                VDraweeView vDraweeView2 = this.f1201w;
                StringBuilder sb2 = new StringBuilder("res://");
                sb2.append(CoreModule.b.getPackageName());
                sb2.append("/");
                sb2.append(ura.e().d().I4() ? c3c0.c5 : c3c0.b5);
                bkb0Var2.L0(vDraweeView2, sb2.toString());
            }
            size = 0;
        } else {
            size = messageMomentGuide.imageUrlList.size();
            qib0.G.O0(this.f1201w, (String) messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, (ym2) null);
            xdl0.M(this.f1203y, size > 1);
            m1610u(messageMomentGuide);
        }
        m1607C(str2, str3);
        int i = messageMomentGuide.type;
        if (i == 4) {
            str = "voice";
        } else if (i == 1) {
            str = "photo";
        } else if (i == 2) {
            str = "video";
        } else {
            str = i == 3 ? "word" : "";
        }
        final String str4 = messageMomentGuide.videoDuration;
        if (!this.f1198F) {
            this.f1198F = true;
            zvf0.A("e_moment", "p_chat_view", new j760[]{vwb.Y("live_moment_type", "revision"), vwb.Y("moment_id", str2), vwb.Y("moment_photo_numbers", Integer.valueOf(size)), vwb.Y("moment_type", str), vwb.Y("order", 0), vwb.Y("owner_id", str3), vwb.Y("recommend_tag_type", ""), vwb.Y("report", ""), vwb.Y("video_time", str4)});
        }
        final String str5 = str;
        xdl0.E0(this.f1200v, new View.OnClickListener() { // from class: l.faq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f3477a.m1605w(str2, size, str5, str3, str4, view2);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1198F = false;
        mkd0.z(this.f1199G);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1200v = findViewById(y4c0.Z);
        this.f1201w = (VDraweeView) findViewById(y4c0.r2);
        this.f1202x = (ImageView) findViewById(y4c0.l3);
        this.f1203y = (ImageView) findViewById(y4c0.w2);
        this.f1204z = (VText) findViewById(y4c0.R4);
        this.f1193A = (VText) findViewById(y4c0.A2);
        this.f1194B = (ImageView) findViewById(y4c0.L1);
        if (ura.e().d().I4()) {
            this.f1204z.setTextColor(getResources().getColor(a1c0.i));
            this.f1193A.setTextColor(getResources().getColor(a1c0.g));
            this.f1203y.setImageResource(c3c0.Z4);
            this.f1194B.setImageResource(c3c0.e5);
            xdl0.N(this.f1202x, c3c0.a5);
            xdl0.N(this.f1201w, c3c0.c5);
        }
    }

    /* JADX INFO: renamed from: t */
    public Act m1609t() {
        return getContext();
    }

    /* JADX INFO: renamed from: u */
    public final void m1610u(MessageMomentGuide messageMomentGuide) {
        ConversationAdditional conversationAdditional;
        vrz vrzVarMo2065j0;
        Conversation conversationXe = CoreModule.c.f0.Xe(messageMomentGuide.ownerId);
        if (conversationXe == null || (conversationAdditional = conversationXe.additional) == null || conversationAdditional.localMomentInfo == null || (vrzVarMo2065j0 = m1609t().f1531f.m6497e0().mo2065j0()) == null || !vrzVarMo2065j0.b || v19.c((long) conversationXe.additional.localMomentInfo.lastMomentExpandedTime)) {
            return;
        }
        conversationXe.additional.localMomentInfo.lastMomentExpandedTime = mqi0.o();
        mrz.m6463n(conversationXe.clone()).subscribe((m250<? super roj0>) mkd0.H(new e30() { // from class: l.haq
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemMomentGuidePhaseTwo.m1594i((roj0) obj);
            }
        }, new e30() { // from class: l.iaq
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemMomentGuidePhaseTwo.m1599n((Throwable) obj);
            }
        }));
        ((ksz) vrzVarMo2065j0.m6499g0()).m5834e0(messageMomentGuide, this);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m1611v(String str, String str2, c cVar) {
        if (cVar == c.i) {
            m1608D(str, str2);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m1612x(CoreMomentInfo coreMomentInfo) {
        int i;
        if (coreMomentInfo.haveLiked) {
            i = ura.e().d().I4() ? c3c0.Y4 : c3c0.X4;
        } else {
            i = ura.e().d().I4() ? c3c0.e5 : c3c0.d5;
        }
        this.f1194B.setImageResource(i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m1613y() {
        Rect rect = new Rect();
        this.f1194B.getHitRect(rect);
        int i = rect.top;
        int i2 = t100.l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f1194B.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f1194B));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m1614z(CoreMomentInfo coreMomentInfo, boolean z, roj0 roj0Var) {
        int i;
        boolean z2 = coreMomentInfo.haveLiked;
        coreMomentInfo.haveLiked = !z2;
        if (z2) {
            i = ura.e().d().I4() ? c3c0.e5 : c3c0.d5;
        } else {
            i = ura.e().d().I4() ? c3c0.Y4 : c3c0.X4;
        }
        this.f1194B.setImageResource(i);
        if (coreMomentInfo.haveLiked) {
            mrz.m6460k(m1609t(), coreMomentInfo);
        }
        CoreModule.N().Yc(coreMomentInfo, "p_chat_view", false, HttpStatus.CREATED_201, z);
    }

    public ItemMomentGuidePhaseTwo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1197E = null;
        this.f1198F = false;
    }

    public ItemMomentGuidePhaseTwo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1197E = null;
        this.f1198F = false;
    }
}
