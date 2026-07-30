package com.p000p1.mobile.putong.core.newui.helpcenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.helpcenter.Questions;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;
import java.util.Map;
import l.dac0;
import l.e01;
import l.e30;
import l.f6c0;
import l.hpd0;
import l.mkd0;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewHelpCenterFrag extends PutongFrag {

    public static class LiveQuestion extends Questions.Question {
        public LiveQuestion() {
            super("about_live", 0, null);
        }

        @Override // com.p1.mobile.putong.core.newui.helpcenter.Questions.Question
        public CharSequence getTitle() {
            return "直播功能怎么玩";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.helpcenter.NewHelpCenterFrag$a */
    public class ViewOnClickListenerC0016a extends dac0<Questions.Question> implements View.OnClickListener {

        /* JADX INFO: renamed from: c */
        public List<Questions.Question> f364c;

        /* JADX INFO: renamed from: d */
        public Map<String, hpd0> f365d;

        public ViewOnClickListenerC0016a() {
            List<Questions.Question> listM580a = Questions.m580a();
            this.f364c = listM580a;
            this.f365d = new e01(listM580a.size());
            vwb.z(this.f364c, new e30() { // from class: l.es20
                public final void call(Object obj) {
                    this.f12676a.m579I((Questions.Question) obj);
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public int m575C() {
            return this.f364c.size() + 1;
        }

        /* JADX INFO: renamed from: D */
        public View m576D(ViewGroup viewGroup, int i) {
            NewHelpCenterFrag newHelpCenterFrag = NewHelpCenterFrag.this;
            if (i == 1) {
                View viewInflate = newHelpCenterFrag.act().inflater().inflate(f6c0.U3, viewGroup, false);
                xdl0.E0(viewInflate, this);
                return viewInflate;
            }
            View viewInflate2 = newHelpCenterFrag.act().inflater().inflate(f6c0.S3, viewGroup, false);
            ((TextView) viewInflate2.findViewById(u4c0.ff)).setText("7.2.7");
            return viewInflate2;
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m574A(final View view, Questions.Question question, int i, int i2) {
            if (i == 1) {
                ((TextView) view.findViewById(u4c0.Pd)).setText(question.getTitle());
                view.setTag(question);
                c(NewHelpCenterFrag.this.act(), this.f365d.get(question.getId()).obs()).subscribe(mkd0.G(new e30() { // from class: l.fs20
                    public final void call(Object obj) {
                        view.findViewById(u4c0.e3).setVisibility(((Boolean) obj).booleanValue() ? 4 : 0);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Questions.Question getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f364c.get(i - 1);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m579I(Questions.Question question) {
            this.f365d.put(question.getId(), new hpd0("faq_" + question.getId() + "_" + CoreModule.H().userId(), Boolean.FALSE));
        }

        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Questions.Question question = (Questions.Question) view.getTag();
            this.f365d.get(question.getId()).put(Boolean.TRUE);
            if (question instanceof LiveQuestion) {
                CoreModule.Q().startLiveVerificationPage(NewHelpCenterFrag.this.act());
            } else {
                NewHelpCenterFrag newHelpCenterFrag = NewHelpCenterFrag.this;
                newHelpCenterFrag.startActivity(FaqAct.m561X1(newHelpCenterFrag.act(), question.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m570N4(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: d4 */
    public void m571d4() {
        super.d4();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Pe, viewGroup, false);
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(u4c0.V0);
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        recyclerViewFindViewById.setAdapter(new ViewOnClickListenerC0016a());
        VNavigationBar vNavigationBarFindViewById = viewInflate.findViewById(u4c0.L8);
        vNavigationBarFindViewById.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ds20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11973a.m570N4(view);
            }
        });
        vNavigationBarFindViewById.getLeftIconContainer().setBackgroundResource(x2c0.p);
        return viewInflate;
    }

    public String pageId() {
        return "p_help_center_view";
    }
}
