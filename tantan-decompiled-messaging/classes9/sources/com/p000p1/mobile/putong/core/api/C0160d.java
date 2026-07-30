package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0160d;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Grade;
import com.p1.mobile.putong.core.data.School;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import l.e30;
import l.e51;
import l.fgf0;
import l.ggi;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.pgm;
import l.rhi;
import l.roj0;
import l.v9j;
import l.w9j;
import p006l.ax6;
import p006l.lsx;
import p006l.qnd;
import p006l.ura;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0160d extends ax6 {

    /* JADX INFO: renamed from: R */
    public rx.subjects.a<ArrayList<Grade>> f3728R;

    /* JADX INFO: renamed from: S */
    public a f3729S;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d$a */
    public class a extends fgf0<List<School>> {
        public a() {
            super("Schools", new ggi(new qnd("schools", "3", null), 7, ProtobufAdapter.ARRAY_ADAPTER(School.PROTOBUF_ADAPTER)), new v9j() { // from class: l.td7
                public final Object call() {
                    return new la20(new v9j() { // from class: l.vd7
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3130G("/schools")).f().b();
                        }
                    }).map(new w9j() { // from class: l.wd7
                        public final Object call(Object obj) {
                            return C0160d.a.m3478F((Envelope) obj);
                        }
                    });
                }
            });
            e51.G(new Runnable() { // from class: l.ud7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23490a.m3479G();
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ int m3475C(School school, School school2) {
            String str;
            if (school.firstLetter.equals("@") || school2.firstLetter.equals("#")) {
                return -1;
            }
            if (school.firstLetter.equals("#") || school2.firstLetter.equals("@") || (str = school.pinyin) == null) {
                return 1;
            }
            return str.compareTo(school2.pinyin);
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ List m3478F(Envelope envelope) {
            if (envelope.getModuleData(CoreData.class).schools != null) {
                for (School school : envelope.getModuleData(CoreData.class).schools) {
                    if (TextUtils.isEmpty(school.pinyin)) {
                        j760 j760VarI = i0g0.I(school.name);
                        school.pinyin = (String) j760VarI.b;
                        school.firstLetter = (String) j760VarI.a;
                    }
                }
                Collections.sort(envelope.getModuleData(CoreData.class).schools, new Comparator() { // from class: l.xd7
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C0160d.a.m3475C((School) obj, (School) obj2);
                    }
                });
            }
            return envelope.getModuleData(CoreData.class).schools;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G */
        public /* synthetic */ void m3479G() {
            C0160d.this.m3471l3().subscribe();
        }
    }

    public C0160d(C0158c c0158c) {
        super(c0158c);
        this.f3729S = new a();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ User m3460a3(User user) {
        List list = user.settings.verification.studies.pictures;
        if (list != null && list.size() > 0) {
            for (Picture picture : user.settings.verification.studies.pictures) {
                if (TEnum.equals(((Media) picture).status, "raw") && (picture instanceof Picture)) {
                    Picture picture2 = picture;
                    if (picture2.size == null || ((Media) picture).mediaType == null) {
                        pgm pgmVar = new pgm(rhi.z(((Media) picture).url));
                        picture2.size = new Dimension(pgmVar.d);
                        ((Media) picture).mediaType = pgmVar.c;
                    }
                }
            }
        }
        return user;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m3461b3(Throwable th) {
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ c m3463d3(w9j w9jVar, User user) {
        return (c) w9jVar.call(user);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ User m3466g3(User user, List list) {
        User userClone = user.clone();
        userClone.settings.verification.studies.pictures = new ArrayList(list);
        return userClone;
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ c m3467h3(w9j w9jVar, User user) {
        return (c) w9jVar.call(user);
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ c m3470k3(final User user) {
        List list = user.settings.verification.studies.pictures;
        return (list == null || list.size() <= 0) ? c.just(user) : new lsx(user.settings.verification.studies.pictures, false).doOnNext(new e30() { // from class: l.qd7
            public final void call(Object obj) {
                user.clone().settings.verification.studies.pictures = new ArrayList((List) obj);
            }
        }).last().flatMap(new w9j() { // from class: l.rd7
            public final Object call(Object obj) {
                return ya5.m28127I((List) obj, "student_id_pics");
            }
        }).map(new w9j() { // from class: l.sd7
            public final Object call(Object obj) {
                return C0160d.m3466g3(user, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public c<ArrayList<Grade>> m3471l3() {
        rx.subjects.a<ArrayList<Grade>> aVar = this.f3728R;
        if (aVar == null || ((ArrayList) aVar.e()).size() == 0) {
            this.f3728R = rx.subjects.a.b();
            e51.y(new Runnable() { // from class: l.id7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14381a.m3472m3();
                }
            });
        }
        return this.f3728R;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m3472m3() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = (ArrayList) Grade.JSON_ADAPTER.ARRAY_ADAPTER().parse(CoreModule.f1533b.getResources().openRawResource(ura.m25555e().m25559d().m5747ct().intValue()));
        } catch (IOException e) {
            CrashHelper.c(e);
        }
        Collections.reverse(arrayList);
        this.f3728R.onNext(arrayList);
    }

    /* JADX INFO: renamed from: n3 */
    public c<roj0> m3473n3(final User user) {
        v9j v9jVar = new v9j() { // from class: l.kd7
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.jd7
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C0160d.m3460a3(user);
                    }
                });
            }
        };
        e30 e30Var = new e30() { // from class: l.ld7
            public final void call(Object obj) {
                C0160d.m3461b3((Throwable) obj);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.md7
            public final Object call(Object obj) {
                return C0160d.m3470k3((User) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.nd7
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21510u9((User) obj);
            }
        };
        return this.f8580Q.now(((c) v9jVar.call()).flatMap(new w9j() { // from class: l.od7
            public final Object call(Object obj) {
                return C0160d.m3463d3(w9jVar, (User) obj);
            }
        }).doOnError(e30Var).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.pd7
            public final Object call(Object obj) {
                return C0160d.m3467h3(w9jVar2, (User) obj);
            }
        }));
    }
}
