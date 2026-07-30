package com.p051p1.mobile.putong.core.newui.home.marrymode;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p151v.VButton;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.kec0;
import p153l.n3x;
import p153l.pzi0;
import p153l.uxj0;
import p153l.yab;

/* JADX INFO: loaded from: classes11.dex */
public class MarryModeEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public String f23997a;

    /* JADX INFO: renamed from: b */
    public VText f23998b;

    /* JADX INFO: renamed from: c */
    public VText f23999c;

    /* JADX INFO: renamed from: d */
    public VLinear f24000d;

    /* JADX INFO: renamed from: e */
    public VText f24001e;

    /* JADX INFO: renamed from: f */
    public VText f24002f;

    /* JADX INFO: renamed from: g */
    public VText f24003g;

    /* JADX INFO: renamed from: h */
    public VText f24004h;

    /* JADX INFO: renamed from: i */
    public VText f24005i;

    /* JADX INFO: renamed from: j */
    public VText f24006j;

    /* JADX INFO: renamed from: k */
    public VButton f24007k;

    /* JADX INFO: renamed from: l */
    public CountDownTimer f24008l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$a */
    public class ViewOnClickListenerC8179a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$a$a */
        public class a implements C4468a.a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ User f24010a;

            public a(User user) {
                this.f24010a = user;
            }

            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public boolean mo21400a(int i, int i2, Intent intent) {
                if (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9().subtract(this.f24010a))) {
                    return false;
                }
                CoreModule.f18264c.f20405m0.f20148e0.onNext(uxj0.f181467a);
                return false;
            }
        }

        public ViewOnClickListenerC8179a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MarryModeEmptyView.this.getContext() == null || !(MarryModeEmptyView.this.getContext() instanceof Act)) {
                return;
            }
            Act act = (Act) MarryModeEmptyView.this.getContext();
            if (TextUtils.equals(MarryModeEmptyView.this.f23997a, "suggest_end")) {
                n3x.m161356B(act, false);
            } else if (TextUtils.equals(MarryModeEmptyView.this.f23997a, "suggest_empty")) {
                act.startActivityForResult(MarryProfileEditAct.m48602a2(act, "marry_series_type_mate"), new a(CoreModule.f18264c.f20381e0.m116600p9().mo225055clone()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$b */
    public class CountDownTimerC8180b extends CountDownTimer {
        public CountDownTimerC8180b(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CoreModule.f18264c.f20405m0.f20148e0.onNext(uxj0.f181467a);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            List<String> listM214858O = yab.m214858O(j);
            Iterator<String> it = listM214858O.iterator();
            String str = "";
            while (it.hasNext()) {
                str = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + it.next();
            }
            if (listM214858O.size() == 6) {
                MarryModeEmptyView.this.f24001e.setText(listM214858O.get(0));
                MarryModeEmptyView.this.f24002f.setText(listM214858O.get(1));
                MarryModeEmptyView.this.f24003g.setText(listM214858O.get(2));
                MarryModeEmptyView.this.f24004h.setText(listM214858O.get(3));
                MarryModeEmptyView.this.f24005i.setText(listM214858O.get(4));
                MarryModeEmptyView.this.f24006j.setText(listM214858O.get(5));
            }
        }
    }

    public MarryModeEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23997a = "suggest_empty";
        m39768b(context);
    }

    /* JADX INFO: renamed from: a */
    public void m39767a() {
        if (NullChecker.m82486a(this.f24008l)) {
            this.f24008l.cancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39768b(Context context) {
        LayoutInflater.from(context).inflate(kec0.f125567P6, (ViewGroup) this, true);
        this.f23998b = (VText) findViewById(adc0.f70409je);
        this.f23999c = (VText) findViewById(adc0.f70477ne);
        this.f24000d = (VLinear) findViewById(adc0.f70274be);
        this.f24001e = (VText) findViewById(adc0.f70587u5);
        this.f24002f = (VText) findViewById(adc0.f70604v5);
        this.f24003g = (VText) findViewById(adc0.f70539r8);
        this.f24004h = (VText) findViewById(adc0.f70556s8);
        this.f24005i = (VText) findViewById(adc0.f70156Ub);
        this.f24006j = (VText) findViewById(adc0.f70173Vb);
        VButton vButton = (VButton) findViewById(adc0.f69818Ad);
        this.f24007k = vButton;
        bnl0.m105509E0(vButton, new ViewOnClickListenerC8179a());
    }

    /* JADX INFO: renamed from: c */
    public void m39769c(String str) {
        this.f23997a = str;
        if (!TextUtils.equals(str, "suggest_end")) {
            if (TextUtils.equals(str, "suggest_empty")) {
                this.f23998b.setText("暂无符合条件的理想伴侣");
                this.f23999c.setText("建议把期望值调低一些");
                bnl0.m105524M(this.f23998b, true);
                bnl0.m105524M(this.f23999c, true);
                bnl0.m105524M(this.f24000d, false);
                this.f24007k.setText("修改条件");
                m39767a();
                return;
            }
            return;
        }
        this.f23998b.setText("今日推荐已用完");
        this.f23999c.setText("每天12点，为你推荐新朋友");
        bnl0.m105524M(this.f23999c, true);
        bnl0.m105524M(this.f24000d, true);
        this.f24007k.setText("切换到恋爱模式");
        m39767a();
        CountDownTimerC8180b countDownTimerC8180b = new CountDownTimerC8180b(yab.m214859P() - pzi0.m174454o(), 1000L);
        this.f24008l = countDownTimerC8180b;
        countDownTimerC8180b.start();
    }

    public String getType() {
        return this.f23997a;
    }

    public void setType(String str) {
        this.f23997a = str;
    }

    public MarryModeEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryModeEmptyView(@NonNull Context context) {
        this(context, null);
    }
}
