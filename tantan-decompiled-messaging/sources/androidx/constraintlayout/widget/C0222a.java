package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.spongycastle.asn1.eac.EACTags;
import org.xmlpull.v1.XmlPullParserException;
import p149l.all;
import p149l.l9c0;
import p149l.t4c0;
import p149l.upk0;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
public class C0222a {

    /* JADX INFO: renamed from: b */
    public static final int[] f1294b = {0, 4, 8};

    /* JADX INFO: renamed from: c */
    public static SparseIntArray f1295c;

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, b> f1296a = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$b */
    public static class b {

        /* JADX INFO: renamed from: A */
        public int f1297A;

        /* JADX INFO: renamed from: B */
        public int f1298B;

        /* JADX INFO: renamed from: C */
        public int f1299C;

        /* JADX INFO: renamed from: D */
        public int f1300D;

        /* JADX INFO: renamed from: E */
        public int f1301E;

        /* JADX INFO: renamed from: F */
        public int f1302F;

        /* JADX INFO: renamed from: G */
        public int f1303G;

        /* JADX INFO: renamed from: H */
        public int f1304H;

        /* JADX INFO: renamed from: I */
        public int f1305I;

        /* JADX INFO: renamed from: J */
        public int f1306J;

        /* JADX INFO: renamed from: K */
        public int f1307K;

        /* JADX INFO: renamed from: L */
        public int f1308L;

        /* JADX INFO: renamed from: M */
        public int f1309M;

        /* JADX INFO: renamed from: N */
        public int f1310N;

        /* JADX INFO: renamed from: O */
        public int f1311O;

        /* JADX INFO: renamed from: P */
        public int f1312P;

        /* JADX INFO: renamed from: Q */
        public float f1313Q;

        /* JADX INFO: renamed from: R */
        public float f1314R;

        /* JADX INFO: renamed from: S */
        public int f1315S;

        /* JADX INFO: renamed from: T */
        public int f1316T;

        /* JADX INFO: renamed from: U */
        public float f1317U;

        /* JADX INFO: renamed from: V */
        public boolean f1318V;

        /* JADX INFO: renamed from: W */
        public float f1319W;

        /* JADX INFO: renamed from: X */
        public float f1320X;

        /* JADX INFO: renamed from: Y */
        public float f1321Y;

        /* JADX INFO: renamed from: Z */
        public float f1322Z;

        /* JADX INFO: renamed from: a */
        public boolean f1323a;

        /* JADX INFO: renamed from: a0 */
        public float f1324a0;

        /* JADX INFO: renamed from: b */
        public int f1325b;

        /* JADX INFO: renamed from: b0 */
        public float f1326b0;

        /* JADX INFO: renamed from: c */
        public int f1327c;

        /* JADX INFO: renamed from: c0 */
        public float f1328c0;

        /* JADX INFO: renamed from: d */
        public int f1329d;

        /* JADX INFO: renamed from: d0 */
        public float f1330d0;

        /* JADX INFO: renamed from: e */
        public int f1331e;

        /* JADX INFO: renamed from: e0 */
        public float f1332e0;

        /* JADX INFO: renamed from: f */
        public int f1333f;

        /* JADX INFO: renamed from: f0 */
        public float f1334f0;

        /* JADX INFO: renamed from: g */
        public float f1335g;

        /* JADX INFO: renamed from: g0 */
        public float f1336g0;

        /* JADX INFO: renamed from: h */
        public int f1337h;

        /* JADX INFO: renamed from: h0 */
        public boolean f1338h0;

        /* JADX INFO: renamed from: i */
        public int f1339i;

        /* JADX INFO: renamed from: i0 */
        public boolean f1340i0;

        /* JADX INFO: renamed from: j */
        public int f1341j;

        /* JADX INFO: renamed from: j0 */
        public int f1342j0;

        /* JADX INFO: renamed from: k */
        public int f1343k;

        /* JADX INFO: renamed from: k0 */
        public int f1344k0;

        /* JADX INFO: renamed from: l */
        public int f1345l;

        /* JADX INFO: renamed from: l0 */
        public int f1346l0;

        /* JADX INFO: renamed from: m */
        public int f1347m;

        /* JADX INFO: renamed from: m0 */
        public int f1348m0;

        /* JADX INFO: renamed from: n */
        public int f1349n;

        /* JADX INFO: renamed from: n0 */
        public int f1350n0;

        /* JADX INFO: renamed from: o */
        public int f1351o;

        /* JADX INFO: renamed from: o0 */
        public int f1352o0;

        /* JADX INFO: renamed from: p */
        public int f1353p;

        /* JADX INFO: renamed from: p0 */
        public float f1354p0;

        /* JADX INFO: renamed from: q */
        public int f1355q;

        /* JADX INFO: renamed from: q0 */
        public float f1356q0;

        /* JADX INFO: renamed from: r */
        public int f1357r;

        /* JADX INFO: renamed from: r0 */
        public boolean f1358r0;

        /* JADX INFO: renamed from: s */
        public int f1359s;

        /* JADX INFO: renamed from: s0 */
        public int f1360s0;

        /* JADX INFO: renamed from: t */
        public int f1361t;

        /* JADX INFO: renamed from: t0 */
        public int f1362t0;

        /* JADX INFO: renamed from: u */
        public float f1363u;

        /* JADX INFO: renamed from: u0 */
        public int[] f1364u0;

        /* JADX INFO: renamed from: v */
        public float f1365v;

        /* JADX INFO: renamed from: v0 */
        public String f1366v0;

        /* JADX INFO: renamed from: w */
        public String f1367w;

        /* JADX INFO: renamed from: x */
        public int f1368x;

        /* JADX INFO: renamed from: y */
        public int f1369y;

        /* JADX INFO: renamed from: z */
        public float f1370z;

        public b() {
            this.f1323a = false;
            this.f1331e = -1;
            this.f1333f = -1;
            this.f1335g = -1.0f;
            this.f1337h = -1;
            this.f1339i = -1;
            this.f1341j = -1;
            this.f1343k = -1;
            this.f1345l = -1;
            this.f1347m = -1;
            this.f1349n = -1;
            this.f1351o = -1;
            this.f1353p = -1;
            this.f1355q = -1;
            this.f1357r = -1;
            this.f1359s = -1;
            this.f1361t = -1;
            this.f1363u = 0.5f;
            this.f1365v = 0.5f;
            this.f1367w = null;
            this.f1368x = -1;
            this.f1369y = 0;
            this.f1370z = 0.0f;
            this.f1297A = -1;
            this.f1298B = -1;
            this.f1299C = -1;
            this.f1300D = -1;
            this.f1301E = -1;
            this.f1302F = -1;
            this.f1303G = -1;
            this.f1304H = -1;
            this.f1305I = -1;
            this.f1306J = 0;
            this.f1307K = -1;
            this.f1308L = -1;
            this.f1309M = -1;
            this.f1310N = -1;
            this.f1311O = -1;
            this.f1312P = -1;
            this.f1313Q = 0.0f;
            this.f1314R = 0.0f;
            this.f1315S = 0;
            this.f1316T = 0;
            this.f1317U = 1.0f;
            this.f1318V = false;
            this.f1319W = 0.0f;
            this.f1320X = 0.0f;
            this.f1321Y = 0.0f;
            this.f1322Z = 0.0f;
            this.f1324a0 = 1.0f;
            this.f1326b0 = 1.0f;
            this.f1328c0 = Float.NaN;
            this.f1330d0 = Float.NaN;
            this.f1332e0 = 0.0f;
            this.f1334f0 = 0.0f;
            this.f1336g0 = 0.0f;
            this.f1338h0 = false;
            this.f1340i0 = false;
            this.f1342j0 = 0;
            this.f1344k0 = 0;
            this.f1346l0 = -1;
            this.f1348m0 = -1;
            this.f1350n0 = -1;
            this.f1352o0 = -1;
            this.f1354p0 = 1.0f;
            this.f1356q0 = 1.0f;
            this.f1358r0 = false;
            this.f1360s0 = -1;
            this.f1362t0 = -1;
        }

        /* JADX INFO: renamed from: d */
        public void m1168d(ConstraintLayout.C0220a c0220a) {
            c0220a.f1243d = this.f1337h;
            c0220a.f1245e = this.f1339i;
            c0220a.f1247f = this.f1341j;
            c0220a.f1249g = this.f1343k;
            c0220a.f1251h = this.f1345l;
            c0220a.f1253i = this.f1347m;
            c0220a.f1255j = this.f1349n;
            c0220a.f1257k = this.f1351o;
            c0220a.f1259l = this.f1353p;
            c0220a.f1265p = this.f1355q;
            c0220a.f1266q = this.f1357r;
            c0220a.f1267r = this.f1359s;
            c0220a.f1268s = this.f1361t;
            ((ViewGroup.MarginLayoutParams) c0220a).leftMargin = this.f1300D;
            ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = this.f1301E;
            ((ViewGroup.MarginLayoutParams) c0220a).topMargin = this.f1302F;
            ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin = this.f1303G;
            c0220a.f1273x = this.f1312P;
            c0220a.f1274y = this.f1311O;
            c0220a.f1275z = this.f1363u;
            c0220a.f1211A = this.f1365v;
            c0220a.f1261m = this.f1368x;
            c0220a.f1263n = this.f1369y;
            c0220a.f1264o = this.f1370z;
            c0220a.f1212B = this.f1367w;
            c0220a.f1227Q = this.f1297A;
            c0220a.f1228R = this.f1298B;
            c0220a.f1216F = this.f1313Q;
            c0220a.f1215E = this.f1314R;
            c0220a.f1218H = this.f1316T;
            c0220a.f1217G = this.f1315S;
            c0220a.f1230T = this.f1338h0;
            c0220a.f1231U = this.f1340i0;
            c0220a.f1219I = this.f1342j0;
            c0220a.f1220J = this.f1344k0;
            c0220a.f1223M = this.f1346l0;
            c0220a.f1224N = this.f1348m0;
            c0220a.f1221K = this.f1350n0;
            c0220a.f1222L = this.f1352o0;
            c0220a.f1225O = this.f1354p0;
            c0220a.f1226P = this.f1356q0;
            c0220a.f1229S = this.f1299C;
            c0220a.f1241c = this.f1335g;
            c0220a.f1237a = this.f1331e;
            c0220a.f1239b = this.f1333f;
            ((ViewGroup.MarginLayoutParams) c0220a).width = this.f1325b;
            ((ViewGroup.MarginLayoutParams) c0220a).height = this.f1327c;
            c0220a.setMarginStart(this.f1305I);
            c0220a.setMarginEnd(this.f1304H);
            c0220a.m1138a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b clone() {
            b bVar = new b();
            bVar.f1323a = this.f1323a;
            bVar.f1325b = this.f1325b;
            bVar.f1327c = this.f1327c;
            bVar.f1331e = this.f1331e;
            bVar.f1333f = this.f1333f;
            bVar.f1335g = this.f1335g;
            bVar.f1337h = this.f1337h;
            bVar.f1339i = this.f1339i;
            bVar.f1341j = this.f1341j;
            bVar.f1343k = this.f1343k;
            bVar.f1345l = this.f1345l;
            bVar.f1347m = this.f1347m;
            bVar.f1349n = this.f1349n;
            bVar.f1351o = this.f1351o;
            bVar.f1353p = this.f1353p;
            bVar.f1355q = this.f1355q;
            bVar.f1357r = this.f1357r;
            bVar.f1359s = this.f1359s;
            bVar.f1361t = this.f1361t;
            bVar.f1363u = this.f1363u;
            bVar.f1365v = this.f1365v;
            bVar.f1367w = this.f1367w;
            bVar.f1297A = this.f1297A;
            bVar.f1298B = this.f1298B;
            bVar.f1363u = this.f1363u;
            bVar.f1363u = this.f1363u;
            bVar.f1363u = this.f1363u;
            bVar.f1363u = this.f1363u;
            bVar.f1363u = this.f1363u;
            bVar.f1299C = this.f1299C;
            bVar.f1300D = this.f1300D;
            bVar.f1301E = this.f1301E;
            bVar.f1302F = this.f1302F;
            bVar.f1303G = this.f1303G;
            bVar.f1304H = this.f1304H;
            bVar.f1305I = this.f1305I;
            bVar.f1306J = this.f1306J;
            bVar.f1307K = this.f1307K;
            bVar.f1308L = this.f1308L;
            bVar.f1309M = this.f1309M;
            bVar.f1310N = this.f1310N;
            bVar.f1311O = this.f1311O;
            bVar.f1312P = this.f1312P;
            bVar.f1313Q = this.f1313Q;
            bVar.f1314R = this.f1314R;
            bVar.f1315S = this.f1315S;
            bVar.f1316T = this.f1316T;
            bVar.f1317U = this.f1317U;
            bVar.f1318V = this.f1318V;
            bVar.f1319W = this.f1319W;
            bVar.f1320X = this.f1320X;
            bVar.f1321Y = this.f1321Y;
            bVar.f1322Z = this.f1322Z;
            bVar.f1324a0 = this.f1324a0;
            bVar.f1326b0 = this.f1326b0;
            bVar.f1328c0 = this.f1328c0;
            bVar.f1330d0 = this.f1330d0;
            bVar.f1332e0 = this.f1332e0;
            bVar.f1334f0 = this.f1334f0;
            bVar.f1336g0 = this.f1336g0;
            bVar.f1338h0 = this.f1338h0;
            bVar.f1340i0 = this.f1340i0;
            bVar.f1342j0 = this.f1342j0;
            bVar.f1344k0 = this.f1344k0;
            bVar.f1346l0 = this.f1346l0;
            bVar.f1348m0 = this.f1348m0;
            bVar.f1350n0 = this.f1350n0;
            bVar.f1352o0 = this.f1352o0;
            bVar.f1354p0 = this.f1354p0;
            bVar.f1356q0 = this.f1356q0;
            bVar.f1360s0 = this.f1360s0;
            bVar.f1362t0 = this.f1362t0;
            int[] iArr = this.f1364u0;
            if (iArr != null) {
                bVar.f1364u0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f1368x = this.f1368x;
            bVar.f1369y = this.f1369y;
            bVar.f1370z = this.f1370z;
            bVar.f1358r0 = this.f1358r0;
            return bVar;
        }

        /* JADX INFO: renamed from: f */
        public final void m1170f(int i, ConstraintLayout.C0220a c0220a) {
            this.f1329d = i;
            this.f1337h = c0220a.f1243d;
            this.f1339i = c0220a.f1245e;
            this.f1341j = c0220a.f1247f;
            this.f1343k = c0220a.f1249g;
            this.f1345l = c0220a.f1251h;
            this.f1347m = c0220a.f1253i;
            this.f1349n = c0220a.f1255j;
            this.f1351o = c0220a.f1257k;
            this.f1353p = c0220a.f1259l;
            this.f1355q = c0220a.f1265p;
            this.f1357r = c0220a.f1266q;
            this.f1359s = c0220a.f1267r;
            this.f1361t = c0220a.f1268s;
            this.f1363u = c0220a.f1275z;
            this.f1365v = c0220a.f1211A;
            this.f1367w = c0220a.f1212B;
            this.f1368x = c0220a.f1261m;
            this.f1369y = c0220a.f1263n;
            this.f1370z = c0220a.f1264o;
            this.f1297A = c0220a.f1227Q;
            this.f1298B = c0220a.f1228R;
            this.f1299C = c0220a.f1229S;
            this.f1335g = c0220a.f1241c;
            this.f1331e = c0220a.f1237a;
            this.f1333f = c0220a.f1239b;
            this.f1325b = ((ViewGroup.MarginLayoutParams) c0220a).width;
            this.f1327c = ((ViewGroup.MarginLayoutParams) c0220a).height;
            this.f1300D = ((ViewGroup.MarginLayoutParams) c0220a).leftMargin;
            this.f1301E = ((ViewGroup.MarginLayoutParams) c0220a).rightMargin;
            this.f1302F = ((ViewGroup.MarginLayoutParams) c0220a).topMargin;
            this.f1303G = ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin;
            this.f1313Q = c0220a.f1216F;
            this.f1314R = c0220a.f1215E;
            this.f1316T = c0220a.f1218H;
            this.f1315S = c0220a.f1217G;
            boolean z = c0220a.f1230T;
            this.f1340i0 = c0220a.f1231U;
            this.f1342j0 = c0220a.f1219I;
            this.f1344k0 = c0220a.f1220J;
            this.f1338h0 = z;
            this.f1346l0 = c0220a.f1223M;
            this.f1348m0 = c0220a.f1224N;
            this.f1350n0 = c0220a.f1221K;
            this.f1352o0 = c0220a.f1222L;
            this.f1354p0 = c0220a.f1225O;
            this.f1356q0 = c0220a.f1226P;
            this.f1304H = c0220a.getMarginEnd();
            this.f1305I = c0220a.getMarginStart();
        }

        /* JADX INFO: renamed from: g */
        public final void m1171g(int i, Constraints.C0221a c0221a) {
            m1170f(i, c0221a);
            this.f1317U = c0221a.f1278n0;
            this.f1320X = c0221a.f1281q0;
            this.f1321Y = c0221a.f1282r0;
            this.f1322Z = c0221a.f1283s0;
            this.f1324a0 = c0221a.f1284t0;
            this.f1326b0 = c0221a.f1285u0;
            this.f1328c0 = c0221a.f1286v0;
            this.f1330d0 = c0221a.f1287w0;
            this.f1332e0 = c0221a.f1288x0;
            this.f1334f0 = c0221a.f1289y0;
            this.f1336g0 = c0221a.f1290z0;
            this.f1319W = c0221a.f1280p0;
            this.f1318V = c0221a.f1279o0;
        }

        /* JADX INFO: renamed from: h */
        public final void m1172h(ConstraintHelper constraintHelper, int i, Constraints.C0221a c0221a) {
            m1171g(i, c0221a);
            if (constraintHelper instanceof Barrier) {
                this.f1362t0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                this.f1360s0 = barrier.getType();
                this.f1364u0 = barrier.getReferencedIds();
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1295c = sparseIntArray;
        sparseIntArray.append(l9c0.f127024j1, 25);
        f1295c.append(l9c0.f127027k1, 26);
        f1295c.append(l9c0.f127033m1, 29);
        f1295c.append(l9c0.f127036n1, 30);
        f1295c.append(l9c0.f127051s1, 36);
        f1295c.append(l9c0.f127048r1, 35);
        f1295c.append(l9c0.f126978R0, 4);
        f1295c.append(l9c0.f126976Q0, 3);
        f1295c.append(l9c0.f126972O0, 1);
        f1295c.append(l9c0.f126937A1, 6);
        f1295c.append(l9c0.f126940B1, 7);
        f1295c.append(l9c0.f126992Y0, 17);
        f1295c.append(l9c0.f126994Z0, 18);
        f1295c.append(l9c0.f126997a1, 19);
        f1295c.append(l9c0.f127032m0, 27);
        f1295c.append(l9c0.f127039o1, 32);
        f1295c.append(l9c0.f127042p1, 33);
        f1295c.append(l9c0.f126990X0, 10);
        f1295c.append(l9c0.f126988W0, 9);
        f1295c.append(l9c0.f126949E1, 13);
        f1295c.append(l9c0.f126958H1, 16);
        f1295c.append(l9c0.f126952F1, 14);
        f1295c.append(l9c0.f126943C1, 11);
        f1295c.append(l9c0.f126955G1, 15);
        f1295c.append(l9c0.f126946D1, 12);
        f1295c.append(l9c0.f127060v1, 40);
        f1295c.append(l9c0.f127018h1, 39);
        f1295c.append(l9c0.f127015g1, 41);
        f1295c.append(l9c0.f127057u1, 42);
        f1295c.append(l9c0.f127012f1, 20);
        f1295c.append(l9c0.f127054t1, 37);
        f1295c.append(l9c0.f126986V0, 5);
        f1295c.append(l9c0.f127021i1, 75);
        f1295c.append(l9c0.f127045q1, 75);
        f1295c.append(l9c0.f127030l1, 75);
        f1295c.append(l9c0.f126974P0, 75);
        f1295c.append(l9c0.f126970N0, 75);
        f1295c.append(l9c0.f127047r0, 24);
        f1295c.append(l9c0.f127053t0, 28);
        f1295c.append(l9c0.f126951F0, 31);
        f1295c.append(l9c0.f126954G0, 8);
        f1295c.append(l9c0.f127050s0, 34);
        f1295c.append(l9c0.f127056u0, 2);
        f1295c.append(l9c0.f127041p0, 23);
        f1295c.append(l9c0.f127044q0, 21);
        f1295c.append(l9c0.f127038o0, 22);
        f1295c.append(l9c0.f127059v0, 43);
        f1295c.append(l9c0.f126960I0, 44);
        f1295c.append(l9c0.f126945D0, 45);
        f1295c.append(l9c0.f126948E0, 46);
        f1295c.append(l9c0.f126942C0, 60);
        f1295c.append(l9c0.f126936A0, 47);
        f1295c.append(l9c0.f126939B0, 48);
        f1295c.append(l9c0.f127062w0, 49);
        f1295c.append(l9c0.f127065x0, 50);
        f1295c.append(l9c0.f127068y0, 51);
        f1295c.append(l9c0.f127071z0, 52);
        f1295c.append(l9c0.f126957H0, 53);
        f1295c.append(l9c0.f127063w1, 54);
        f1295c.append(l9c0.f127000b1, 55);
        f1295c.append(l9c0.f127066x1, 56);
        f1295c.append(l9c0.f127003c1, 57);
        f1295c.append(l9c0.f127069y1, 58);
        f1295c.append(l9c0.f127006d1, 59);
        f1295c.append(l9c0.f126980S0, 61);
        f1295c.append(l9c0.f126984U0, 62);
        f1295c.append(l9c0.f126982T0, 63);
        f1295c.append(l9c0.f127035n0, 38);
        f1295c.append(l9c0.f127072z1, 69);
        f1295c.append(l9c0.f127009e1, 70);
        f1295c.append(l9c0.f126966L0, 71);
        f1295c.append(l9c0.f126964K0, 72);
        f1295c.append(l9c0.f126968M0, 73);
        f1295c.append(l9c0.f126962J0, 74);
    }

    /* JADX INFO: renamed from: o */
    public static int m1145o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: a */
    public void m1146a(ConstraintLayout constraintLayout) {
        m1147b(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    /* JADX INFO: renamed from: b */
    public void m1147b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f1296a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                upk0.m194883a("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (this.f1296a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                b bVar = this.f1296a.get(Integer.valueOf(id));
                if (childAt instanceof Barrier) {
                    bVar.f1362t0 = 1;
                }
                int i2 = bVar.f1362t0;
                if (i2 != -1 && i2 == 1) {
                    Barrier barrier = (Barrier) childAt;
                    barrier.setId(id);
                    barrier.setType(bVar.f1360s0);
                    barrier.setAllowsGoneWidget(bVar.f1358r0);
                    int[] iArr = bVar.f1364u0;
                    if (iArr != null) {
                        barrier.setReferencedIds(iArr);
                    } else {
                        String str = bVar.f1366v0;
                        if (str != null) {
                            int[] iArrM1156k = m1156k(barrier, str);
                            bVar.f1364u0 = iArrM1156k;
                            barrier.setReferencedIds(iArrM1156k);
                        }
                    }
                }
                ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) childAt.getLayoutParams();
                bVar.m1168d(c0220a);
                childAt.setLayoutParams(c0220a);
                childAt.setVisibility(bVar.f1306J);
                childAt.setAlpha(bVar.f1317U);
                childAt.setRotation(bVar.f1320X);
                childAt.setRotationX(bVar.f1321Y);
                childAt.setRotationY(bVar.f1322Z);
                childAt.setScaleX(bVar.f1324a0);
                childAt.setScaleY(bVar.f1326b0);
                if (!Float.isNaN(bVar.f1328c0)) {
                    childAt.setPivotX(bVar.f1328c0);
                }
                if (!Float.isNaN(bVar.f1330d0)) {
                    childAt.setPivotY(bVar.f1330d0);
                }
                childAt.setTranslationX(bVar.f1332e0);
                childAt.setTranslationY(bVar.f1334f0);
                childAt.setTranslationZ(bVar.f1336g0);
                if (bVar.f1318V) {
                    childAt.setElevation(bVar.f1319W);
                }
            }
        }
        for (Integer num : hashSet) {
            b bVar2 = this.f1296a.get(num);
            int i3 = bVar2.f1362t0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = bVar2.f1364u0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f1366v0;
                    if (str2 != null) {
                        int[] iArrM1156k2 = m1156k(barrier2, str2);
                        bVar2.f1364u0 = iArrM1156k2;
                        barrier2.setReferencedIds(iArrM1156k2);
                    }
                }
                barrier2.setType(bVar2.f1360s0);
                ConstraintLayout.C0220a c0220aGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m1137f();
                bVar2.m1168d(c0220aGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, c0220aGenerateDefaultLayoutParams);
            }
            if (bVar2.f1323a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0220a c0220aGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                bVar2.m1168d(c0220aGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, c0220aGenerateDefaultLayoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1148c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1296a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                upk0.m194883a("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!this.f1296a.containsKey(Integer.valueOf(id))) {
                this.f1296a.put(Integer.valueOf(id), new b());
            }
            b bVar = this.f1296a.get(Integer.valueOf(id));
            bVar.m1170f(id, c0220a);
            bVar.f1306J = childAt.getVisibility();
            bVar.f1317U = childAt.getAlpha();
            bVar.f1320X = childAt.getRotation();
            bVar.f1321Y = childAt.getRotationX();
            bVar.f1322Z = childAt.getRotationY();
            bVar.f1324a0 = childAt.getScaleX();
            bVar.f1326b0 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || pivotY != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                bVar.f1328c0 = pivotX;
                bVar.f1330d0 = pivotY;
            }
            bVar.f1332e0 = childAt.getTranslationX();
            bVar.f1334f0 = childAt.getTranslationY();
            bVar.f1336g0 = childAt.getTranslationZ();
            if (bVar.f1318V) {
                bVar.f1319W = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                bVar.f1358r0 = barrier.m1132g();
                bVar.f1364u0 = barrier.getReferencedIds();
                bVar.f1360s0 = barrier.getType();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1149d(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f1296a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.C0221a c0221a = (Constraints.C0221a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                upk0.m194883a("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!this.f1296a.containsKey(Integer.valueOf(id))) {
                this.f1296a.put(Integer.valueOf(id), new b());
            }
            b bVar = this.f1296a.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                bVar.m1172h((ConstraintHelper) childAt, id, c0221a);
            }
            bVar.m1171g(id, c0221a);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1150e(int i, int i2, int i3, int i4) {
        if (!this.f1296a.containsKey(Integer.valueOf(i))) {
            this.f1296a.put(Integer.valueOf(i), new b());
        }
        b bVar = this.f1296a.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    bVar.f1337h = i3;
                    bVar.f1339i = -1;
                    return;
                } else if (i4 != 2) {
                    all.m97315a("left to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1339i = i3;
                    bVar.f1337h = -1;
                    return;
                }
            case 2:
                if (i4 == 1) {
                    bVar.f1341j = i3;
                    bVar.f1343k = -1;
                    return;
                } else if (i4 != 2) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1343k = i3;
                    bVar.f1341j = -1;
                    return;
                }
            case 3:
                if (i4 == 3) {
                    bVar.f1345l = i3;
                    bVar.f1347m = -1;
                    bVar.f1353p = -1;
                    return;
                } else {
                    if (i4 != 4) {
                        all.m97315a("right to ", m1164t(i4), " undefined");
                        return;
                    }
                    bVar.f1347m = i3;
                    bVar.f1345l = -1;
                    bVar.f1353p = -1;
                    return;
                }
            case 4:
                if (i4 == 4) {
                    bVar.f1351o = i3;
                    bVar.f1349n = -1;
                    bVar.f1353p = -1;
                    return;
                } else {
                    if (i4 != 3) {
                        all.m97315a("right to ", m1164t(i4), " undefined");
                        return;
                    }
                    bVar.f1349n = i3;
                    bVar.f1351o = -1;
                    bVar.f1353p = -1;
                    return;
                }
            case 5:
                if (i4 != 5) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                }
                bVar.f1353p = i3;
                bVar.f1351o = -1;
                bVar.f1349n = -1;
                bVar.f1345l = -1;
                bVar.f1347m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    bVar.f1357r = i3;
                    bVar.f1355q = -1;
                    return;
                } else if (i4 != 7) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1355q = i3;
                    bVar.f1357r = -1;
                    return;
                }
            case 7:
                if (i4 == 7) {
                    bVar.f1361t = i3;
                    bVar.f1359s = -1;
                    return;
                } else if (i4 != 6) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1359s = i3;
                    bVar.f1361t = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(m1164t(i2) + " to " + m1164t(i4) + " unknown");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1151f(int i, int i2, int i3, int i4, int i5) {
        if (!this.f1296a.containsKey(Integer.valueOf(i))) {
            this.f1296a.put(Integer.valueOf(i), new b());
        }
        b bVar = this.f1296a.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    bVar.f1337h = i3;
                    bVar.f1339i = -1;
                } else if (i4 != 2) {
                    all.m97315a("Left to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1339i = i3;
                    bVar.f1337h = -1;
                }
                bVar.f1300D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    bVar.f1341j = i3;
                    bVar.f1343k = -1;
                } else if (i4 != 2) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1343k = i3;
                    bVar.f1341j = -1;
                }
                bVar.f1301E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    bVar.f1345l = i3;
                    bVar.f1347m = -1;
                    bVar.f1353p = -1;
                } else if (i4 != 4) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1347m = i3;
                    bVar.f1345l = -1;
                    bVar.f1353p = -1;
                }
                bVar.f1302F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    bVar.f1351o = i3;
                    bVar.f1349n = -1;
                    bVar.f1353p = -1;
                } else if (i4 != 3) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1349n = i3;
                    bVar.f1351o = -1;
                    bVar.f1353p = -1;
                }
                bVar.f1303G = i5;
                return;
            case 5:
                if (i4 != 5) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                }
                bVar.f1353p = i3;
                bVar.f1351o = -1;
                bVar.f1349n = -1;
                bVar.f1345l = -1;
                bVar.f1347m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    bVar.f1357r = i3;
                    bVar.f1355q = -1;
                } else if (i4 != 7) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1355q = i3;
                    bVar.f1357r = -1;
                }
                bVar.f1305I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    bVar.f1361t = i3;
                    bVar.f1359s = -1;
                } else if (i4 != 6) {
                    all.m97315a("right to ", m1164t(i4), " undefined");
                    return;
                } else {
                    bVar.f1359s = i3;
                    bVar.f1361t = -1;
                }
                bVar.f1304H = i5;
                return;
            default:
                throw new IllegalArgumentException(m1164t(i2) + " to " + m1164t(i4) + " unknown");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1152g(int i, int i2) {
        m1158m(i).f1327c = i2;
    }

    /* JADX INFO: renamed from: h */
    public void m1153h(int i, int i2) {
        m1158m(i).f1352o0 = i2;
    }

    /* JADX INFO: renamed from: i */
    public void m1154i(int i, int i2) {
        m1158m(i).f1350n0 = i2;
    }

    /* JADX INFO: renamed from: j */
    public void m1155j(int i, int i2) {
        m1158m(i).f1325b = i2;
    }

    /* JADX INFO: renamed from: k */
    public final int[] m1156k(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = t4c0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: l */
    public final b m1157l(Context context, AttributeSet attributeSet) {
        b bVar = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l9c0.f127029l0);
        m1160p(bVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return bVar;
    }

    /* JADX INFO: renamed from: m */
    public final b m1158m(int i) {
        if (!this.f1296a.containsKey(Integer.valueOf(i))) {
            this.f1296a.put(Integer.valueOf(i), new b());
        }
        return this.f1296a.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public void m1159n(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    b bVarM1157l = m1157l(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        bVarM1157l.f1323a = true;
                    }
                    this.f1296a.put(Integer.valueOf(bVarM1157l.f1329d), bVarM1157l);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1160p(b bVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f1295c.get(index);
            switch (i2) {
                case 1:
                    bVar.f1353p = m1145o(typedArray, index, bVar.f1353p);
                    break;
                case 2:
                    bVar.f1303G = typedArray.getDimensionPixelSize(index, bVar.f1303G);
                    break;
                case 3:
                    bVar.f1351o = m1145o(typedArray, index, bVar.f1351o);
                    break;
                case 4:
                    bVar.f1349n = m1145o(typedArray, index, bVar.f1349n);
                    break;
                case 5:
                    bVar.f1367w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.f1297A = typedArray.getDimensionPixelOffset(index, bVar.f1297A);
                    break;
                case 7:
                    bVar.f1298B = typedArray.getDimensionPixelOffset(index, bVar.f1298B);
                    break;
                case 8:
                    bVar.f1304H = typedArray.getDimensionPixelSize(index, bVar.f1304H);
                    break;
                case 9:
                    bVar.f1361t = m1145o(typedArray, index, bVar.f1361t);
                    break;
                case 10:
                    bVar.f1359s = m1145o(typedArray, index, bVar.f1359s);
                    break;
                case 11:
                    bVar.f1310N = typedArray.getDimensionPixelSize(index, bVar.f1310N);
                    break;
                case 12:
                    bVar.f1311O = typedArray.getDimensionPixelSize(index, bVar.f1311O);
                    break;
                case 13:
                    bVar.f1307K = typedArray.getDimensionPixelSize(index, bVar.f1307K);
                    break;
                case 14:
                    bVar.f1309M = typedArray.getDimensionPixelSize(index, bVar.f1309M);
                    break;
                case 15:
                    bVar.f1312P = typedArray.getDimensionPixelSize(index, bVar.f1312P);
                    break;
                case 16:
                    bVar.f1308L = typedArray.getDimensionPixelSize(index, bVar.f1308L);
                    break;
                case 17:
                    bVar.f1331e = typedArray.getDimensionPixelOffset(index, bVar.f1331e);
                    break;
                case 18:
                    bVar.f1333f = typedArray.getDimensionPixelOffset(index, bVar.f1333f);
                    break;
                case 19:
                    bVar.f1335g = typedArray.getFloat(index, bVar.f1335g);
                    break;
                case 20:
                    bVar.f1363u = typedArray.getFloat(index, bVar.f1363u);
                    break;
                case 21:
                    bVar.f1327c = typedArray.getLayoutDimension(index, bVar.f1327c);
                    break;
                case 22:
                    int i3 = typedArray.getInt(index, bVar.f1306J);
                    bVar.f1306J = i3;
                    bVar.f1306J = f1294b[i3];
                    break;
                case 23:
                    bVar.f1325b = typedArray.getLayoutDimension(index, bVar.f1325b);
                    break;
                case 24:
                    bVar.f1300D = typedArray.getDimensionPixelSize(index, bVar.f1300D);
                    break;
                case 25:
                    bVar.f1337h = m1145o(typedArray, index, bVar.f1337h);
                    break;
                case 26:
                    bVar.f1339i = m1145o(typedArray, index, bVar.f1339i);
                    break;
                case 27:
                    bVar.f1299C = typedArray.getInt(index, bVar.f1299C);
                    break;
                case 28:
                    bVar.f1301E = typedArray.getDimensionPixelSize(index, bVar.f1301E);
                    break;
                case 29:
                    bVar.f1341j = m1145o(typedArray, index, bVar.f1341j);
                    break;
                case 30:
                    bVar.f1343k = m1145o(typedArray, index, bVar.f1343k);
                    break;
                case 31:
                    bVar.f1305I = typedArray.getDimensionPixelSize(index, bVar.f1305I);
                    break;
                case 32:
                    bVar.f1355q = m1145o(typedArray, index, bVar.f1355q);
                    break;
                case 33:
                    bVar.f1357r = m1145o(typedArray, index, bVar.f1357r);
                    break;
                case 34:
                    bVar.f1302F = typedArray.getDimensionPixelSize(index, bVar.f1302F);
                    break;
                case 35:
                    bVar.f1347m = m1145o(typedArray, index, bVar.f1347m);
                    break;
                case 36:
                    bVar.f1345l = m1145o(typedArray, index, bVar.f1345l);
                    break;
                case 37:
                    bVar.f1365v = typedArray.getFloat(index, bVar.f1365v);
                    break;
                case 38:
                    bVar.f1329d = typedArray.getResourceId(index, bVar.f1329d);
                    break;
                case 39:
                    bVar.f1314R = typedArray.getFloat(index, bVar.f1314R);
                    break;
                case 40:
                    bVar.f1313Q = typedArray.getFloat(index, bVar.f1313Q);
                    break;
                case 41:
                    bVar.f1315S = typedArray.getInt(index, bVar.f1315S);
                    break;
                case 42:
                    bVar.f1316T = typedArray.getInt(index, bVar.f1316T);
                    break;
                case 43:
                    bVar.f1317U = typedArray.getFloat(index, bVar.f1317U);
                    break;
                case 44:
                    bVar.f1318V = true;
                    bVar.f1319W = typedArray.getDimension(index, bVar.f1319W);
                    break;
                case 45:
                    bVar.f1321Y = typedArray.getFloat(index, bVar.f1321Y);
                    break;
                case 46:
                    bVar.f1322Z = typedArray.getFloat(index, bVar.f1322Z);
                    break;
                case 47:
                    bVar.f1324a0 = typedArray.getFloat(index, bVar.f1324a0);
                    break;
                case 48:
                    bVar.f1326b0 = typedArray.getFloat(index, bVar.f1326b0);
                    break;
                case 49:
                    bVar.f1328c0 = typedArray.getFloat(index, bVar.f1328c0);
                    break;
                case 50:
                    bVar.f1330d0 = typedArray.getFloat(index, bVar.f1330d0);
                    break;
                case 51:
                    bVar.f1332e0 = typedArray.getDimension(index, bVar.f1332e0);
                    break;
                case 52:
                    bVar.f1334f0 = typedArray.getDimension(index, bVar.f1334f0);
                    break;
                case 53:
                    bVar.f1336g0 = typedArray.getDimension(index, bVar.f1336g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            bVar.f1320X = typedArray.getFloat(index, bVar.f1320X);
                            break;
                        case 61:
                            bVar.f1368x = m1145o(typedArray, index, bVar.f1368x);
                            break;
                        case 62:
                            bVar.f1369y = typedArray.getDimensionPixelSize(index, bVar.f1369y);
                            break;
                        case 63:
                            bVar.f1370z = typedArray.getFloat(index, bVar.f1370z);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    bVar.f1354p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    bVar.f1356q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    bVar.f1360s0 = typedArray.getInt(index, bVar.f1360s0);
                                    break;
                                case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                                    bVar.f1366v0 = typedArray.getString(index);
                                    break;
                                case 74:
                                    bVar.f1358r0 = typedArray.getBoolean(index, bVar.f1358r0);
                                    break;
                                case 75:
                                    Integer.toHexString(index);
                                    f1295c.get(index);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    f1295c.get(index);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1161q(int i, String str) {
        m1158m(i).f1367w = str;
    }

    /* JADX INFO: renamed from: r */
    public void m1162r(int i, float f) {
        m1158m(i).f1336g0 = f;
    }

    /* JADX INFO: renamed from: s */
    public void m1163s(int i, int i2) {
        m1158m(i).f1306J = i2;
    }

    /* JADX INFO: renamed from: t */
    public final String m1164t(int i) {
        switch (i) {
            case 1:
                return BLiveGiftBubblePopupTitlePosition.left;
            case 2:
                return "right";
            case 3:
                return StickStatus.top;
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return NotificationStatus.undefined;
        }
    }
}
