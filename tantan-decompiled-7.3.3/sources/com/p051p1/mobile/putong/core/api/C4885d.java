package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4885d;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Grade;
import com.p051p1.mobile.putong.core.data.School;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dji;
import p153l.dy6;
import p153l.gta;
import p153l.i1y;
import p153l.l51;
import p153l.mof0;
import p153l.oki;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.q8g0;
import p153l.qcj;
import p153l.sim;
import p153l.uxj0;
import p153l.vod;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d */
/* JADX INFO: loaded from: classes9.dex */
public class C4885d extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22507a<ArrayList<Grade>> f20481R;

    /* JADX INFO: renamed from: S */
    public a f20482S;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d$a */
    public class a extends mof0<List<School>> {
        public a() {
            super("Schools", new dji(new vod("schools", "3", null), 7, ProtobufAdapter.ARRAY_ADAPTER(School.PROTOBUF_ADAPTER)), new pcj() { // from class: l.xe7
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new ti20(new pcj() { // from class: l.ze7
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/schools")).m209032f().m209028b();
                        }
                    }).map(new qcj() { // from class: l.af7
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return C4885d.a.m32551F((Envelope) obj);
                        }
                    });
                }
            });
            l51.m152887G(new Runnable() { // from class: l.ye7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198668a.m32552G();
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ int m32548C(School school, School school2) {
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
        public static /* synthetic */ List m32551F(Envelope envelope) {
            if (((CoreData) envelope.getModuleData(CoreData.class)).schools != null) {
                for (School school : ((CoreData) envelope.getModuleData(CoreData.class)).schools) {
                    if (TextUtils.isEmpty(school.pinyin)) {
                        pf60<String, String> pf60VarM175777I = q8g0.m175777I(school.name);
                        school.pinyin = pf60VarM175777I.f152157b;
                        school.firstLetter = pf60VarM175777I.f152156a;
                    }
                }
                Collections.sort(((CoreData) envelope.getModuleData(CoreData.class)).schools, new Comparator() { // from class: l.bf7
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C4885d.a.m32548C((School) obj, (School) obj2);
                    }
                });
            }
            return ((CoreData) envelope.getModuleData(CoreData.class)).schools;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G */
        public /* synthetic */ void m32552G() {
            C4885d.this.m32544l3().subscribe();
        }
    }

    public C4885d(C4883c c4883c) {
        super(c4883c);
        this.f20482S = new a();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ User m32533a3(User user) {
        List<Media> list = user.settings.verification.studies.pictures;
        if (list != null && list.size() > 0) {
            for (Media media : user.settings.verification.studies.pictures) {
                if (TEnum.equals(media.status, "raw") && (media instanceof Picture)) {
                    Picture picture = (Picture) media;
                    if (picture.size == null || media.mediaType == null) {
                        sim simVar = new sim(oki.m168038z(media.url));
                        picture.size = new Dimension(simVar.f168843d);
                        media.mediaType = simVar.f168842c;
                    }
                }
            }
        }
        return user;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m32534b3(Throwable th) {
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ C22421c m32536d3(qcj qcjVar, User user) {
        return (C22421c) qcjVar.call(user);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ User m32539g3(User user, List list) {
        User userMo225055clone = user.mo225055clone();
        userMo225055clone.settings.verification.studies.pictures = new ArrayList(list);
        return userMo225055clone;
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ C22421c m32540h3(qcj qcjVar, User user) {
        return (C22421c) qcjVar.call(user);
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ C22421c m32543k3(final User user) {
        List<Media> list = user.settings.verification.studies.pictures;
        return (list == null || list.size() <= 0) ? C22421c.just(user) : new i1y(user.settings.verification.studies.pictures, false).doOnNext(new y20() { // from class: l.ue7
            @Override // p153l.y20
            public final void call(Object obj) {
                user.mo225055clone().settings.verification.studies.pictures = new ArrayList((List) obj);
            }
        }).last().flatMap(new qcj() { // from class: l.ve7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214980I((List) obj, "student_id_pics");
            }
        }).map(new qcj() { // from class: l.we7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4885d.m32539g3(user, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public C22421c<ArrayList<Grade>> m32544l3() {
        C22507a<ArrayList<Grade>> c22507a = this.f20481R;
        if (c22507a == null || c22507a.m222761e().size() == 0) {
            this.f20481R = C22507a.m222758b();
            l51.m152919y(new Runnable() { // from class: l.me7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136439a.m32545m3();
                }
            });
        }
        return this.f20481R;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m32545m3() {
        ArrayList<Grade> arrayList = new ArrayList<>();
        try {
            arrayList = (ArrayList) Grade.JSON_ADAPTER.ARRAY_ADAPTER().parse(CoreModule.f18263b.getResources().openRawResource(gta.m132210e().m132214d().mo34813ct().intValue()));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
        Collections.reverse(arrayList);
        this.f20481R.m137019l(arrayList);
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<uxj0> m32546n3(final User user) {
        pcj pcjVar = new pcj() { // from class: l.oe7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.ne7
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4885d.m32533a3(user);
                    }
                });
            }
        };
        y20<Throwable> y20Var = new y20() { // from class: l.pe7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4885d.m32534b3((Throwable) obj);
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.qe7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4885d.m32543k3((User) obj);
            }
        };
        final qcj qcjVar2 = new qcj() { // from class: l.re7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116620u9((User) obj);
            }
        };
        return this.f91137Q.now(((C22421c) pcjVar.call()).flatMap(new qcj() { // from class: l.se7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4885d.m32536d3(qcjVar, (User) obj);
            }
        }).doOnError(y20Var).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.te7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4885d.m32540h3(qcjVar2, (User) obj);
            }
        }));
    }
}
