package com.p000p1.mobile.putong.core.newui.home.marrymode;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.marry.profile.edit.MarryProfileEditAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.f6c0;
import l.l9b;
import l.roj0;
import l.u4c0;
import l.xdl0;
import p009l.mqi0;
import p009l.o0x;
import v.VButton;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MarryModeEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public String f2033a;

    /* JADX INFO: renamed from: b */
    public VText f2034b;

    /* JADX INFO: renamed from: c */
    public VText f2035c;

    /* JADX INFO: renamed from: d */
    public VLinear f2036d;

    /* JADX INFO: renamed from: e */
    public VText f2037e;

    /* JADX INFO: renamed from: f */
    public VText f2038f;

    /* JADX INFO: renamed from: g */
    public VText f2039g;

    /* JADX INFO: renamed from: h */
    public VText f2040h;

    /* JADX INFO: renamed from: i */
    public VText f2041i;

    /* JADX INFO: renamed from: j */
    public VText f2042j;

    /* JADX INFO: renamed from: k */
    public VButton f2043k;

    /* JADX INFO: renamed from: l */
    public CountDownTimer f2044l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$a */
    public class ViewOnClickListenerC0192a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$a$a */
        public class a implements com.p1.mobile.android.app.a.a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ User f2046a;

            public a(User user) {
                this.f2046a = user;
            }

            /* JADX INFO: renamed from: a */
            public boolean m2756a(int i, int i2, Intent intent) {
                if (!NullChecker.a(CoreModule.c.e0.p9().subtract(this.f2046a))) {
                    return false;
                }
                CoreModule.c.m0.e0.onNext(roj0.a);
                return false;
            }
        }

        public ViewOnClickListenerC0192a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MarryModeEmptyView.this.getContext() == null || !(MarryModeEmptyView.this.getContext() instanceof Act)) {
                return;
            }
            Act context = MarryModeEmptyView.this.getContext();
            if (TextUtils.equals(MarryModeEmptyView.this.f2033a, "suggest_end")) {
                o0x.m19568B(context, false);
            } else if (TextUtils.equals(MarryModeEmptyView.this.f2033a, "suggest_empty")) {
                context.startActivityForResult(MarryProfileEditAct.Z1(context, "marry_series_type_mate"), new a(CoreModule.c.e0.p9().clone()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$b */
    public class CountDownTimerC0193b extends CountDownTimer {
        public CountDownTimerC0193b(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CoreModule.c.m0.e0.onNext(roj0.a);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            List listO = l9b.O(j);
            Iterator it = listO.iterator();
            String str = "";
            while (it.hasNext()) {
                str = str + " " + ((String) it.next());
            }
            if (listO.size() == 6) {
                MarryModeEmptyView.this.f2037e.setText((CharSequence) listO.get(0));
                MarryModeEmptyView.this.f2038f.setText((CharSequence) listO.get(1));
                MarryModeEmptyView.this.f2039g.setText((CharSequence) listO.get(2));
                MarryModeEmptyView.this.f2040h.setText((CharSequence) listO.get(3));
                MarryModeEmptyView.this.f2041i.setText((CharSequence) listO.get(4));
                MarryModeEmptyView.this.f2042j.setText((CharSequence) listO.get(5));
            }
        }
    }

    public MarryModeEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2033a = "suggest_empty";
        m2754b(context);
    }

    /* JADX INFO: renamed from: a */
    public void m2753a() {
        if (NullChecker.a(this.f2044l)) {
            this.f2044l.cancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2754b(Context context) {
        LayoutInflater.from(context).inflate(f6c0.O6, (ViewGroup) this, true);
        this.f2034b = findViewById(u4c0.ge);
        this.f2035c = findViewById(u4c0.ke);
        this.f2036d = findViewById(u4c0.Yd);
        this.f2037e = findViewById(u4c0.s5);
        this.f2038f = findViewById(u4c0.t5);
        this.f2039g = findViewById(u4c0.p8);
        this.f2040h = findViewById(u4c0.q8);
        this.f2041i = findViewById(u4c0.Sb);
        this.f2042j = findViewById(u4c0.Tb);
        VButton vButtonFindViewById = findViewById(u4c0.yd);
        this.f2043k = vButtonFindViewById;
        xdl0.E0(vButtonFindViewById, new ViewOnClickListenerC0192a());
    }

    /* JADX INFO: renamed from: c */
    public void m2755c(String str) {
        this.f2033a = str;
        if (!TextUtils.equals(str, "suggest_end")) {
            if (TextUtils.equals(str, "suggest_empty")) {
                this.f2034b.setText("暂无符合条件的理想伴侣");
                this.f2035c.setText("建议把期望值调低一些");
                xdl0.M(this.f2034b, true);
                xdl0.M(this.f2035c, true);
                xdl0.M(this.f2036d, false);
                this.f2043k.setText("修改条件");
                m2753a();
                return;
            }
            return;
        }
        this.f2034b.setText("今日推荐已用完");
        this.f2035c.setText("每天12点，为你推荐新朋友");
        xdl0.M(this.f2035c, true);
        xdl0.M(this.f2036d, true);
        this.f2043k.setText("切换到恋爱模式");
        m2753a();
        CountDownTimerC0193b countDownTimerC0193b = new CountDownTimerC0193b(l9b.P() - mqi0.m18550o(), 1000L);
        this.f2044l = countDownTimerC0193b;
        countDownTimerC0193b.start();
    }

    public String getType() {
        return this.f2033a;
    }

    public void setType(String str) {
        this.f2033a = str;
    }

    public MarryModeEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryModeEmptyView(@NonNull Context context) {
        this(context, null);
    }
}
