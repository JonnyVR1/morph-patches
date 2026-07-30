package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class b66 implements iam<w56> {

    /* JADX INFO: renamed from: c */
    public static String f75135c;

    /* JADX INFO: renamed from: a */
    public final Act f75136a;

    /* JADX INFO: renamed from: b */
    public C15938a f75137b;

    /* JADX INFO: renamed from: l.b66$a */
    public static class C15938a extends mi2 {
        public C15938a(Act act) {
            super(act);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: U */
        public /* synthetic */ void m102699U(View view) {
            m158461N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: V */
        public /* synthetic */ void m102700V(View view) {
            m102703T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: W */
        public /* synthetic */ void m102701W(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0580p).topMargin = ((bnl0.m105518J(this.f136922m).y - qa00.m175859d(this.f136925p ? 240.0f : 200.0f)) / 2) - iArr[1];
            view.setLayoutParams(c0580p);
            this.f136913d.setText("暂时没有解除的配对");
            this.f136912c.setImageResource(dbc0.f87136k0);
            bnl0.m105524M(view, true);
            bnl0.m105524M(this.f136915f, this.f136925p);
            if (this.f136925p) {
                i4g0.m138526x("e_abnormal", "p_contacts_unmatch_list");
                bnl0.m105509E0(this.f136915f, new View.OnClickListener() { // from class: l.a66
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f68673a.m102700V(view2);
                    }
                });
            }
            bnl0.m105524M(this.f136914e, false);
        }

        @Override // p153l.mi2, p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f136922m.inflater().inflate(kec0.f126058t, viewGroup, false);
            }
            if (i == 2) {
                return ue6.m195665a(this.f136922m, viewGroup);
            }
            return i == 3 ? this.f136922m.inflater().inflate(kec0.f125828f6, viewGroup, false) : super.mo29824D(viewGroup, i);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public void mo29822A(final View view, Conversation conversation, int i, int i2) {
            if (i == 2) {
                NewConversationItemView newConversationItemView = (NewConversationItemView) view;
                newConversationItemView.m42789u4(this, conversation, null, i2 - 1, null);
                newConversationItemView.setPicPercent(0.83f);
            } else {
                if (i == 1) {
                    bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.x56
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f192457a.m102699U(view2);
                        }
                    });
                    return;
                }
                if (i == 0) {
                    view.post(new Runnable() { // from class: l.y56
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f197537a.m102701W(view);
                        }
                    });
                } else if (i == 3) {
                    i4g0.m138526x("e_abnormal", "p_contacts_unmatch_list");
                    bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.z56
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f203007a.m102704X(view2);
                        }
                    });
                }
            }
        }

        /* JADX INFO: renamed from: T */
        public void m102703T() {
            i4g0.m138520r("e_abnormal", "p_contacts_unmatch_list");
            Act act = this.f136922m;
            act.startActivity(MkWebViewAct.m81422e2(act, "", b66.f75135c, true, true, false, null));
        }

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ void m102704X(View view) {
            m102703T();
        }
    }

    static {
        f75135c = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/address-book/index.html?_bid=1003918&hideNavigationBar=1&hideNotch=1&source=unmatch#/abnormaluser");
    }

    public b66(Act act) {
        this.f75136a = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f75136a;
    }

    /* JADX INFO: renamed from: b */
    public void m102693b(List<Conversation> list, boolean z) {
        this.f75137b.m158460M(z);
        this.f75137b.m158459L(list);
        boolean zM147479J = jyb.m147479J(list);
        Act act = this.f75136a;
        if (zM147479J) {
            act.setTitle("解除的配对");
            return;
        }
        act.setTitle("解除的配对（" + list.size() + "）");
    }

    /* JADX INFO: renamed from: c */
    public void m102694c() {
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f75136a.toolbar());
            if (textView == null) {
                return;
            }
            textView.setTranslationX(-qa00.m175859d(35.0f));
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(this.f75136a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f75136a);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        C15938a c15938a = new C15938a(this.f75136a);
        this.f75137b = c15938a;
        recyclerView.setAdapter(c15938a);
        return recyclerView;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w56 w56Var) {
    }
}
