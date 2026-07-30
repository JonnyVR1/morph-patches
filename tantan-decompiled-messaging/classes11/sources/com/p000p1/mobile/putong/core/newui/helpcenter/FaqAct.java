package com.p000p1.mobile.putong.core.newui.helpcenter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.helpcenter.FaqAct;
import com.p000p1.mobile.putong.core.newui.helpcenter.Questions;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.dac0;
import l.e30;
import l.f6c0;
import l.mkd0;
import l.n11;
import l.qib0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FaqAct extends PutongAct {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.helpcenter.FaqAct$a */
    public class C0015a extends dac0<Questions.AbstractC0018b> {

        /* JADX INFO: renamed from: c */
        public final Questions.Question f362c;

        public C0015a(Questions.Question question) {
            this.f362c = question;
        }

        /* JADX INFO: renamed from: E */
        public static /* synthetic */ void m562E(View view, Questions.AbstractC0018b abstractC0018b, User user) {
            LookingFor lookingFor = user.settings.getLookingFor();
            Gender gender = (!TEnum.equals(lookingFor, "female") && TEnum.equals(lookingFor, "male")) ? Gender.get("male") : Gender.get("female");
            qib0.G.L0(view.findViewById(u4c0.L5), Questions.m581b(abstractC0018b.getContent().toString(), gender));
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m563F(Throwable th) {
        }

        /* JADX INFO: renamed from: C */
        public int m565C() {
            return this.f362c.getContents().size();
        }

        /* JADX INFO: renamed from: D */
        public View m566D(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return FaqAct.this.act().inflater().inflate(f6c0.V3, viewGroup, false);
            }
            if (i == 2) {
                return FaqAct.this.act().inflater().inflate(f6c0.W3, viewGroup, false);
            }
            n11.h(i == 1);
            return FaqAct.this.act().inflater().inflate(f6c0.T3, viewGroup, false);
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m564A(final View view, final Questions.AbstractC0018b abstractC0018b, int i, int i2) {
            if (i == 1) {
                c(FaqAct.this.act(), CoreModule.K().me()).subscribe(mkd0.H(new e30() { // from class: l.thg
                    public final void call(Object obj) {
                        FaqAct.C0015a.m562E(view, abstractC0018b, (User) obj);
                    }
                }, new e30() { // from class: l.uhg
                    public final void call(Object obj) {
                        FaqAct.C0015a.m563F((Throwable) obj);
                    }
                }));
            } else if (i == 2) {
                ((TextView) view.findViewById(u4c0.Pd)).setText(abstractC0018b.getContent());
            } else if (i == 0) {
                ((TextView) view).setText(abstractC0018b.getContent());
            }
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Questions.AbstractC0018b getItem(int i) {
            return this.f362c.getContents().get(i);
        }

        public int getItemViewType(int i) {
            return getItem(i).getType();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m561X1(Act act, String str) {
        return new Intent((Context) act, (Class<?>) FaqAct.class).putExtra("question", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(act());
        RecyclerView recyclerView = new RecyclerView(act());
        recyclerView.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        final String stringExtra = getIntent().getStringExtra("question");
        recyclerView.setAdapter(new C0015a((Questions.Question) vwb.r(Questions.m580a(), new w9j() { // from class: l.shg
            public final Object call(Object obj) {
                return Boolean.valueOf(stringExtra.equals(((Questions.Question) obj).getId()));
            }
        })));
        frameLayout.addView((View) recyclerView, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        View view = new View(act());
        view.setBackgroundResource(x2c0.cp);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, t100.j));
        frameLayout.addView(view);
        return frameLayout;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    public String pageId() {
        return "p_help_center_view";
    }
}
