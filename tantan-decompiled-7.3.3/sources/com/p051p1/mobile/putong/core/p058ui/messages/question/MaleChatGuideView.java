package com.p051p1.mobile.putong.core.p058ui.messages.question;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.question.MaleChatGuideView;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.buw;
import p153l.fv4;
import p153l.jyb;
import p153l.n4z;
import p153l.psd0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class MaleChatGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f33026a;

    /* JADX INFO: renamed from: b */
    public VImage f33027b;

    /* JADX INFO: renamed from: c */
    public GradientBgButton f33028c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f33029d;

    /* JADX INFO: renamed from: e */
    public VText f33030e;

    /* JADX INFO: renamed from: f */
    public VLinear f33031f;

    /* JADX INFO: renamed from: g */
    public VText f33032g;

    /* JADX INFO: renamed from: h */
    public VText f33033h;

    /* JADX INFO: renamed from: i */
    public VLinear f33034i;

    /* JADX INFO: renamed from: j */
    public VText f33035j;

    /* JADX INFO: renamed from: k */
    public VText f33036k;

    /* JADX INFO: renamed from: l */
    public VLinear f33037l;

    /* JADX INFO: renamed from: m */
    public VText f33038m;

    /* JADX INFO: renamed from: n */
    public VText f33039n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.question.MaleChatGuideView$a */
    public class C8738a implements C8687b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n4z f33040a;

        public C8738a(n4z n4zVar) {
            this.f33040a = n4zVar;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: a */
        public String mo49605a() {
            return this.f33040a.m161622p0();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: b */
        public String mo49606b() {
            return this.f33040a.m161622p0();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: c */
        public boolean mo49607c() {
            return CoreModule.m30933P().m143412i().mo180308D() && !User.isTeamAccount(this.f33040a.m161622p0());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.question.MaleChatGuideView$b */
    public interface InterfaceC8739b {
        /* JADX INFO: renamed from: a */
        void mo50789a(IceBreakingQuestion iceBreakingQuestion);
    }

    public MaleChatGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50777a(InterfaceC8739b interfaceC8739b, List list, View view) {
        interfaceC8739b.mo50789a((IceBreakingQuestion) list.get(1));
        fv4.m127588b("2", (IceBreakingQuestion) list.get(1));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m50778b(n4z n4zVar, String str, View view) {
        sfj0.m185596c("e_chat_avatar", n4zVar.pageId(), sfj0.C20032a.m185615h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m30929H().userId(), str))));
        n4zVar.m161620C0("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m50780d(InterfaceC8739b interfaceC8739b, List list, View view) {
        interfaceC8739b.mo50789a((IceBreakingQuestion) list.get(2));
        fv4.m127588b("3", (IceBreakingQuestion) list.get(2));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m50781e(n4z n4zVar, String str, View view) {
        sfj0.m185596c("e_chat_avatar", n4zVar.pageId(), sfj0.C20032a.m185615h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m30929H().userId(), str))));
        n4zVar.m161620C0("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m50782f(InterfaceC8739b interfaceC8739b, List list, View view) {
        interfaceC8739b.mo50789a((IceBreakingQuestion) list.get(0));
        fv4.m127588b("1", (IceBreakingQuestion) list.get(0));
    }

    /* JADX INFO: renamed from: g */
    public final void m50783g(View view) {
        buw.m106548a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m50785i(final List<IceBreakingQuestion> list, @NonNull final InterfaceC8739b interfaceC8739b) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f33031f, list.size() > 0);
        bnl0.m105524M(this.f33034i, list.size() > 1);
        bnl0.m105524M(this.f33037l, list.size() > 2);
        if (list.size() > 0) {
            m50786j(this.f33032g, list.get(0));
        }
        if (list.size() > 1) {
            m50786j(this.f33035j, list.get(1));
        }
        if (list.size() > 2) {
            m50786j(this.f33038m, list.get(2));
        }
        fv4.m127587a(list);
        bnl0.m105509E0(this.f33033h, new View.OnClickListener() { // from class: l.vtw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m50782f(interfaceC8739b, list, view);
            }
        });
        bnl0.m105509E0(this.f33036k, new View.OnClickListener() { // from class: l.wtw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m50777a(interfaceC8739b, list, view);
            }
        });
        bnl0.m105509E0(this.f33039n, new View.OnClickListener() { // from class: l.xtw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m50780d(interfaceC8739b, list, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m50786j(VText vText, IceBreakingQuestion iceBreakingQuestion) {
        vText.setText(iceBreakingQuestion.content);
    }

    /* JADX INFO: renamed from: k */
    public void m50787k(final n4z n4zVar, final y20<VDraweeView> y20Var, final String str) {
        if (CoreModule.m30933P().m143412i().mo180308D() && !User.isTeamAccount(n4zVar.m161622p0())) {
            C8687b.m50249r(this.f33026a, new C8738a(n4zVar), new View.OnClickListener() { // from class: l.ytw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaleChatGuideView.m50778b(n4zVar, str, view);
                }
            });
        }
        bnl0.m105509E0(this.f33026a, new View.OnClickListener() { // from class: l.ztw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m50781e(n4zVar, str, view);
            }
        });
        n4zVar.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(str)).subscribe(psd0.m173596G(new y20() { // from class: l.auw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73553a.m50784h(n4zVar, y20Var, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m50784h(n4z n4zVar, y20<VDraweeView> y20Var, User user) {
        if (y20Var != null) {
            y20Var.call(this.f33026a);
        }
        uqb0.f180374G.m127125Q0(this.f33026a, user.m61308fp().profileSmall());
        bnl0.m105524M(this.f33027b, false);
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            bnl0.m105524M(this.f33028c, false);
        } else {
            n4zVar.m161623q0().mo50143F().m183232y0().mo137535j(this.f33028c, this.f33027b, user);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50783g(this);
    }

    public MaleChatGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaleChatGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
