package p153l;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.C2216m0;
import com.google.android.gms.internal.ads.C2232o0;
import com.google.android.gms.internal.ads.C2240p0;
import com.google.android.gms.internal.ads.C2288v0;
import com.google.android.gms.internal.ads.C2322z2;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcei;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class mav0 {

    /* JADX INFO: renamed from: a */
    public final fcs0 f135598a;

    /* JADX INFO: renamed from: b */
    public final Context f135599b;

    /* JADX INFO: renamed from: c */
    public final l9v0 f135600c;

    /* JADX INFO: renamed from: d */
    public final zzcei f135601d;

    /* JADX INFO: renamed from: e */
    public final String f135602e;

    /* JADX INFO: renamed from: f */
    public final vcw0 f135603f;

    /* JADX INFO: renamed from: g */
    public final grw0 f135604g = bxy0.m106933q().m120264i();

    public mav0(Context context, zzcei zzceiVar, fcs0 fcs0Var, l9v0 l9v0Var, String str, vcw0 vcw0Var) {
        this.f135599b = context;
        this.f135601d = zzceiVar;
        this.f135598a = fcs0Var;
        this.f135600c = l9v0Var;
        this.f135602e = str;
        this.f135603f = vcw0Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m157752c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jM13115R = 0;
        for (int i = 0; i < size; i++) {
            C2232o0 c2232o0 = (C2232o0) arrayList.get(i);
            if (c2232o0.m13122j0() == 2 && c2232o0.m13115R() > jM13115R) {
                jM13115R = c2232o0.m13115R();
            }
        }
        if (jM13115R != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jM13115R));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Void m157753a(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.f135599b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
            ucw0 ucw0VarM195443b = ucw0.m195443b("oa_upload");
            ucw0VarM195443b.m195445a("oa_failed_reqs", String.valueOf(fav0.m124783a(sQLiteDatabase, 0)));
            ucw0VarM195443b.m195445a("oa_total_reqs", String.valueOf(fav0.m124783a(sQLiteDatabase, 1)));
            ucw0VarM195443b.m195445a("oa_upload_time", String.valueOf(bxy0.m106918b().currentTimeMillis()));
            ucw0VarM195443b.m195445a("oa_last_successful_time", String.valueOf(fav0.m124784b(sQLiteDatabase, 2)));
            ucw0VarM195443b.m195445a("oa_session_id", this.f135604g.mo131896f() ? "" : this.f135602e);
            this.f135603f.mo125151a(ucw0VarM195443b);
            ArrayList arrayListM124785c = fav0.m124785c(sQLiteDatabase);
            m157752c(sQLiteDatabase, arrayListM124785c);
            int size = arrayListM124785c.size();
            for (int i = 0; i < size; i++) {
                C2232o0 c2232o0 = (C2232o0) arrayListM124785c.get(i);
                grw0 grw0Var = this.f135604g;
                ucw0 ucw0VarM195443b2 = ucw0.m195443b("oa_signals");
                ucw0VarM195443b2.m195445a("oa_session_id", grw0Var.mo131896f() ? "" : this.f135602e);
                C2216m0 c2216m0M13116S = c2232o0.m13116S();
                String strValueOf = c2216m0M13116S.m12953P() ? String.valueOf(c2216m0M13116S.m12955R() - 1) : User.ID_TEAM_ACCOUNT;
                String string = C2322z2.m13568b(c2232o0.m13118X(), new eow0() { // from class: l.lav0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        return ((zzbcn) obj).name();
                    }
                }).toString();
                ucw0VarM195443b2.m195445a("oa_sig_ts", String.valueOf(c2232o0.m13115R()));
                ucw0VarM195443b2.m195445a("oa_sig_status", String.valueOf(c2232o0.m13122j0() - 1));
                ucw0VarM195443b2.m195445a("oa_sig_resp_lat", String.valueOf(c2232o0.m13114Q()));
                ucw0VarM195443b2.m195445a("oa_sig_render_lat", String.valueOf(c2232o0.m13113P()));
                ucw0VarM195443b2.m195445a("oa_sig_formats", string);
                ucw0VarM195443b2.m195445a("oa_sig_nw_type", strValueOf);
                ucw0VarM195443b2.m195445a("oa_sig_wifi", String.valueOf(c2232o0.m13123k0() - 1));
                ucw0VarM195443b2.m195445a("oa_sig_airplane", String.valueOf(c2232o0.m13119g0() - 1));
                ucw0VarM195443b2.m195445a("oa_sig_data", String.valueOf(c2232o0.m13120h0() - 1));
                ucw0VarM195443b2.m195445a("oa_sig_nw_resp", String.valueOf(c2232o0.m13112O()));
                ucw0VarM195443b2.m195445a("oa_sig_offline", String.valueOf(c2232o0.m13121i0() - 1));
                ucw0VarM195443b2.m195445a("oa_sig_nw_state", String.valueOf(c2232o0.m13117W().zza()));
                if (c2216m0M13116S.m12952O() && c2216m0M13116S.m12953P() && c2216m0M13116S.m12955R() == 2) {
                    ucw0VarM195443b2.m195445a("oa_sig_cell_type", String.valueOf(c2216m0M13116S.m12954Q() - 1));
                }
                this.f135603f.mo125151a(ucw0VarM195443b2);
            }
        } else {
            ArrayList arrayListM124785c2 = fav0.m124785c(sQLiteDatabase);
            Context context = this.f135599b;
            mes0 mes0VarM13169L = C2240p0.m13169L();
            mes0VarM13169L.m158091r(context.getPackageName());
            mes0VarM13169L.m158093t(Build.MODEL);
            mes0VarM13169L.m158094u(fav0.m124783a(sQLiteDatabase, 0));
            mes0VarM13169L.m158090q(arrayListM124785c2);
            mes0VarM13169L.m158096w(fav0.m124783a(sQLiteDatabase, 1));
            mes0VarM13169L.m158092s(fav0.m124783a(sQLiteDatabase, 3));
            mes0VarM13169L.m158097x(bxy0.m106918b().currentTimeMillis());
            mes0VarM13169L.m158095v(fav0.m124784b(sQLiteDatabase, 2));
            final C2240p0 c2240p0 = (C2240p0) mes0VarM13169L.m185950m();
            m157752c(sQLiteDatabase, arrayListM124785c2);
            this.f135598a.m125046b(new ecs0() { // from class: l.jav0
                @Override // p153l.ecs0
                /* JADX INFO: renamed from: a */
                public final void mo12872a(yds0 yds0Var) {
                    yds0Var.m215288y(c2240p0);
                }
            });
            zzcei zzceiVar = this.f135601d;
            bfs0 bfs0VarM13424L = C2288v0.m13424L();
            bfs0VarM13424L.m103981q(zzceiVar.zzb);
            bfs0VarM13424L.m103983s(this.f135601d.zzc);
            bfs0VarM13424L.m103982r(true == this.f135601d.zzd ? 0 : 2);
            final C2288v0 c2288v0 = (C2288v0) bfs0VarM13424L.m185950m();
            this.f135598a.m125046b(new ecs0() { // from class: l.kav0
                @Override // p153l.ecs0
                /* JADX INFO: renamed from: a */
                public final void mo12872a(yds0 yds0Var) {
                    kds0 kds0Var = (kds0) yds0Var.m215281r().m13241k();
                    kds0Var.m149264r(c2288v0);
                    yds0Var.m215286w(kds0Var);
                }
            });
            this.f135598a.m125047c(10004);
        }
        fav0.m124788f(sQLiteDatabase);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m157754b(final boolean z) {
        try {
            this.f135600c.m153463a(new kbw0() { // from class: l.iav0
                @Override // p153l.kbw0
                public final Object zza(Object obj) throws Exception {
                    this.f113625a.m157753a(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            dct0.m115295d("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
