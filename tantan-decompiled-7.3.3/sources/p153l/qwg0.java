package p153l;

import android.text.TextUtils;
import android.widget.TextView;
import p002D.Sudif;
import tech.sud.gip.C22511R;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qwg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ffg0 f159888a;

    public qwg0(ffg0 ffg0Var) {
        this.f159888a = ffg0Var;
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
        ffg0 ffg0Var = this.f159888a;
        synchronized (ffg0Var) {
            try {
                if (ffg0Var.f98769e) {
                    long j = ffg0Var.f98766b - ffg0Var.f98770f;
                    ffg0Var.f98766b = j;
                    if (j > 0) {
                        ffg0Var.m125371a();
                        return;
                    }
                    kzg0 kzg0Var = ffg0Var.f98767c;
                    if (kzg0Var != null) {
                        dhg0 dhg0Var = (dhg0) kzg0Var;
                        LogUtils.file("ProxySudFSTAPPImpl", "onLoadGameTimeout:");
                        bgg0 bgg0Var = dhg0Var.f88516p;
                        if (bgg0Var != null) {
                            int i = bgg0Var.f76622d;
                            if (dhg0Var.f88512l) {
                                dhg0Var.f88512l = false;
                                dhg0Var.f88523w.m142190b(i);
                            }
                            if (i >= 80) {
                                bgg0 bgg0Var2 = dhg0Var.f88516p;
                                if (!bgg0Var2.f76637s) {
                                    bgg0Var2.f76629k.setText("");
                                    bgg0Var2.f76633o.setVisibility(0);
                                    TextView textView = bgg0Var2.f76634p;
                                    smg0 smg0VarM198037e = utg0.m198037e();
                                    if (smg0VarM198037e == null || (sudif3 = smg0VarM198037e.f169579e) == null) {
                                        string = bgg0Var2.f76623e.getText(C22511R.string.fsm_mgp_continue_wait_tip).toString();
                                    } else {
                                        string = sudif3.Suddo(utg0.f180949d);
                                        if (TextUtils.isEmpty(string)) {
                                            string = bgg0Var2.f76623e.getText(C22511R.string.fsm_mgp_continue_wait_tip).toString();
                                        }
                                    }
                                    textView.setText(string);
                                    TextView textView2 = bgg0Var2.f76635q;
                                    smg0 smg0VarM198037e2 = utg0.m198037e();
                                    if (smg0VarM198037e2 == null || (sudif2 = smg0VarM198037e2.f169580f) == null) {
                                        string2 = bgg0Var2.f76623e.getText(C22511R.string.fsm_mgp_continue_wait).toString();
                                    } else {
                                        string2 = sudif2.Suddo(utg0.f180949d);
                                        if (TextUtils.isEmpty(string2)) {
                                            string2 = bgg0Var2.f76623e.getText(C22511R.string.fsm_mgp_continue_wait).toString();
                                        }
                                    }
                                    textView2.setText(string2);
                                    TextView textView3 = bgg0Var2.f76636r;
                                    smg0 smg0VarM198037e3 = utg0.m198037e();
                                    if (smg0VarM198037e3 != null && (sudif = smg0VarM198037e3.f169578d) != null) {
                                        strSuddo = sudif.Suddo(utg0.f180949d);
                                        if (TextUtils.isEmpty(strSuddo)) {
                                            string3 = bgg0Var2.f76623e.getText(C22511R.string.fsm_mgp_loading_reload_game).toString();
                                        }
                                        textView3.setText(strSuddo);
                                        return;
                                    }
                                    string3 = bgg0Var2.f76623e.getText(C22511R.string.fsm_mgp_loading_reload_game).toString();
                                    strSuddo = string3;
                                    textView3.setText(strSuddo);
                                    return;
                                }
                            }
                        }
                        dhg0Var.m115799a();
                        if (!dhg0Var.f88510j) {
                            dhg0Var.f88510j = true;
                            dhg0Var.m115800b(3, 0, 100, true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
