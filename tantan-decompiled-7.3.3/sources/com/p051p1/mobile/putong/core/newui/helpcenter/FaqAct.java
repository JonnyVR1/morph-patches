package com.p051p1.mobile.putong.core.newui.helpcenter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.helpcenter.FaqAct;
import com.p051p1.mobile.putong.core.newui.helpcenter.Questions;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p153l.adc0;
import p153l.dbc0;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.u11;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class FaqAct extends PutongAct {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.helpcenter.FaqAct$a */
    public class C8002a extends jic0<Questions.AbstractC8005b> {

        /* JADX INFO: renamed from: c */
        public final Questions.Question f22326c;

        public C8002a(Questions.Question question) {
            this.f22326c = question;
        }

        /* JADX INFO: renamed from: E */
        public static /* synthetic */ void m37623E(View view, Questions.AbstractC8005b abstractC8005b, User user) {
            LookingFor lookingFor = user.settings.getLookingFor();
            Gender gender = (!TEnum.equals(lookingFor, "female") && TEnum.equals(lookingFor, "male")) ? Gender.get("male") : Gender.get("female");
            uqb0.f180374G.m127115L0((SimpleDraweeView) view.findViewById(adc0.f70031N5), Questions.m37635b(abstractC8005b.getContent().toString(), gender));
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m37624F(Throwable th) {
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f22326c.getContents().size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return FaqAct.this.act().inflater().inflate(kec0.f125660V3, viewGroup, false);
            }
            if (i == 2) {
                return FaqAct.this.act().inflater().inflate(kec0.f125676W3, viewGroup, false);
            }
            u11.m193894h(i == 1);
            return FaqAct.this.act().inflater().inflate(kec0.f125628T3, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(final View view, final Questions.AbstractC8005b abstractC8005b, int i, int i2) {
            if (i == 1) {
                mo68557c(FaqAct.this.act(), CoreModule.m30930K().mo31798me()).subscribe(psd0.m173597H(new y20() { // from class: l.hjg
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        FaqAct.C8002a.m37623E(view, abstractC8005b, (User) obj);
                    }
                }, new y20() { // from class: l.ijg
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        FaqAct.C8002a.m37624F((Throwable) obj);
                    }
                }));
            } else if (i == 2) {
                ((TextView) view.findViewById(adc0.f70124Sd)).setText(abstractC8005b.getContent());
            } else if (i == 0) {
                ((TextView) view).setText(abstractC8005b.getContent());
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Questions.AbstractC8005b getItem(int i) {
            return this.f22326c.getContents().get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return getItem(i).getType();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m37622Y1(Act act, String str) {
        return new Intent(act, (Class<?>) FaqAct.class).putExtra("question", str);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(act());
        RecyclerView recyclerView = new RecyclerView(act());
        recyclerView.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        final String stringExtra = getIntent().getStringExtra("question");
        recyclerView.setAdapter(new C8002a((Questions.Question) jyb.m147529r(Questions.m37634a(), new qcj() { // from class: l.gjg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(stringExtra.equals(((Questions.Question) obj).getId()));
            }
        })));
        frameLayout.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(act());
        view.setBackgroundResource(dbc0.f86514Qp);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, qa00.f156323j));
        frameLayout.addView(view);
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_help_center_view";
    }
}
