package com.p051p1.mobile.putong.core.newui.helpcenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.helpcenter.Questions;
import java.util.List;
import java.util.Map;
import p151v.navigationbar.VNavigationBar;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.jic0;
import p153l.jxd0;
import p153l.jyb;
import p153l.kec0;
import p153l.l01;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
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
    public class ViewOnClickListenerC8003a extends jic0<Questions.Question> implements View.OnClickListener {

        /* JADX INFO: renamed from: c */
        public List<Questions.Question> f22328c;

        /* JADX INFO: renamed from: d */
        public Map<String, jxd0> f22329d;

        public ViewOnClickListenerC8003a() {
            List<Questions.Question> listM37634a = Questions.m37634a();
            this.f22328c = listM37634a;
            this.f22329d = new l01(listM37634a.size());
            jyb.m147537z(this.f22328c, new y20() { // from class: l.o030
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144494a.m37633I((Questions.Question) obj);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f22328c.size() + 1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            NewHelpCenterFrag newHelpCenterFrag = NewHelpCenterFrag.this;
            if (i == 1) {
                View viewInflate = newHelpCenterFrag.act().inflater().inflate(kec0.f125644U3, viewGroup, false);
                bnl0.m105509E0(viewInflate, this);
                return viewInflate;
            }
            View viewInflate2 = newHelpCenterFrag.act().inflater().inflate(kec0.f125612S3, viewGroup, false);
            ((TextView) viewInflate2.findViewById(adc0.f70410jf)).setText("7.3.3");
            return viewInflate2;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(final View view, Questions.Question question, int i, int i2) {
            if (i == 1) {
                ((TextView) view.findViewById(adc0.f70124Sd)).setText(question.getTitle());
                view.setTag(question);
                mo68557c(NewHelpCenterFrag.this.act(), this.f22329d.get(question.getId()).obs()).subscribe(psd0.m173596G(new y20() { // from class: l.p030
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        view.findViewById(adc0.f70348g3).setVisibility(((Boolean) obj).booleanValue() ? 4 : 0);
                    }
                }));
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Questions.Question getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f22328c.get(i - 1);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m37633I(Questions.Question question) {
            this.f22329d.put(question.getId(), new jxd0("faq_" + question.getId() + "_" + CoreModule.m30929H().userId(), Boolean.FALSE));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Questions.Question question = (Questions.Question) view.getTag();
            this.f22329d.get(question.getId()).put(Boolean.TRUE);
            if (question instanceof LiveQuestion) {
                CoreModule.m30934Q().startLiveVerificationPage(NewHelpCenterFrag.this.act());
            } else {
                NewHelpCenterFrag newHelpCenterFrag = NewHelpCenterFrag.this;
                newHelpCenterFrag.startActivity(FaqAct.m37622Y1(newHelpCenterFrag.act(), question.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m37628N4(View view) {
        act().onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125687We, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(adc0.f70162V0);
        recyclerView.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        recyclerView.setAdapter(new ViewOnClickListenerC8003a());
        VNavigationBar vNavigationBar = (VNavigationBar) viewInflate.findViewById(adc0.f70034N8);
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.n030
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139587a.m37628N4(view);
            }
        });
        vNavigationBar.getLeftIconContainer().setBackgroundResource(dbc0.f87333q);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_help_center_view";
    }
}
