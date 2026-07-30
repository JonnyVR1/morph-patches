package p153l;

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
import p002D.Sudif;
import tech.sud.gip.C22511R;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bgg0 extends wmg0 {

    /* JADX INFO: renamed from: v */
    public static final String f76620v = "SudGIP ".concat(bgg0.class.getSimpleName());

    /* JADX INFO: renamed from: c */
    public int f76621c = 0;

    /* JADX INFO: renamed from: d */
    public int f76622d = 0;

    /* JADX INFO: renamed from: e */
    public final Context f76623e;

    /* JADX INFO: renamed from: f */
    public final View f76624f;

    /* JADX INFO: renamed from: g */
    public final TextView f76625g;

    /* JADX INFO: renamed from: h */
    public final ImageView f76626h;

    /* JADX INFO: renamed from: i */
    public final ProgressBar f76627i;

    /* JADX INFO: renamed from: j */
    public final View f76628j;

    /* JADX INFO: renamed from: k */
    public final TextView f76629k;

    /* JADX INFO: renamed from: l */
    public final TextView f76630l;

    /* JADX INFO: renamed from: m */
    public final View f76631m;

    /* JADX INFO: renamed from: n */
    public final View f76632n;

    /* JADX INFO: renamed from: o */
    public final View f76633o;

    /* JADX INFO: renamed from: p */
    public final TextView f76634p;

    /* JADX INFO: renamed from: q */
    public final TextView f76635q;

    /* JADX INFO: renamed from: r */
    public final TextView f76636r;

    /* JADX INFO: renamed from: s */
    public final boolean f76637s;

    /* JADX INFO: renamed from: t */
    public final boolean f76638t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f76639u;

    public bgg0(Context context) {
        String string;
        Sudif sudif;
        pjg0 pjg0Var = arg0.f72934a;
        boolean z = pjg0Var.f152693b;
        this.f76637s = z;
        boolean z2 = pjg0Var.f152692a;
        this.f76638t = z2;
        this.f76623e = context;
        View viewInflate = LayoutInflater.from(context).inflate(C22511R.layout.fsm_mgp_game_loading_layout, (ViewGroup) null);
        this.f76624f = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(C22511R.id.reload_btn);
        this.f76625g = textView;
        ImageView imageView = (ImageView) viewInflate.findViewById(C22511R.id.big_loading_pic);
        this.f76626h = imageView;
        this.f76627i = (ProgressBar) viewInflate.findViewById(C22511R.id.loading_progress);
        this.f76628j = viewInflate.findViewById(C22511R.id.fsm_mgp_game_loading_progress);
        TextView textView2 = (TextView) viewInflate.findViewById(C22511R.id.loading_tip);
        this.f76629k = textView2;
        TextView textView3 = (TextView) viewInflate.findViewById(C22511R.id.loading_tip_result);
        this.f76630l = textView3;
        this.f76631m = viewInflate.findViewById(C22511R.id.loading_panel);
        View viewFindViewById = viewInflate.findViewById(C22511R.id.container_progress);
        this.f76632n = viewFindViewById;
        this.f76633o = viewInflate.findViewById(C22511R.id.fsm_mgp_container_timeout);
        this.f76634p = (TextView) viewInflate.findViewById(C22511R.id.fsm_mgp_tv_timeout_tip);
        TextView textView4 = (TextView) viewInflate.findViewById(C22511R.id.fsm_mgp_tv_continue_wait);
        this.f76635q = textView4;
        TextView textView5 = (TextView) viewInflate.findViewById(C22511R.id.fsm_mgp_tv_timeout_reload);
        this.f76636r = textView5;
        smg0 smg0VarM198037e = utg0.m198037e();
        if (smg0VarM198037e == null || (sudif = smg0VarM198037e.f169578d) == null) {
            string = context.getText(C22511R.string.fsm_mgp_loading_reload_game).toString();
        } else {
            string = sudif.Suddo(utg0.f180949d);
            if (TextUtils.isEmpty(string)) {
                string = context.getText(C22511R.string.fsm_mgp_loading_reload_game).toString();
            }
        }
        textView.setText(string);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ufg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178764a.m104166e(view);
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
        textView4.setOnClickListener(new pwg0(this));
        textView5.setOnClickListener(new jzg0(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m104162a() {
        if (this.f76637s) {
            return;
        }
        this.f76633o.setVisibility(8);
    }

    /* JADX INFO: renamed from: b */
    public final void m104163b(int i, JSONObject jSONObject) {
        if (i == 1) {
            this.f76621c = 20;
            this.f189794a.f72452a.f88523w.m142191c("getMgInfo", 20, jSONObject);
        } else if (i == 2) {
            this.f76621c = 40;
            this.f189794a.f72452a.f88523w.m142191c("downloadCore", 40, jSONObject);
        } else if (i == 3) {
            this.f76621c = 80;
            this.f189794a.f72452a.f88523w.m142191c("checkoutGamePackage", 80, jSONObject);
        } else if (i == 5) {
            this.f76621c = 100;
            this.f189794a.f72452a.f88523w.m142191c("loadGamePercent", 100, jSONObject);
        }
        this.f76627i.setProgress(this.f76621c, true);
        aog0 aog0Var = this.f189794a;
        aog0Var.f72452a.m115800b(2, 0, this.f76621c, false);
        m104168g();
        m104162a();
        m104164c(0, true, this.f76621c, false);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0138, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m104164c(int i, boolean z, int i2, boolean z2) {
        String str;
        String string;
        String string2;
        Sudif sudif;
        String string3;
        Sudif sudif2;
        smg0 smg0VarM198037e;
        String string4;
        String string5;
        Sudif sudif3;
        String string6;
        Sudif sudif4;
        if (!z2) {
            this.f76622d = i2;
        }
        int measuredWidth = this.f76628j.getMeasuredWidth();
        if (measuredWidth <= 0) {
            measuredWidth = (int) ((234.0f * this.f76623e.getResources().getDisplayMetrics().density) + 0.5f);
        }
        if (i == 0) {
            int i3 = -(measuredWidth - ((measuredWidth * i2) / 100));
            String str2 = utg0.f180949d;
            if (str2 != null) {
                String strSubstring = str2.substring(0, 2);
                if (strSubstring.equals("ar") || strSubstring.equals("fa")) {
                    StringBuilder sb = new StringBuilder();
                    smg0 smg0VarM198037e2 = utg0.m198037e();
                    if (smg0VarM198037e2 == null || (sudif4 = smg0VarM198037e2.f169575a) == null) {
                        string6 = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_loading).toString();
                    } else {
                        string6 = sudif4.Suddo(utg0.f180949d);
                        if (TextUtils.isEmpty(string6)) {
                            string6 = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_loading).toString();
                        }
                    }
                    sb.append(string6);
                    sb.append(" (٪");
                    sb.append(i2);
                    sb.append(")");
                    string5 = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    smg0VarM198037e = utg0.m198037e();
                    if (smg0VarM198037e != null || (sudif3 = smg0VarM198037e.f169575a) == null) {
                        string4 = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_loading).toString();
                    } else {
                        string4 = sudif3.Suddo(utg0.f180949d);
                        if (TextUtils.isEmpty(string4)) {
                            string4 = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_loading).toString();
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
                smg0VarM198037e = utg0.m198037e();
                if (smg0VarM198037e != null) {
                    string4 = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_loading).toString();
                } else {
                    string4 = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_loading).toString();
                }
                sb3.append(string4);
                sb3.append(" (");
                sb3.append(i2);
                sb3.append("%)");
                string5 = sb3.toString();
            }
            int i4 = i3 <= 0 ? i3 : 0;
            this.f76630l.setText(string5);
            if (z) {
                this.f76630l.setTextColor(this.f76623e.getResources().getColor(C22511R.color.fsm_mgp_loading_tip_loading));
            }
            ViewGroup.LayoutParams layoutParams = this.f76628j.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i4);
                this.f76628j.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        int i5 = -(measuredWidth - ((measuredWidth * i2) / 100));
        if (i5 > 0) {
            i5 = 0;
        }
        String str3 = utg0.f180949d;
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
            smg0 smg0VarM198037e3 = utg0.m198037e();
            if (smg0VarM198037e3 == null || (sudif2 = smg0VarM198037e3.f169577c) == null) {
                String str4 = utg0.f180949d;
                string3 = (str4 == null || !str4.equals("zh-CN")) ? "Load fail, Please upgrade" : this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_fail_upgrade).toString();
            } else {
                string3 = sudif2.Suddo(utg0.f180949d);
                if (TextUtils.isEmpty(string3)) {
                    string3 = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_fail_upgrade).toString();
                }
            }
            sb4.append(string3);
            sb4.append(str);
            string2 = sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder();
            smg0 smg0VarM198037e4 = utg0.m198037e();
            if (smg0VarM198037e4 == null || (sudif = smg0VarM198037e4.f169576b) == null) {
                string = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_fail).toString();
            } else {
                string = sudif.Suddo(utg0.f180949d);
                if (TextUtils.isEmpty(string)) {
                    string = this.f76623e.getText(C22511R.string.fsm_mgp_loading_tip_fail).toString();
                }
            }
            sb5.append(string);
            sb5.append(str);
            string2 = sb5.toString();
        }
        this.f76630l.setText(string2);
        if (z) {
            this.f76630l.setTextColor(this.f76623e.getResources().getColor(C22511R.color.fsm_mgp_loading_tip_fail));
        }
        ViewGroup.LayoutParams layoutParams2 = this.f76628j.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(i5);
            this.f76628j.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m104165d(long j, long j2, int i, int i2) {
        int i3 = (int) ((((long) i) * j) / j2);
        if (i3 < 0) {
            i3 = 0;
        }
        this.f76627i.setProgress(this.f76621c + i3, true);
        this.f189794a.f72452a.m115800b(2, 0, this.f76621c + i3, false);
        m104168g();
        m104162a();
        m104164c(0, false, this.f76621c + i3, false);
        if (j == j2) {
            this.f76621c = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m104166e(View view) {
        aog0 aog0Var = this.f189794a;
        aog0Var.getClass();
        LogUtils.file("ProxySudFSTAPPImpl", "onLoadingRetry");
        SudLogger.m222811d(dhg0.f88494F, "onLoadingRetry");
        aog0Var.f72452a.f88523w.m142196h();
        aog0Var.f72452a.m115799a();
        dhg0 dhg0Var = aog0Var.f72452a;
        dhg0Var.m115801c(dhg0Var.f88507g);
        this.f76625g.setVisibility(4);
    }

    /* JADX INFO: renamed from: f */
    public final void m104167f(String str) {
        eeg0 eeg0Var;
        int i;
        if (!this.f76638t || this.f76637s || TextUtils.isEmpty(str)) {
            return;
        }
        Context context = this.f76623e;
        if (feg0.f98666j == null) {
            synchronized (feg0.class) {
                try {
                    if (feg0.f98666j == null) {
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            throw new IllegalArgumentException("Context must not be null.");
                        }
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        nxg0 nxg0Var = new nxg0(applicationContext2);
                        cng0 cng0Var = new cng0(applicationContext2);
                        ang0 ang0Var = new ang0();
                        zyg0 zyg0Var = new zyg0(cng0Var);
                        feg0.f98666j = new feg0(applicationContext2, new jeg0(applicationContext2, ang0Var, feg0.f98665i, nxg0Var, cng0Var, zyg0Var), cng0Var, zyg0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        feg0 feg0Var = feg0.f98666j;
        feg0Var.getClass();
        if (str == null) {
            eeg0Var = new eeg0(feg0Var, null);
        } else {
            if (str.trim().length() == 0) {
                wg3.m206174a("Path must not be empty.");
                return;
            }
            eeg0Var = new eeg0(feg0Var, Uri.parse(str));
        }
        int i2 = eeg0Var.f93645c | 1;
        eeg0Var.f93645c = i2;
        int i3 = new int[]{2}[0];
        if (i3 == 0) {
            wg3.m206174a("Memory policy cannot be null.");
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
        eeg0Var.f93645c = i | i2;
        ImageView imageView = this.f76626h;
        System.nanoTime();
        yuq0.m217468d();
        if (imageView == null) {
            wg3.m206174a("Target must not be null.");
            return;
        }
        if (eeg0Var.f93644b.f129205a == null) {
            eeg0Var.f93643a.m125309b(imageView);
            big0.m104462a(imageView);
            return;
        }
        eeg0.f93642d.getAndIncrement();
        kxg0 kxg0Var = eeg0Var.f93644b;
        if (kxg0Var.f129206b == 0) {
            kxg0Var.f129206b = 2;
        }
        Uri uri = kxg0Var.f129205a;
        lxg0 lxg0Var = new lxg0(uri, kxg0Var.f129206b);
        StringBuilder sb = yuq0.f201657a;
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
        if ((eeg0Var.f93645c & 1) == 0) {
            feg0 feg0Var2 = eeg0Var.f93643a;
            Bitmap bitmapM111516b = feg0Var2.f98670d.m111516b(string2);
            zyg0 zyg0Var2 = feg0Var2.f98671e;
            if (bitmapM111516b != null) {
                zyg0Var2.f206579b.sendEmptyMessage(0);
            } else {
                zyg0Var2.f206579b.sendEmptyMessage(1);
            }
            if (bitmapM111516b != null) {
                eeg0Var.f93643a.m125309b(imageView);
                big0.m104463b(imageView, eeg0Var.f93643a.f98668b, bitmapM111516b, 1);
                return;
            }
        }
        big0.m104462a(imageView);
        vhg0 vhg0Var = new vhg0(eeg0Var.f93643a, imageView, lxg0Var, eeg0Var.f93645c, string2);
        feg0 feg0Var3 = eeg0Var.f93643a;
        Object objM207517b = vhg0Var.m207517b();
        if (objM207517b != null && feg0Var3.f98672f.get(objM207517b) != vhg0Var) {
            feg0Var3.m125309b(objM207517b);
            feg0Var3.f98672f.put(objM207517b, vhg0Var);
        }
        nvg0 nvg0Var = feg0Var3.f98669c.f120493h;
        nvg0Var.sendMessage(nvg0Var.obtainMessage(1, vhg0Var));
    }

    /* JADX INFO: renamed from: g */
    public final void m104168g() {
        ValueAnimator valueAnimator = this.f76639u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f76639u = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m104169h() {
        m104168g();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 80);
        this.f76639u = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1000L);
        this.f76639u.setInterpolator(new LinearInterpolator());
        this.f76639u.addUpdateListener(new efg0(this));
        this.f76639u.start();
    }
}
