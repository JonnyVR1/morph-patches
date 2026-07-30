package com.p046p1.mobile.putong.core.newui.helpcenter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.helpcenter.FaqAct;
import com.p046p1.mobile.putong.core.newui.helpcenter.Questions;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p149l.dac0;
import p149l.e30;
import p149l.f6c0;
import p149l.mkd0;
import p149l.n11;
import p149l.qib0;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class FaqAct extends PutongAct {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.helpcenter.FaqAct$a */
    public class C7851a extends dac0<Questions.AbstractC7854b> {

        /* JADX INFO: renamed from: c */
        public final Questions.Question f21584c;

        public C7851a(Questions.Question question) {
            this.f21584c = question;
        }

        /* JADX INFO: renamed from: E */
        public static /* synthetic */ void m36620E(View view, Questions.AbstractC7854b abstractC7854b, User user) {
            LookingFor lookingFor = user.settings.getLookingFor();
            Gender gender = (!TEnum.equals(lookingFor, "female") && TEnum.equals(lookingFor, "male")) ? Gender.get("male") : Gender.get("female");
            qib0.f154691G.m102331L0((SimpleDraweeView) view.findViewById(u4c0.f173909L5), Questions.m36632b(abstractC7854b.getContent().toString(), gender));
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m36621F(Throwable th) {
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f21584c.getContents().size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return FaqAct.this.act().inflater().inflate(f6c0.f95606V3, viewGroup, false);
            }
            if (i == 2) {
                return FaqAct.this.act().inflater().inflate(f6c0.f95622W3, viewGroup, false);
            }
            n11.m157335h(i == 1);
            return FaqAct.this.act().inflater().inflate(f6c0.f95574T3, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(final View view, final Questions.AbstractC7854b abstractC7854b, int i, int i2) {
            if (i == 1) {
                mo67374c(FaqAct.this.act(), CoreModule.m29932K().mo30795me()).subscribe(mkd0.m154956H(new e30() { // from class: l.thg
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        FaqAct.C7851a.m36620E(view, abstractC7854b, (User) obj);
                    }
                }, new e30() { // from class: l.uhg
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        FaqAct.C7851a.m36621F((Throwable) obj);
                    }
                }));
            } else if (i == 2) {
                ((TextView) view.findViewById(u4c0.f173985Pd)).setText(abstractC7854b.getContent());
            } else if (i == 0) {
                ((TextView) view).setText(abstractC7854b.getContent());
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Questions.AbstractC7854b getItem(int i) {
            return this.f21584c.getContents().get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return getItem(i).getType();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m36619X1(Act act, String str) {
        return new Intent(act, (Class<?>) FaqAct.class).putExtra("question", str);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(act());
        RecyclerView recyclerView = new RecyclerView(act());
        recyclerView.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        final String stringExtra = getIntent().getStringExtra("question");
        recyclerView.setAdapter(new C7851a((Questions.Question) vwb.m200346r(Questions.m36631a(), new w9j() { // from class: l.shg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(stringExtra.equals(((Questions.Question) obj).getId()));
            }
        })));
        frameLayout.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(act());
        view.setBackgroundResource(x2c0.f190055cp);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, t100.f167261j));
        frameLayout.addView(view);
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_help_center_view";
    }
}
