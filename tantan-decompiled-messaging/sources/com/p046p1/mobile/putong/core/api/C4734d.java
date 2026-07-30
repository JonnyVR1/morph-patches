package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4734d;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Grade;
import com.p046p1.mobile.putong.core.data.School;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ax6;
import p149l.e30;
import p149l.e51;
import p149l.fgf0;
import p149l.ggi;
import p149l.i0g0;
import p149l.j760;
import p149l.lsx;
import p149l.mkd0;
import p149l.pgm;
import p149l.qnd;
import p149l.rhi;
import p149l.roj0;
import p149l.ura;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d */
/* JADX INFO: loaded from: classes9.dex */
public class C4734d extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22392a<ArrayList<Grade>> f19739R;

    /* JADX INFO: renamed from: S */
    public a f19740S;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d$a */
    public class a extends fgf0<List<School>> {
        public a() {
            super("Schools", new ggi(new qnd("schools", "3", null), 7, ProtobufAdapter.ARRAY_ADAPTER(School.PROTOBUF_ADAPTER)), new v9j() { // from class: l.td7
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new la20(new v9j() { // from class: l.vd7
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/schools")).m185887f().m185883b();
                        }
                    }).map(new w9j() { // from class: l.wd7
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return C4734d.a.m31548F((Envelope) obj);
                        }
                    });
                }
            });
            e51.m114742G(new Runnable() { // from class: l.ud7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175901a.m31549G();
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ int m31545C(School school, School school2) {
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
        public static /* synthetic */ List m31548F(Envelope envelope) {
            if (((CoreData) envelope.getModuleData(CoreData.class)).schools != null) {
                for (School school : ((CoreData) envelope.getModuleData(CoreData.class)).schools) {
                    if (TextUtils.isEmpty(school.pinyin)) {
                        j760<String, String> j760VarM133842I = i0g0.m133842I(school.name);
                        school.pinyin = j760VarM133842I.f116565b;
                        school.firstLetter = j760VarM133842I.f116564a;
                    }
                }
                Collections.sort(((CoreData) envelope.getModuleData(CoreData.class)).schools, new Comparator() { // from class: l.xd7
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C4734d.a.m31545C((School) obj, (School) obj2);
                    }
                });
            }
            return ((CoreData) envelope.getModuleData(CoreData.class)).schools;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G */
        public /* synthetic */ void m31549G() {
            C4734d.this.m31541l3().subscribe();
        }
    }

    public C4734d(C4732c c4732c) {
        super(c4732c);
        this.f19740S = new a();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ User m31530a3(User user) {
        List<Media> list = user.settings.verification.studies.pictures;
        if (list != null && list.size() > 0) {
            for (Media media : user.settings.verification.studies.pictures) {
                if (TEnum.equals(media.status, "raw") && (media instanceof Picture)) {
                    Picture picture = (Picture) media;
                    if (picture.size == null || media.mediaType == null) {
                        pgm pgmVar = new pgm(rhi.m179382z(media.url));
                        picture.size = new Dimension(pgmVar.f148730d);
                        media.mediaType = pgmVar.f148729c;
                    }
                }
            }
        }
        return user;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m31531b3(Throwable th) {
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ C22306c m31533d3(w9j w9jVar, User user) {
        return (C22306c) w9jVar.call(user);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ User m31536g3(User user, List list) {
        User userMo223809clone = user.mo223809clone();
        userMo223809clone.settings.verification.studies.pictures = new ArrayList(list);
        return userMo223809clone;
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ C22306c m31537h3(w9j w9jVar, User user) {
        return (C22306c) w9jVar.call(user);
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ C22306c m31540k3(final User user) {
        List<Media> list = user.settings.verification.studies.pictures;
        return (list == null || list.size() <= 0) ? C22306c.just(user) : new lsx(user.settings.verification.studies.pictures, false).doOnNext(new e30() { // from class: l.qd7
            @Override // p149l.e30
            public final void call(Object obj) {
                user.mo223809clone().settings.verification.studies.pictures = new ArrayList((List) obj);
            }
        }).last().flatMap(new w9j() { // from class: l.rd7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213793I((List) obj, "student_id_pics");
            }
        }).map(new w9j() { // from class: l.sd7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4734d.m31536g3(user, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public C22306c<ArrayList<Grade>> m31541l3() {
        C22392a<ArrayList<Grade>> c22392a = this.f19739R;
        if (c22392a == null || c22392a.m221515e().size() == 0) {
            this.f19739R = C22392a.m221512b();
            e51.m114774y(new Runnable() { // from class: l.id7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112537a.m31542m3();
                }
            });
        }
        return this.f19739R;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m31542m3() {
        ArrayList<Grade> arrayList = new ArrayList<>();
        try {
            arrayList = (ArrayList) Grade.JSON_ADAPTER.ARRAY_ADAPTER().parse(CoreModule.f17544b.getResources().openRawResource(ura.m195053e().m195057d().mo33810ct().intValue()));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
        Collections.reverse(arrayList);
        this.f19739R.m132487l(arrayList);
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<roj0> m31543n3(final User user) {
        v9j v9jVar = new v9j() { // from class: l.kd7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.jd7
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4734d.m31530a3(user);
                    }
                });
            }
        };
        e30<Throwable> e30Var = new e30() { // from class: l.ld7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4734d.m31531b3((Throwable) obj);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.md7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4734d.m31540k3((User) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.nd7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169547u9((User) obj);
            }
        };
        return this.f72126Q.now(((C22306c) v9jVar.call()).flatMap(new w9j() { // from class: l.od7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4734d.m31533d3(w9jVar, (User) obj);
            }
        }).doOnError(e30Var).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.pd7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4734d.m31537h3(w9jVar2, (User) obj);
            }
        }));
    }
}
