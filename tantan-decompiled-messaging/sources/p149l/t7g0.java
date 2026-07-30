package p149l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.json.JSONObject;
import p001D.Sudif;
import tech.sud.gip.C22396R;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class t7g0 extends oeg0 {

    /* JADX INFO: renamed from: v */
    public static final String f168716v = "SudGIP ".concat(t7g0.class.getSimpleName());

    /* JADX INFO: renamed from: c */
    public int f168717c = 0;

    /* JADX INFO: renamed from: d */
    public int f168718d = 0;

    /* JADX INFO: renamed from: e */
    public final Context f168719e;

    /* JADX INFO: renamed from: f */
    public final View f168720f;

    /* JADX INFO: renamed from: g */
    public final TextView f168721g;

    /* JADX INFO: renamed from: h */
    public final ImageView f168722h;

    /* JADX INFO: renamed from: i */
    public final ProgressBar f168723i;

    /* JADX INFO: renamed from: j */
    public final View f168724j;

    /* JADX INFO: renamed from: k */
    public final TextView f168725k;

    /* JADX INFO: renamed from: l */
    public final TextView f168726l;

    /* JADX INFO: renamed from: m */
    public final View f168727m;

    /* JADX INFO: renamed from: n */
    public final View f168728n;

    /* JADX INFO: renamed from: o */
    public final View f168729o;

    /* JADX INFO: renamed from: p */
    public final TextView f168730p;

    /* JADX INFO: renamed from: q */
    public final TextView f168731q;

    /* JADX INFO: renamed from: r */
    public final TextView f168732r;

    /* JADX INFO: renamed from: s */
    public final boolean f168733s;

    /* JADX INFO: renamed from: t */
    public final boolean f168734t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f168735u;

    public t7g0(Context context) {
        String string;
        Sudif sudif;
        hbg0 hbg0Var = sig0.f164716a;
        boolean z = hbg0Var.f106931b;
        this.f168733s = z;
        boolean z2 = hbg0Var.f106930a;
        this.f168734t = z2;
        this.f168719e = context;
        View viewInflate = LayoutInflater.from(context).inflate(C22396R.layout.fsm_mgp_game_loading_layout, (ViewGroup) null);
        this.f168720f = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(C22396R.id.reload_btn);
        this.f168721g = textView;
        ImageView imageView = (ImageView) viewInflate.findViewById(C22396R.id.big_loading_pic);
        this.f168722h = imageView;
        this.f168723i = (ProgressBar) viewInflate.findViewById(C22396R.id.loading_progress);
        this.f168724j = viewInflate.findViewById(C22396R.id.fsm_mgp_game_loading_progress);
        TextView textView2 = (TextView) viewInflate.findViewById(C22396R.id.loading_tip);
        this.f168725k = textView2;
        TextView textView3 = (TextView) viewInflate.findViewById(C22396R.id.loading_tip_result);
        this.f168726l = textView3;
        this.f168727m = viewInflate.findViewById(C22396R.id.loading_panel);
        View viewFindViewById = viewInflate.findViewById(C22396R.id.container_progress);
        this.f168728n = viewFindViewById;
        this.f168729o = viewInflate.findViewById(C22396R.id.fsm_mgp_container_timeout);
        this.f168730p = (TextView) viewInflate.findViewById(C22396R.id.fsm_mgp_tv_timeout_tip);
        TextView textView4 = (TextView) viewInflate.findViewById(C22396R.id.fsm_mgp_tv_continue_wait);
        this.f168731q = textView4;
        TextView textView5 = (TextView) viewInflate.findViewById(C22396R.id.fsm_mgp_tv_timeout_reload);
        this.f168732r = textView5;
        keg0 keg0VarM155146e = mlg0.m155146e();
        if (keg0VarM155146e == null || (sudif = keg0VarM155146e.f122708d) == null) {
            string = context.getText(C22396R.string.fsm_mgp_loading_reload_game).toString();
        } else {
            string = sudif.Suddo(mlg0.f134429d);
            if (TextUtils.isEmpty(string)) {
                string = context.getText(C22396R.string.fsm_mgp_loading_reload_game).toString();
            }
        }
        textView.setText(string);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.m7g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131826a.m187460e(view);
            }
        });
        if (!z2) {
            imageView.setVisibility(4);
        }
        if (z) {
            viewFindViewById.setVisibility(4);
            textView2.setVisibility(4);
            textView3.setVisibility(4);
        }
        textView4.setOnClickListener(new hog0(this));
        textView5.setOnClickListener(new brg0(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m187456a() {
        if (this.f168733s) {
            return;
        }
        this.f168729o.setVisibility(8);
    }

    /* JADX INFO: renamed from: b */
    public final void m187457b(int i, JSONObject jSONObject) {
        if (i == 1) {
            this.f168717c = 20;
            this.f143311a.f164291a.f180521w.m97556c("getMgInfo", 20, jSONObject);
        } else if (i == 2) {
            this.f168717c = 40;
            this.f143311a.f164291a.f180521w.m97556c("downloadCore", 40, jSONObject);
        } else if (i == 3) {
            this.f168717c = 80;
            this.f143311a.f164291a.f180521w.m97556c("checkoutGamePackage", 80, jSONObject);
        } else if (i == 5) {
            this.f168717c = 100;
            this.f143311a.f164291a.f180521w.m97556c("loadGamePercent", 100, jSONObject);
        }
        this.f168723i.setProgress(this.f168717c, true);
        sfg0 sfg0Var = this.f143311a;
        sfg0Var.f164291a.m197441b(2, 0, this.f168717c, false);
        m187462g();
        m187456a();
        m187458c(0, true, this.f168717c, false);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0138, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m187458c(int i, boolean z, int i2, boolean z2) {
        String str;
        String string;
        String string2;
        Sudif sudif;
        String string3;
        Sudif sudif2;
        keg0 keg0VarM155146e;
        String string4;
        String string5;
        Sudif sudif3;
        String string6;
        Sudif sudif4;
        if (!z2) {
            this.f168718d = i2;
        }
        int measuredWidth = this.f168724j.getMeasuredWidth();
        if (measuredWidth <= 0) {
            measuredWidth = (int) ((234.0f * this.f168719e.getResources().getDisplayMetrics().density) + 0.5f);
        }
        if (i == 0) {
            int i3 = -(measuredWidth - ((measuredWidth * i2) / 100));
            String str2 = mlg0.f134429d;
            if (str2 != null) {
                String strSubstring = str2.substring(0, 2);
                if (strSubstring.equals("ar") || strSubstring.equals("fa")) {
                    StringBuilder sb = new StringBuilder();
                    keg0 keg0VarM155146e2 = mlg0.m155146e();
                    if (keg0VarM155146e2 == null || (sudif4 = keg0VarM155146e2.f122705a) == null) {
                        string6 = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_loading).toString();
                    } else {
                        string6 = sudif4.Suddo(mlg0.f134429d);
                        if (TextUtils.isEmpty(string6)) {
                            string6 = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_loading).toString();
                        }
                    }
                    sb.append(string6);
                    sb.append(" (٪");
                    sb.append(i2);
                    sb.append(")");
                    string5 = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    keg0VarM155146e = mlg0.m155146e();
                    if (keg0VarM155146e != null || (sudif3 = keg0VarM155146e.f122705a) == null) {
                        string4 = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_loading).toString();
                    } else {
                        string4 = sudif3.Suddo(mlg0.f134429d);
                        if (TextUtils.isEmpty(string4)) {
                            string4 = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_loading).toString();
                        }
                    }
                    sb2.append(string4);
                    sb2.append(" (");
                    sb2.append(i2);
                    sb2.append("%)");
                    string5 = sb2.toString();
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                keg0VarM155146e = mlg0.m155146e();
                if (keg0VarM155146e != null) {
                    string4 = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_loading).toString();
                } else {
                    string4 = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_loading).toString();
                }
                sb3.append(string4);
                sb3.append(" (");
                sb3.append(i2);
                sb3.append("%)");
                string5 = sb3.toString();
            }
            int i4 = i3 <= 0 ? i3 : 0;
            this.f168726l.setText(string5);
            if (z) {
                this.f168726l.setTextColor(this.f168719e.getResources().getColor(C22396R.color.fsm_mgp_loading_tip_loading));
            }
            ViewGroup.LayoutParams layoutParams = this.f168724j.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i4);
                this.f168724j.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        int i5 = -(measuredWidth - ((measuredWidth * i2) / 100));
        if (i5 > 0) {
            i5 = 0;
        }
        String str3 = mlg0.f134429d;
        if (str3 != null) {
            String strSubstring2 = str3.substring(0, 2);
            if (strSubstring2.equals("ar") || strSubstring2.equals("fa")) {
                str = " (٪" + i2 + ") " + i;
            } else {
                str = " (" + i2 + "%) " + i;
            }
        } else {
            str = " (" + i2 + "%) " + i;
        }
        if (-10100 == i) {
            StringBuilder sb4 = new StringBuilder();
            keg0 keg0VarM155146e3 = mlg0.m155146e();
            if (keg0VarM155146e3 == null || (sudif2 = keg0VarM155146e3.f122707c) == null) {
                String str4 = mlg0.f134429d;
                string3 = (str4 == null || !str4.equals("zh-CN")) ? "Load fail, Please upgrade" : this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_fail_upgrade).toString();
            } else {
                string3 = sudif2.Suddo(mlg0.f134429d);
                if (TextUtils.isEmpty(string3)) {
                    string3 = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_fail_upgrade).toString();
                }
            }
            sb4.append(string3);
            sb4.append(str);
            string2 = sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder();
            keg0 keg0VarM155146e4 = mlg0.m155146e();
            if (keg0VarM155146e4 == null || (sudif = keg0VarM155146e4.f122706b) == null) {
                string = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_fail).toString();
            } else {
                string = sudif.Suddo(mlg0.f134429d);
                if (TextUtils.isEmpty(string)) {
                    string = this.f168719e.getText(C22396R.string.fsm_mgp_loading_tip_fail).toString();
                }
            }
            sb5.append(string);
            sb5.append(str);
            string2 = sb5.toString();
        }
        this.f168726l.setText(string2);
        if (z) {
            this.f168726l.setTextColor(this.f168719e.getResources().getColor(C22396R.color.fsm_mgp_loading_tip_fail));
        }
        ViewGroup.LayoutParams layoutParams2 = this.f168724j.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(i5);
            this.f168724j.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m187459d(long j, long j2, int i, int i2) {
        int i3 = (int) ((((long) i) * j) / j2);
        if (i3 < 0) {
            i3 = 0;
        }
        this.f168723i.setProgress(this.f168717c + i3, true);
        this.f143311a.f164291a.m197441b(2, 0, this.f168717c + i3, false);
        m187462g();
        m187456a();
        m187458c(0, false, this.f168717c + i3, false);
        if (j == j2) {
            this.f168717c = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m187460e(View view) {
        sfg0 sfg0Var = this.f143311a;
        sfg0Var.getClass();
        LogUtils.file("ProxySudFSTAPPImpl", "onLoadingRetry");
        SudLogger.m221565d(v8g0.f180492F, "onLoadingRetry");
        sfg0Var.f164291a.f180521w.m97561h();
        sfg0Var.f164291a.m197440a();
        v8g0 v8g0Var = sfg0Var.f164291a;
        v8g0Var.m197442c(v8g0Var.f180505g);
        this.f168721g.setVisibility(4);
    }

    /* JADX INFO: renamed from: f */
    public final void m187461f(String str) {
        w5g0 w5g0Var;
        int i;
        if (!this.f168734t || this.f168733s || TextUtils.isEmpty(str)) {
            return;
        }
        Context context = this.f168719e;
        if (x5g0.f191137j == null) {
            synchronized (x5g0.class) {
                try {
                    if (x5g0.f191137j == null) {
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            throw new IllegalArgumentException("Context must not be null.");
                        }
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        fpg0 fpg0Var = new fpg0(applicationContext2);
                        ueg0 ueg0Var = new ueg0(applicationContext2);
                        seg0 seg0Var = new seg0();
                        rqg0 rqg0Var = new rqg0(ueg0Var);
                        x5g0.f191137j = new x5g0(applicationContext2, new b6g0(applicationContext2, seg0Var, x5g0.f191136i, fpg0Var, ueg0Var, rqg0Var), ueg0Var, rqg0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        x5g0 x5g0Var = x5g0.f191137j;
        x5g0Var.getClass();
        if (str == null) {
            w5g0Var = new w5g0(x5g0Var, null);
        } else {
            if (str.trim().length() == 0) {
                ig3.m135964a("Path must not be empty.");
                return;
            }
            w5g0Var = new w5g0(x5g0Var, Uri.parse(str));
        }
        int i2 = w5g0Var.f184681c | 1;
        w5g0Var.f184681c = i2;
        int i3 = new int[]{2}[0];
        if (i3 == 0) {
            ig3.m135964a("Memory policy cannot be null.");
            return;
        }
        if (i3 == 1) {
            i = 1;
        } else {
            if (i3 != 2) {
                throw null;
            }
            i = 2;
        }
        w5g0Var.f184681c = i | i2;
        ImageView imageView = this.f168722h;
        System.nanoTime();
        slq0.m184847d();
        if (imageView == null) {
            ig3.m135964a("Target must not be null.");
            return;
        }
        if (w5g0Var.f184680b.f81934a == null) {
            w5g0Var.f184679a.m207085b(imageView);
            t9g0.m187631a(imageView);
            return;
        }
        w5g0.f184678d.getAndIncrement();
        cpg0 cpg0Var = w5g0Var.f184680b;
        if (cpg0Var.f81935b == 0) {
            cpg0Var.f81935b = 2;
        }
        Uri uri = cpg0Var.f81934a;
        dpg0 dpg0Var = new dpg0(uri, cpg0Var.f81935b);
        StringBuilder sb = slq0.f165256a;
        if (uri != null) {
            String string = uri.toString();
            sb.ensureCapacity(string.length() + 50);
            sb.append(string);
        } else {
            sb.ensureCapacity(50);
            sb.append(0);
        }
        sb.append('\n');
        String string2 = sb.toString();
        sb.setLength(0);
        if ((w5g0Var.f184681c & 1) == 0) {
            x5g0 x5g0Var2 = w5g0Var.f184679a;
            Bitmap bitmapM193253b = x5g0Var2.f191141d.m193253b(string2);
            rqg0 rqg0Var2 = x5g0Var2.f191142e;
            if (bitmapM193253b != null) {
                rqg0Var2.f160631b.sendEmptyMessage(0);
            } else {
                rqg0Var2.f160631b.sendEmptyMessage(1);
            }
            if (bitmapM193253b != null) {
                w5g0Var.f184679a.m207085b(imageView);
                t9g0.m187632b(imageView, w5g0Var.f184679a.f191139b, bitmapM193253b, 1);
                return;
            }
        }
        t9g0.m187631a(imageView);
        n9g0 n9g0Var = new n9g0(w5g0Var.f184679a, imageView, dpg0Var, w5g0Var.f184681c, string2);
        x5g0 x5g0Var3 = w5g0Var.f184679a;
        Object objM164511b = n9g0Var.m164511b();
        if (objM164511b != null && x5g0Var3.f191143f.get(objM164511b) != n9g0Var) {
            x5g0Var3.m207085b(objM164511b);
            x5g0Var3.f191143f.put(objM164511b, n9g0Var);
        }
        fng0 fng0Var = x5g0Var3.f191140c.f73813h;
        fng0Var.sendMessage(fng0Var.obtainMessage(1, n9g0Var));
    }

    /* JADX INFO: renamed from: g */
    public final void m187462g() {
        ValueAnimator valueAnimator = this.f168735u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f168735u = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m187463h() {
        m187462g();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 80);
        this.f168735u = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1000L);
        this.f168735u.setInterpolator(new LinearInterpolator());
        this.f168735u.addUpdateListener(new w6g0(this));
        this.f168735u.start();
    }
}
