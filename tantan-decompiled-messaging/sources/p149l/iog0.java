package p149l;

import android.text.TextUtils;
import android.widget.TextView;
import p001D.Sudif;
import tech.sud.gip.C22396R;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class iog0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x6g0 f114159a;

    public iog0(x6g0 x6g0Var) {
        this.f114159a = x6g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        String string2;
        String string3;
        String strSuddo;
        Sudif sudif;
        Sudif sudif2;
        Sudif sudif3;
        x6g0 x6g0Var = this.f114159a;
        synchronized (x6g0Var) {
            try {
                if (x6g0Var.f191240e) {
                    long j = x6g0Var.f191237b - x6g0Var.f191241f;
                    x6g0Var.f191237b = j;
                    if (j > 0) {
                        x6g0Var.m207174a();
                        return;
                    }
                    crg0 crg0Var = x6g0Var.f191238c;
                    if (crg0Var != null) {
                        v8g0 v8g0Var = (v8g0) crg0Var;
                        LogUtils.file("ProxySudFSTAPPImpl", "onLoadGameTimeout:");
                        t7g0 t7g0Var = v8g0Var.f180514p;
                        if (t7g0Var != null) {
                            int i = t7g0Var.f168718d;
                            if (v8g0Var.f180510l) {
                                v8g0Var.f180510l = false;
                                v8g0Var.f180521w.m97555b(i);
                            }
                            if (i >= 80) {
                                t7g0 t7g0Var2 = v8g0Var.f180514p;
                                if (!t7g0Var2.f168733s) {
                                    t7g0Var2.f168725k.setText("");
                                    t7g0Var2.f168729o.setVisibility(0);
                                    TextView textView = t7g0Var2.f168730p;
                                    keg0 keg0VarM155146e = mlg0.m155146e();
                                    if (keg0VarM155146e == null || (sudif3 = keg0VarM155146e.f122709e) == null) {
                                        string = t7g0Var2.f168719e.getText(C22396R.string.fsm_mgp_continue_wait_tip).toString();
                                    } else {
                                        string = sudif3.Suddo(mlg0.f134429d);
                                        if (TextUtils.isEmpty(string)) {
                                            string = t7g0Var2.f168719e.getText(C22396R.string.fsm_mgp_continue_wait_tip).toString();
                                        }
                                    }
                                    textView.setText(string);
                                    TextView textView2 = t7g0Var2.f168731q;
                                    keg0 keg0VarM155146e2 = mlg0.m155146e();
                                    if (keg0VarM155146e2 == null || (sudif2 = keg0VarM155146e2.f122710f) == null) {
                                        string2 = t7g0Var2.f168719e.getText(C22396R.string.fsm_mgp_continue_wait).toString();
                                    } else {
                                        string2 = sudif2.Suddo(mlg0.f134429d);
                                        if (TextUtils.isEmpty(string2)) {
                                            string2 = t7g0Var2.f168719e.getText(C22396R.string.fsm_mgp_continue_wait).toString();
                                        }
                                    }
                                    textView2.setText(string2);
                                    TextView textView3 = t7g0Var2.f168732r;
                                    keg0 keg0VarM155146e3 = mlg0.m155146e();
                                    if (keg0VarM155146e3 != null && (sudif = keg0VarM155146e3.f122708d) != null) {
                                        strSuddo = sudif.Suddo(mlg0.f134429d);
                                        if (TextUtils.isEmpty(strSuddo)) {
                                            string3 = t7g0Var2.f168719e.getText(C22396R.string.fsm_mgp_loading_reload_game).toString();
                                        }
                                        textView3.setText(strSuddo);
                                        return;
                                    }
                                    string3 = t7g0Var2.f168719e.getText(C22396R.string.fsm_mgp_loading_reload_game).toString();
                                    strSuddo = string3;
                                    textView3.setText(strSuddo);
                                    return;
                                }
                            }
                        }
                        v8g0Var.m197440a();
                        if (!v8g0Var.f180508j) {
                            v8g0Var.f180508j = true;
                            v8g0Var.m197441b(3, 0, 100, true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
