package com.p051p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchHeadLayout;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.g56;
import p153l.g96;
import p153l.i4g0;
import p153l.jyb;
import p153l.o56;
import p153l.pf60;
import p153l.pkb;
import p153l.psd0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookMatchHeadLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f26060a;

    /* JADX INFO: renamed from: b */
    public VText f26061b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f26062c;

    /* JADX INFO: renamed from: d */
    public ImageView f26063d;

    /* JADX INFO: renamed from: e */
    public TextView f26064e;

    /* JADX INFO: renamed from: f */
    public TextView f26065f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f26066g;

    /* JADX INFO: renamed from: h */
    public ImageView f26067h;

    /* JADX INFO: renamed from: i */
    public TextView f26068i;

    /* JADX INFO: renamed from: j */
    public TextView f26069j;

    /* JADX INFO: renamed from: k */
    public VText f26070k;

    public ConversationAddressBookMatchHeadLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m42885a(g56 g56Var, List list, View view) {
        i4g0.m138523u("e_contacts_all_matches_entrance", g56Var.m158457J(), pf60.m172085a("remote_count", Integer.valueOf(list.size())));
        g96.m129514a(g56Var.f136922m, list.size());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m42888d(g56 g56Var, View view) {
        i4g0.m138520r("e_search_entrance", g56Var.m158457J());
        g56Var.m158461N();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m42889e(g56 g56Var, vg60 vg60Var, View view) {
        i4g0.m138523u("e_contacts_unmatch_entrance", g56Var.m158457J(), pf60.m172085a("remote_count", Integer.valueOf(vg60Var.f184001a.size())));
        Act act = g56Var.f136922m;
        act.startActivity(ConversationAddressBookUnMatchAct.m42894a2(act));
    }

    /* JADX INFO: renamed from: f */
    public final void m42890f(View view) {
        o56.m166091a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m42891g(final g56 g56Var, final vg60 vg60Var) {
        boolean zM147479J = jyb.m147479J(vg60Var.f184001a);
        TextView textView = this.f26068i;
        if (zM147479J) {
            textView.setText("解除的配对");
        } else {
            textView.setText("解除的配对（" + vg60Var.f184001a.size() + "）");
        }
        this.f26068i.getPaint().setFakeBoldText(true);
        bnl0.m105509E0(this.f26066g, new View.OnClickListener() { // from class: l.m56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m42889e(g56Var, vg60Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m42892h(final g56 g56Var, final List list) {
        boolean zM147479J = jyb.m147479J(list);
        TextView textView = this.f26064e;
        if (zM147479J) {
            textView.setText("所有配对");
        } else {
            textView.setText("所有配对（" + list.size() + "）");
        }
        this.f26064e.getPaint().setFakeBoldText(true);
        bnl0.m105509E0(this.f26062c, new View.OnClickListener() { // from class: l.n56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m42885a(g56Var, list, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m42893i(final g56 g56Var) {
        int iM158458K = g56Var.m158458K();
        VText vText = this.f26070k;
        if (iM158458K <= 0) {
            vText.setText("新配对");
        } else {
            vText.setText("新配对（" + iM158458K + "）");
        }
        this.f26070k.getPaint().setFakeBoldText(true);
        if (pkb.m172596q0()) {
            this.f26061b.setText("输入昵称/聊天内容/ID搜索");
        }
        g56Var.mo68557c(g56Var.f136922m, CoreModule.f18264c.f20384f0.m34167vn()).subscribe(psd0.m173596G(new y20() { // from class: l.j56
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118368a.m42891g(g56Var, (vg60) obj);
            }
        }));
        g56Var.mo68557c(g56Var.f136922m, CoreModule.f18272k.f115545m.f137470A.m208677m()).subscribe(psd0.m173596G(new y20() { // from class: l.k56
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123970a.m42892h(g56Var, (List) obj);
            }
        }));
        bnl0.m105509E0(this.f26060a, new View.OnClickListener() { // from class: l.l56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m42888d(g56Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42890f(this);
    }

    public ConversationAddressBookMatchHeadLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAddressBookMatchHeadLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
