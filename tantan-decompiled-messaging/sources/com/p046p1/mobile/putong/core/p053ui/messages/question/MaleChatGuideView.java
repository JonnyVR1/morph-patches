package com.p046p1.mobile.putong.core.p053ui.messages.question;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.question.MaleChatGuideView;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.crw;
import p149l.e30;
import p149l.gu4;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qib0;
import p149l.qvy;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class MaleChatGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f32178a;

    /* JADX INFO: renamed from: b */
    public VImage f32179b;

    /* JADX INFO: renamed from: c */
    public GradientBgButton f32180c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f32181d;

    /* JADX INFO: renamed from: e */
    public VText f32182e;

    /* JADX INFO: renamed from: f */
    public VLinear f32183f;

    /* JADX INFO: renamed from: g */
    public VText f32184g;

    /* JADX INFO: renamed from: h */
    public VText f32185h;

    /* JADX INFO: renamed from: i */
    public VLinear f32186i;

    /* JADX INFO: renamed from: j */
    public VText f32187j;

    /* JADX INFO: renamed from: k */
    public VText f32188k;

    /* JADX INFO: renamed from: l */
    public VLinear f32189l;

    /* JADX INFO: renamed from: m */
    public VText f32190m;

    /* JADX INFO: renamed from: n */
    public VText f32191n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.question.MaleChatGuideView$a */
    public class C8575a implements C8524b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qvy f32192a;

        public C8575a(qvy qvyVar) {
            this.f32192a = qvyVar;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: a */
        public String mo48422a() {
            return this.f32192a.m176727p0();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: b */
        public String mo48423b() {
            return this.f32192a.m176727p0();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: c */
        public boolean mo48424c() {
            return CoreModule.m29935P().m94658i().mo158216D() && !User.isTeamAccount(this.f32192a.m176727p0());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.question.MaleChatGuideView$b */
    public interface InterfaceC8576b {
        /* JADX INFO: renamed from: a */
        void mo49606a(IceBreakingQuestion iceBreakingQuestion);
    }

    public MaleChatGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49594a(InterfaceC8576b interfaceC8576b, List list, View view) {
        interfaceC8576b.mo49606a((IceBreakingQuestion) list.get(1));
        gu4.m128025b("2", (IceBreakingQuestion) list.get(1));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49595b(qvy qvyVar, String str, View view) {
        o6j0.m162859c("e_chat_avatar", qvyVar.pageId(), o6j0.C18854a.m162878h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m29931H().userId(), str))));
        qvyVar.m176725C0("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m49597d(InterfaceC8576b interfaceC8576b, List list, View view) {
        interfaceC8576b.mo49606a((IceBreakingQuestion) list.get(2));
        gu4.m128025b("3", (IceBreakingQuestion) list.get(2));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m49598e(qvy qvyVar, String str, View view) {
        o6j0.m162859c("e_chat_avatar", qvyVar.pageId(), o6j0.C18854a.m162878h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m29931H().userId(), str))));
        qvyVar.m176725C0("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m49599f(InterfaceC8576b interfaceC8576b, List list, View view) {
        interfaceC8576b.mo49606a((IceBreakingQuestion) list.get(0));
        gu4.m128025b("1", (IceBreakingQuestion) list.get(0));
    }

    /* JADX INFO: renamed from: g */
    public final void m49600g(View view) {
        crw.m108457a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m49602i(final List<IceBreakingQuestion> list, @NonNull final InterfaceC8576b interfaceC8576b) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f32183f, list.size() > 0);
        xdl0.m208344M(this.f32186i, list.size() > 1);
        xdl0.m208344M(this.f32189l, list.size() > 2);
        if (list.size() > 0) {
            m49603j(this.f32184g, list.get(0));
        }
        if (list.size() > 1) {
            m49603j(this.f32187j, list.get(1));
        }
        if (list.size() > 2) {
            m49603j(this.f32190m, list.get(2));
        }
        gu4.m128024a(list);
        xdl0.m208329E0(this.f32185h, new View.OnClickListener() { // from class: l.wqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m49599f(interfaceC8576b, list, view);
            }
        });
        xdl0.m208329E0(this.f32188k, new View.OnClickListener() { // from class: l.xqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m49594a(interfaceC8576b, list, view);
            }
        });
        xdl0.m208329E0(this.f32191n, new View.OnClickListener() { // from class: l.yqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m49597d(interfaceC8576b, list, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m49603j(VText vText, IceBreakingQuestion iceBreakingQuestion) {
        vText.setText(iceBreakingQuestion.content);
    }

    /* JADX INFO: renamed from: k */
    public void m49604k(final qvy qvyVar, final e30<VDraweeView> e30Var, final String str) {
        if (CoreModule.m29935P().m94658i().mo158216D() && !User.isTeamAccount(qvyVar.m176727p0())) {
            C8524b.m49066r(this.f32178a, new C8575a(qvyVar), new View.OnClickListener() { // from class: l.zqw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaleChatGuideView.m49595b(qvyVar, str, view);
                }
            });
        }
        xdl0.m208329E0(this.f32178a, new View.OnClickListener() { // from class: l.arw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m49598e(qvyVar, str, view);
            }
        });
        qvyVar.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.brw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76942a.m49601h(qvyVar, e30Var, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m49601h(qvy qvyVar, e30<VDraweeView> e30Var, User user) {
        if (e30Var != null) {
            e30Var.call(this.f32178a);
        }
        qib0.f154691G.m102341Q0(this.f32178a, user.m60124fp().profileSmall());
        xdl0.m208344M(this.f32179b, false);
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            xdl0.m208344M(this.f32180c, false);
        } else {
            qvyVar.m176728q0().mo48959E().m194283y0().mo146632j(this.f32180c, this.f32179b, user);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49600g(this);
    }

    public MaleChatGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaleChatGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
