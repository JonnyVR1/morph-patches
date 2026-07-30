package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.f6c0;
import l.s7m;
import l.t100;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w46 implements s7m<r46> {

    /* JADX INFO: renamed from: c */
    public static String f21890c;

    /* JADX INFO: renamed from: a */
    public final Act f21891a;

    /* JADX INFO: renamed from: b */
    public C1279a f21892b;

    /* JADX INFO: renamed from: l.w46$a */
    public static class C1279a extends fi2 {
        public C1279a(Act act) {
            super(act);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: U */
        public /* synthetic */ void m23880U(View view) {
            m14444N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: V */
        public /* synthetic */ void m23881V(View view) {
            m23885T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: W */
        public /* synthetic */ void m23882W(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) pVar).topMargin = ((xdl0.J(this.f13017m).y - t100.d(this.f13020p ? 240.0f : 200.0f)) / 2) - iArr[1];
            view.setLayoutParams(pVar);
            this.f13008d.setText("暂时没有解除的配对");
            this.f13007c.setImageResource(x2c0.j0);
            xdl0.M(view, true);
            xdl0.M(this.f13010f, this.f13020p);
            if (this.f13020p) {
                zvf0.x("e_abnormal", "p_contacts_unmatch_list");
                xdl0.E0(this.f13010f, new View.OnClickListener() { // from class: l.v46
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f21440a.m23881V(view2);
                    }
                });
            }
            xdl0.M(this.f13009e, false);
        }

        @Override // p009l.fi2
        /* JADX INFO: renamed from: D */
        public View mo5985D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f13017m.inflater().inflate(f6c0.t, viewGroup, false);
            }
            if (i == 2) {
                return rd6.m21512a(this.f13017m, viewGroup);
            }
            return i == 3 ? this.f13017m.inflater().inflate(f6c0.e6, viewGroup, false) : super.mo5985D(viewGroup, i);
        }

        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public void m23883A(final View view, Conversation conversation, int i, int i2) {
            if (i == 2) {
                NewConversationItemView newConversationItemView = (NewConversationItemView) view;
                newConversationItemView.m5902u4(this, conversation, null, i2 - 1, null);
                newConversationItemView.setPicPercent(0.83f);
            } else {
                if (i == 1) {
                    xdl0.E0(view, new View.OnClickListener() { // from class: l.s46
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f20090a.m23880U(view2);
                        }
                    });
                    return;
                }
                if (i == 0) {
                    view.post(new Runnable() { // from class: l.t46
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20553a.m23882W(view);
                        }
                    });
                } else if (i == 3) {
                    zvf0.x("e_abnormal", "p_contacts_unmatch_list");
                    xdl0.E0(view, new View.OnClickListener() { // from class: l.u46
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f20982a.m23886X(view2);
                        }
                    });
                }
            }
        }

        /* JADX INFO: renamed from: T */
        public void m23885T() {
            zvf0.r("e_abnormal", "p_contacts_unmatch_list");
            Act act = this.f13017m;
            act.startActivity(MkWebViewAct.m10586d2(act, "", w46.f21890c, true, true, false, null));
        }

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ void m23886X(View view) {
            m23885T();
        }
    }

    static {
        f21890c = (juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/address-book/index.html?_bid=1003918&hideNavigationBar=1&hideNotch=1&source=unmatch#/abnormaluser");
    }

    public w46(Act act) {
        this.f21891a = act;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23871C0() {
        return this.f21891a;
    }

    /* JADX INFO: renamed from: b */
    public void m23873b(List<Conversation> list, boolean z) {
        this.f21892b.m14443M(z);
        this.f21892b.m14442L(list);
        boolean zJ = vwb.J(list);
        Act act = this.f21891a;
        if (zJ) {
            act.setTitle("解除的配对");
            return;
        }
        act.setTitle("解除的配对（" + list.size() + "）");
    }

    /* JADX INFO: renamed from: c */
    public void m23874c() {
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f21891a.toolbar());
            if (textView == null) {
                return;
            }
            textView.setTranslationX(-t100.d(35.0f));
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(this.f21891a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f21891a);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        C1279a c1279a = new C1279a(this.f21891a);
        this.f21892b = c1279a;
        recyclerView.setAdapter(c1279a);
        return recyclerView;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m23875i1(r46 r46Var) {
    }

    public void destroy() {
    }
}
