package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.C1071h;
import com.bumptech.glide.manager.C1103e;
import com.bumptech.glide.manager.C1106h;
import com.bumptech.glide.manager.InterfaceC1102d;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p149l.dfw;
import p149l.e01;
import p149l.fhy;
import p149l.g23;
import p149l.h01;
import p149l.h23;
import p149l.iuc0;
import p149l.k1k;
import p149l.l2e;
import p149l.muc0;
import p149l.mxm;
import p149l.ogy;
import p149l.tew;
import p149l.vew;
import p149l.w8j0;

/* JADX INFO: renamed from: com.bumptech.glide.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1054b {

    /* JADX INFO: renamed from: b */
    private C1071h f4339b;

    /* JADX INFO: renamed from: c */
    private g23 f4340c;

    /* JADX INFO: renamed from: d */
    private h01 f4341d;

    /* JADX INFO: renamed from: e */
    private ogy f4342e;

    /* JADX INFO: renamed from: f */
    private k1k f4343f;

    /* JADX INFO: renamed from: g */
    private k1k f4344g;

    /* JADX INFO: renamed from: h */
    private l2e.InterfaceC18139a f4345h;

    /* JADX INFO: renamed from: i */
    private fhy f4346i;

    /* JADX INFO: renamed from: j */
    private InterfaceC1102d f4347j;

    /* JADX INFO: renamed from: m */
    @Nullable
    private C1106h.b f4350m;

    /* JADX INFO: renamed from: n */
    private k1k f4351n;

    /* JADX INFO: renamed from: o */
    private boolean f4352o;

    /* JADX INFO: renamed from: p */
    @Nullable
    private List<iuc0<Object>> f4353p;

    /* JADX INFO: renamed from: q */
    private boolean f4354q;

    /* JADX INFO: renamed from: r */
    private boolean f4355r;

    /* JADX INFO: renamed from: a */
    private final Map<Class<?>, w8j0<?, ?>> f4338a = new e01();

    /* JADX INFO: renamed from: k */
    private int f4348k = 4;

    /* JADX INFO: renamed from: l */
    private ComponentCallbacks2C1053a.a f4349l = new a();

    /* JADX INFO: renamed from: com.bumptech.glide.b$a */
    public class a implements ComponentCallbacks2C1053a.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C1053a.a
        @NonNull
        public muc0 build() {
            return new muc0();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public ComponentCallbacks2C1053a m5331a(@NonNull Context context) {
        if (this.f4343f == null) {
            this.f4343f = k1k.m144176v();
        }
        if (this.f4344g == null) {
            this.f4344g = k1k.m144174t();
        }
        if (this.f4351n == null) {
            this.f4351n = k1k.m144172n();
        }
        if (this.f4346i == null) {
            this.f4346i = new fhy.C16839a(context).m121477a();
        }
        if (this.f4347j == null) {
            this.f4347j = new C1103e();
        }
        if (this.f4340c == null) {
            int iM121475b = this.f4346i.m121475b();
            if (iM121475b > 0) {
                this.f4340c = new vew(iM121475b);
            } else {
                this.f4340c = new h23();
            }
        }
        if (this.f4341d == null) {
            this.f4341d = new tew(this.f4346i.m121474a());
        }
        if (this.f4342e == null) {
            this.f4342e = new dfw(this.f4346i.m121476d());
        }
        if (this.f4345h == null) {
            this.f4345h = new mxm(context);
        }
        if (this.f4339b == null) {
            this.f4339b = new C1071h(this.f4342e, this.f4345h, this.f4344g, this.f4343f, k1k.m144169F(), this.f4351n, this.f4352o);
        }
        List<iuc0<Object>> list = this.f4353p;
        if (list == null) {
            this.f4353p = Collections.EMPTY_LIST;
        } else {
            this.f4353p = Collections.unmodifiableList(list);
        }
        return new ComponentCallbacks2C1053a(context, this.f4339b, this.f4342e, this.f4340c, this.f4341d, new C1106h(this.f4350m), this.f4347j, this.f4348k, this.f4349l, this.f4338a, this.f4353p, this.f4354q, this.f4355r);
    }

    /* JADX INFO: renamed from: b */
    public void m5332b(@Nullable C1106h.b bVar) {
        this.f4350m = bVar;
    }
}
