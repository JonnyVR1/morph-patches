package com.p046p1.mobile.putong.core.newui.home.marrymode;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p147v.VButton;
import p147v.VLinear;
import p147v.VText;
import p149l.f6c0;
import p149l.l9b;
import p149l.mqi0;
import p149l.o0x;
import p149l.roj0;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MarryModeEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public String f23255a;

    /* JADX INFO: renamed from: b */
    public VText f23256b;

    /* JADX INFO: renamed from: c */
    public VText f23257c;

    /* JADX INFO: renamed from: d */
    public VLinear f23258d;

    /* JADX INFO: renamed from: e */
    public VText f23259e;

    /* JADX INFO: renamed from: f */
    public VText f23260f;

    /* JADX INFO: renamed from: g */
    public VText f23261g;

    /* JADX INFO: renamed from: h */
    public VText f23262h;

    /* JADX INFO: renamed from: i */
    public VText f23263i;

    /* JADX INFO: renamed from: j */
    public VText f23264j;

    /* JADX INFO: renamed from: k */
    public VButton f23265k;

    /* JADX INFO: renamed from: l */
    public CountDownTimer f23266l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$a */
    public class ViewOnClickListenerC8028a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$a$a */
        public class a implements C4317a.a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ User f23268a;

            public a(User user) {
                this.f23268a = user;
            }

            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public boolean mo20401a(int i, int i2, Intent intent) {
                if (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9().subtract(this.f23268a))) {
                    return false;
                }
                CoreModule.f17545c.f19663m0.f19406e0.onNext(roj0.f160388a);
                return false;
            }
        }

        public ViewOnClickListenerC8028a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MarryModeEmptyView.this.getContext() == null || !(MarryModeEmptyView.this.getContext() instanceof Act)) {
                return;
            }
            Act act = (Act) MarryModeEmptyView.this.getContext();
            if (TextUtils.equals(MarryModeEmptyView.this.f23255a, "suggest_end")) {
                o0x.m162188B(act, false);
            } else if (TextUtils.equals(MarryModeEmptyView.this.f23255a, "suggest_empty")) {
                act.startActivityForResult(MarryProfileEditAct.m47419Z1(act, "marry_series_type_mate"), new a(CoreModule.f17545c.f19639e0.m169527p9().mo223809clone()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView$b */
    public class CountDownTimerC8029b extends CountDownTimer {
        public CountDownTimerC8029b(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CoreModule.f17545c.f19663m0.f19406e0.onNext(roj0.f160388a);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            List<String> listM149006O = l9b.m149006O(j);
            Iterator<String> it = listM149006O.iterator();
            String str = "";
            while (it.hasNext()) {
                str = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + it.next();
            }
            if (listM149006O.size() == 6) {
                MarryModeEmptyView.this.f23259e.setText(listM149006O.get(0));
                MarryModeEmptyView.this.f23260f.setText(listM149006O.get(1));
                MarryModeEmptyView.this.f23261g.setText(listM149006O.get(2));
                MarryModeEmptyView.this.f23262h.setText(listM149006O.get(3));
                MarryModeEmptyView.this.f23263i.setText(listM149006O.get(4));
                MarryModeEmptyView.this.f23264j.setText(listM149006O.get(5));
            }
        }
    }

    public MarryModeEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23255a = "suggest_empty";
        m38765b(context);
    }

    /* JADX INFO: renamed from: a */
    public void m38764a() {
        if (NullChecker.m81303a(this.f23266l)) {
            this.f23266l.cancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38765b(Context context) {
        LayoutInflater.from(context).inflate(f6c0.f95497O6, (ViewGroup) this, true);
        this.f23256b = (VText) findViewById(u4c0.f174268ge);
        this.f23257c = (VText) findViewById(u4c0.f174335ke);
        this.f23258d = (VLinear) findViewById(u4c0.f174133Yd);
        this.f23259e = (VText) findViewById(u4c0.f174462s5);
        this.f23260f = (VText) findViewById(u4c0.f174479t5);
        this.f23261g = (VText) findViewById(u4c0.f174414p8);
        this.f23262h = (VText) findViewById(u4c0.f174431q8);
        this.f23263i = (VText) findViewById(u4c0.f174034Sb);
        this.f23264j = (VText) findViewById(u4c0.f174051Tb);
        VButton vButton = (VButton) findViewById(u4c0.f174572yd);
        this.f23265k = vButton;
        xdl0.m208329E0(vButton, new ViewOnClickListenerC8028a());
    }

    /* JADX INFO: renamed from: c */
    public void m38766c(String str) {
        this.f23255a = str;
        if (!TextUtils.equals(str, "suggest_end")) {
            if (TextUtils.equals(str, "suggest_empty")) {
                this.f23256b.setText("暂无符合条件的理想伴侣");
                this.f23257c.setText("建议把期望值调低一些");
                xdl0.m208344M(this.f23256b, true);
                xdl0.m208344M(this.f23257c, true);
                xdl0.m208344M(this.f23258d, false);
                this.f23265k.setText("修改条件");
                m38764a();
                return;
            }
            return;
        }
        this.f23256b.setText("今日推荐已用完");
        this.f23257c.setText("每天12点，为你推荐新朋友");
        xdl0.m208344M(this.f23257c, true);
        xdl0.m208344M(this.f23258d, true);
        this.f23265k.setText("切换到恋爱模式");
        m38764a();
        CountDownTimerC8029b countDownTimerC8029b = new CountDownTimerC8029b(l9b.m149007P() - mqi0.m155944o(), 1000L);
        this.f23266l = countDownTimerC8029b;
        countDownTimerC8029b.start();
    }

    public String getType() {
        return this.f23255a;
    }

    public void setType(String str) {
        this.f23255a = str;
    }

    public MarryModeEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryModeEmptyView(@NonNull Context context) {
        this(context, null);
    }
}
