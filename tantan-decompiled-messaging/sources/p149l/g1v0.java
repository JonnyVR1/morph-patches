package p149l;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.C2193m0;
import com.google.android.gms.internal.ads.C2209o0;
import com.google.android.gms.internal.ads.C2217p0;
import com.google.android.gms.internal.ads.C2265v0;
import com.google.android.gms.internal.ads.C2299z2;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcei;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class g1v0 {

    /* JADX INFO: renamed from: a */
    public final z2s0 f100213a;

    /* JADX INFO: renamed from: b */
    public final Context f100214b;

    /* JADX INFO: renamed from: c */
    public final f0v0 f100215c;

    /* JADX INFO: renamed from: d */
    public final zzcei f100216d;

    /* JADX INFO: renamed from: e */
    public final String f100217e;

    /* JADX INFO: renamed from: f */
    public final p3w0 f100218f;

    /* JADX INFO: renamed from: g */
    public final aiw0 f100219g = vny0.m199079q().m212279i();

    public g1v0(Context context, zzcei zzceiVar, z2s0 z2s0Var, f0v0 f0v0Var, String str, p3w0 p3w0Var) {
        this.f100214b = context;
        this.f100216d = zzceiVar;
        this.f100213a = z2s0Var;
        this.f100215c = f0v0Var;
        this.f100217e = str;
        this.f100218f = p3w0Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m124089c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jM13061R = 0;
        for (int i = 0; i < size; i++) {
            C2209o0 c2209o0 = (C2209o0) arrayList.get(i);
            if (c2209o0.m13068j0() == 2 && c2209o0.m13061R() > jM13061R) {
                jM13061R = c2209o0.m13061R();
            }
        }
        if (jM13061R != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jM13061R));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Void m124090a(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.f100214b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
            o3w0 o3w0VarM162489b = o3w0.m162489b("oa_upload");
            o3w0VarM162489b.m162491a("oa_failed_reqs", String.valueOf(z0v0.m216761a(sQLiteDatabase, 0)));
            o3w0VarM162489b.m162491a("oa_total_reqs", String.valueOf(z0v0.m216761a(sQLiteDatabase, 1)));
            o3w0VarM162489b.m162491a("oa_upload_time", String.valueOf(vny0.m199064b().currentTimeMillis()));
            o3w0VarM162489b.m162491a("oa_last_successful_time", String.valueOf(z0v0.m216762b(sQLiteDatabase, 2)));
            o3w0VarM162489b.m162491a("oa_session_id", this.f100219g.mo96947f() ? "" : this.f100217e);
            this.f100218f.mo124429a(o3w0VarM162489b);
            ArrayList arrayListM216763c = z0v0.m216763c(sQLiteDatabase);
            m124089c(sQLiteDatabase, arrayListM216763c);
            int size = arrayListM216763c.size();
            for (int i = 0; i < size; i++) {
                C2209o0 c2209o0 = (C2209o0) arrayListM216763c.get(i);
                aiw0 aiw0Var = this.f100219g;
                o3w0 o3w0VarM162489b2 = o3w0.m162489b("oa_signals");
                o3w0VarM162489b2.m162491a("oa_session_id", aiw0Var.mo96947f() ? "" : this.f100217e);
                C2193m0 c2193m0M13062S = c2209o0.m13062S();
                String strValueOf = c2193m0M13062S.m12899P() ? String.valueOf(c2193m0M13062S.m12901R() - 1) : User.ID_TEAM_ACCOUNT;
                String string = C2299z2.m13514b(c2209o0.m13064X(), new yew0() { // from class: l.f1v0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        return ((zzbcn) obj).name();
                    }
                }).toString();
                o3w0VarM162489b2.m162491a("oa_sig_ts", String.valueOf(c2209o0.m13061R()));
                o3w0VarM162489b2.m162491a("oa_sig_status", String.valueOf(c2209o0.m13068j0() - 1));
                o3w0VarM162489b2.m162491a("oa_sig_resp_lat", String.valueOf(c2209o0.m13060Q()));
                o3w0VarM162489b2.m162491a("oa_sig_render_lat", String.valueOf(c2209o0.m13059P()));
                o3w0VarM162489b2.m162491a("oa_sig_formats", string);
                o3w0VarM162489b2.m162491a("oa_sig_nw_type", strValueOf);
                o3w0VarM162489b2.m162491a("oa_sig_wifi", String.valueOf(c2209o0.m13069k0() - 1));
                o3w0VarM162489b2.m162491a("oa_sig_airplane", String.valueOf(c2209o0.m13065g0() - 1));
                o3w0VarM162489b2.m162491a("oa_sig_data", String.valueOf(c2209o0.m13066h0() - 1));
                o3w0VarM162489b2.m162491a("oa_sig_nw_resp", String.valueOf(c2209o0.m13058O()));
                o3w0VarM162489b2.m162491a("oa_sig_offline", String.valueOf(c2209o0.m13067i0() - 1));
                o3w0VarM162489b2.m162491a("oa_sig_nw_state", String.valueOf(c2209o0.m13063W().zza()));
                if (c2193m0M13062S.m12898O() && c2193m0M13062S.m12899P() && c2193m0M13062S.m12901R() == 2) {
                    o3w0VarM162489b2.m162491a("oa_sig_cell_type", String.valueOf(c2193m0M13062S.m12900Q() - 1));
                }
                this.f100218f.mo124429a(o3w0VarM162489b2);
            }
        } else {
            ArrayList arrayListM216763c2 = z0v0.m216763c(sQLiteDatabase);
            Context context = this.f100214b;
            g5s0 g5s0VarM13115L = C2217p0.m13115L();
            g5s0VarM13115L.m124535r(context.getPackageName());
            g5s0VarM13115L.m124537t(Build.MODEL);
            g5s0VarM13115L.m124538u(z0v0.m216761a(sQLiteDatabase, 0));
            g5s0VarM13115L.m124534q(arrayListM216763c2);
            g5s0VarM13115L.m124540w(z0v0.m216761a(sQLiteDatabase, 1));
            g5s0VarM13115L.m124536s(z0v0.m216761a(sQLiteDatabase, 3));
            g5s0VarM13115L.m124541x(vny0.m199064b().currentTimeMillis());
            g5s0VarM13115L.m124539v(z0v0.m216762b(sQLiteDatabase, 2));
            final C2217p0 c2217p0 = (C2217p0) g5s0VarM13115L.m153521m();
            m124089c(sQLiteDatabase, arrayListM216763c2);
            this.f100213a.m216993b(new y2s0() { // from class: l.d1v0
                @Override // p149l.y2s0
                /* JADX INFO: renamed from: a */
                public final void mo12818a(s4s0 s4s0Var) {
                    s4s0Var.m182314y(c2217p0);
                }
            });
            zzcei zzceiVar = this.f100216d;
            v5s0 v5s0VarM13370L = C2265v0.m13370L();
            v5s0VarM13370L.m197178q(zzceiVar.zzb);
            v5s0VarM13370L.m197180s(this.f100216d.zzc);
            v5s0VarM13370L.m197179r(true == this.f100216d.zzd ? 0 : 2);
            final C2265v0 c2265v0 = (C2265v0) v5s0VarM13370L.m153521m();
            this.f100213a.m216993b(new y2s0() { // from class: l.e1v0
                @Override // p149l.y2s0
                /* JADX INFO: renamed from: a */
                public final void mo12818a(s4s0 s4s0Var) {
                    e4s0 e4s0Var = (e4s0) s4s0Var.m182307r().m13187k();
                    e4s0Var.m114703r(c2265v0);
                    s4s0Var.m182312w(e4s0Var);
                }
            });
            this.f100213a.m216994c(10004);
        }
        z0v0.m216766f(sQLiteDatabase);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m124091b(final boolean z) {
        try {
            this.f100215c.m119057a(new e2w0() { // from class: l.c1v0
                @Override // p149l.e2w0
                public final Object zza(Object obj) throws Exception {
                    this.f78308a.m124090a(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            x2t0.m206866d("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
