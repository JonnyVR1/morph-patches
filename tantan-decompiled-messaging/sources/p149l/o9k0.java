package p149l;

import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class o9k0 extends C16098cb {
    public o9k0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Picture m163201q0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ Media m163203s0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m163205u0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m163206x0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m163207A0(final Picture picture) {
        if (TEnum.equals(picture.status, "raw")) {
            new lsx(vwb.m200324f0(picture), false).flatMap(new w9j() { // from class: l.h9k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ya5.m213793I(vwb.m200324f0(picture), "profile").map(new w9j() { // from class: l.n9k0
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return o9k0.m163201q0((List) obj2);
                        }
                    });
                }
            }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.i9k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f112229a.m163208y0((Picture) obj);
                }
            }, new e30() { // from class: l.j9k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    o9k0.m163206x0((Throwable) obj);
                }
            }));
        } else {
            ya5.m213793I(vwb.m200324f0(picture), "profile").map(new w9j() { // from class: l.k9k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return o9k0.m163203s0((List) obj);
                }
            }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.l9k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127127a.m163209z0((Media) obj);
                }
            }, new e30() { // from class: l.m9k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    o9k0.m163205u0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m163208y0(Picture picture) {
        ((C17514ib) this.viewModel).m164965I("javascript:adtp('" + picture.url + "')");
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m163209z0(Media media) {
        ((C17514ib) this.viewModel).m164965I("javascript:adtp('" + media.url + "')");
    }
}
