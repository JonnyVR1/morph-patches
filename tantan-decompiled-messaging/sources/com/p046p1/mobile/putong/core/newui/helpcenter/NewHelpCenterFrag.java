package com.p046p1.mobile.putong.core.newui.helpcenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.helpcenter.Questions;
import java.util.List;
import java.util.Map;
import p147v.navigationbar.VNavigationBar;
import p149l.dac0;
import p149l.e01;
import p149l.e30;
import p149l.f6c0;
import p149l.hpd0;
import p149l.mkd0;
import p149l.u4c0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;

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
    public class ViewOnClickListenerC7852a extends dac0<Questions.Question> implements View.OnClickListener {

        /* JADX INFO: renamed from: c */
        public List<Questions.Question> f21586c;

        /* JADX INFO: renamed from: d */
        public Map<String, hpd0> f21587d;

        public ViewOnClickListenerC7852a() {
            List<Questions.Question> listM36631a = Questions.m36631a();
            this.f21586c = listM36631a;
            this.f21587d = new e01(listM36631a.size());
            vwb.m200354z(this.f21586c, new e30() { // from class: l.es20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92977a.m36630I((Questions.Question) obj);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f21586c.size() + 1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            NewHelpCenterFrag newHelpCenterFrag = NewHelpCenterFrag.this;
            if (i == 1) {
                View viewInflate = newHelpCenterFrag.act().inflater().inflate(f6c0.f95590U3, viewGroup, false);
                xdl0.m208329E0(viewInflate, this);
                return viewInflate;
            }
            View viewInflate2 = newHelpCenterFrag.act().inflater().inflate(f6c0.f95558S3, viewGroup, false);
            ((TextView) viewInflate2.findViewById(u4c0.f174252ff)).setText("7.2.7");
            return viewInflate2;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(final View view, Questions.Question question, int i, int i2) {
            if (i == 1) {
                ((TextView) view.findViewById(u4c0.f173985Pd)).setText(question.getTitle());
                view.setTag(question);
                mo67374c(NewHelpCenterFrag.this.act(), this.f21587d.get(question.getId()).obs()).subscribe(mkd0.m154955G(new e30() { // from class: l.fs20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        view.findViewById(u4c0.f174223e3).setVisibility(((Boolean) obj).booleanValue() ? 4 : 0);
                    }
                }));
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Questions.Question getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f21586c.get(i - 1);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m36630I(Questions.Question question) {
            this.f21587d.put(question.getId(), new hpd0("faq_" + question.getId() + "_" + CoreModule.m29931H().userId(), Boolean.FALSE));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Questions.Question question = (Questions.Question) view.getTag();
            this.f21587d.get(question.getId()).put(Boolean.TRUE);
            if (question instanceof LiveQuestion) {
                CoreModule.m29936Q().startLiveVerificationPage(NewHelpCenterFrag.this.act());
            } else {
                NewHelpCenterFrag newHelpCenterFrag = NewHelpCenterFrag.this;
                newHelpCenterFrag.startActivity(FaqAct.m36619X1(newHelpCenterFrag.act(), question.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m36625N4(View view) {
        act().onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95521Pe, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(u4c0.f174072V0);
        recyclerView.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        recyclerView.setAdapter(new ViewOnClickListenerC7852a());
        VNavigationBar vNavigationBar = (VNavigationBar) viewInflate.findViewById(u4c0.f173912L8);
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ds20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87714a.m36625N4(view);
            }
        });
        vNavigationBar.getLeftIconContainer().setBackgroundResource(x2c0.f190442p);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_help_center_view";
    }
}
