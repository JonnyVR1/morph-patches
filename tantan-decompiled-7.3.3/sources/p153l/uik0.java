package p153l;

import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class uik0 extends C21270xa {
    public uik0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Picture m196285q0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ Media m196287s0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m196289u0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m196290x0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m196291A0(final Picture picture) {
        if (TEnum.equals(picture.status, "raw")) {
            new i1y(jyb.m147507f0(picture), false).flatMap(new qcj() { // from class: l.nik0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return yb5.m214980I(jyb.m147507f0(picture), "profile").map(new qcj() { // from class: l.tik0
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return uik0.m196285q0((List) obj2);
                        }
                    });
                }
            }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.oik0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147554a.m196292y0((Picture) obj);
                }
            }, new y20() { // from class: l.pik0
                @Override // p153l.y20
                public final void call(Object obj) {
                    uik0.m196290x0((Throwable) obj);
                }
            }));
        } else {
            yb5.m214980I(jyb.m147507f0(picture), "profile").map(new qcj() { // from class: l.qik0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uik0.m196287s0((List) obj);
                }
            }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.rik0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f163370a.m196293z0((Media) obj);
                }
            }, new y20() { // from class: l.sik0
                @Override // p153l.y20
                public final void call(Object obj) {
                    uik0.m196289u0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m196292y0(Picture picture) {
        ((C16494db) this.viewModel).m188052I("javascript:adtp('" + picture.url + "')");
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m196293z0(Media media) {
        ((C16494db) this.viewModel).m188052I("javascript:adtp('" + media.url + "')");
    }
}
