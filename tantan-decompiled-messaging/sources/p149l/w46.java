package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w46 implements s7m<r46> {

    /* JADX INFO: renamed from: c */
    public static String f184475c;

    /* JADX INFO: renamed from: a */
    public final Act f184476a;

    /* JADX INFO: renamed from: b */
    public C20797a f184477b;

    /* JADX INFO: renamed from: l.w46$a */
    public static class C20797a extends fi2 {
        public C20797a(Act act) {
            super(act);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: U */
        public /* synthetic */ void m201469U(View view) {
            m121489N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: V */
        public /* synthetic */ void m201470V(View view) {
            m201473T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: W */
        public /* synthetic */ void m201471W(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0578p).topMargin = ((xdl0.m208338J(this.f97616m).y - t100.m186890d(this.f97619p ? 240.0f : 200.0f)) / 2) - iArr[1];
            view.setLayoutParams(c0578p);
            this.f97607d.setText("暂时没有解除的配对");
            this.f97606c.setImageResource(x2c0.f190251j0);
            xdl0.m208344M(view, true);
            xdl0.m208344M(this.f97609f, this.f97619p);
            if (this.f97619p) {
                zvf0.m220402x("e_abnormal", "p_contacts_unmatch_list");
                xdl0.m208329E0(this.f97609f, new View.OnClickListener() { // from class: l.v46
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f179882a.m201470V(view2);
                    }
                });
            }
            xdl0.m208344M(this.f97608e, false);
        }

        @Override // p149l.fi2, p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f97616m.inflater().inflate(f6c0.f96004t, viewGroup, false);
            }
            if (i == 2) {
                return rd6.m178871a(this.f97616m, viewGroup);
            }
            return i == 3 ? this.f97616m.inflater().inflate(f6c0.f95757e6, viewGroup, false) : super.mo28825D(viewGroup, i);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public void mo28823A(final View view, Conversation conversation, int i, int i2) {
            if (i == 2) {
                NewConversationItemView newConversationItemView = (NewConversationItemView) view;
                newConversationItemView.m41778u4(this, conversation, null, i2 - 1, null);
                newConversationItemView.setPicPercent(0.83f);
            } else {
                if (i == 1) {
                    xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.s46
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f162269a.m201469U(view2);
                        }
                    });
                    return;
                }
                if (i == 0) {
                    view.post(new Runnable() { // from class: l.t46
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f167689a.m201471W(view);
                        }
                    });
                } else if (i == 3) {
                    zvf0.m220402x("e_abnormal", "p_contacts_unmatch_list");
                    xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.u46
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f173694a.m201474X(view2);
                        }
                    });
                }
            }
        }

        /* JADX INFO: renamed from: T */
        public void m201473T() {
            zvf0.m220396r("e_abnormal", "p_contacts_unmatch_list");
            Act act = this.f97616m;
            act.startActivity(MkWebViewAct.m80239d2(act, "", w46.f184475c, true, true, false, null));
        }

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ void m201474X(View view) {
            m201473T();
        }
    }

    static {
        f184475c = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/address-book/index.html?_bid=1003918&hideNavigationBar=1&hideNotch=1&source=unmatch#/abnormaluser");
    }

    public w46(Act act) {
        this.f184476a = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f184476a;
    }

    /* JADX INFO: renamed from: b */
    public void m201463b(List<Conversation> list, boolean z) {
        this.f184477b.m121488M(z);
        this.f184477b.m121487L(list);
        boolean zM200296J = vwb.m200296J(list);
        Act act = this.f184476a;
        if (zM200296J) {
            act.setTitle("解除的配对");
            return;
        }
        act.setTitle("解除的配对（" + list.size() + "）");
    }

    /* JADX INFO: renamed from: c */
    public void m201464c() {
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f184476a.toolbar());
            if (textView == null) {
                return;
            }
            textView.setTranslationX(-t100.m186890d(35.0f));
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(this.f184476a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f184476a);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        C20797a c20797a = new C20797a(this.f184476a);
        this.f184477b = c20797a;
        recyclerView.setAdapter(c20797a);
        return recyclerView;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(r46 r46Var) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
