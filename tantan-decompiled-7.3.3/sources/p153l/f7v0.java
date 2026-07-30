package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class f7v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: A */
    public static final FieldDescriptor f97598A;

    /* JADX INFO: renamed from: B */
    public static final FieldDescriptor f97599B;

    /* JADX INFO: renamed from: C */
    public static final FieldDescriptor f97600C;

    /* JADX INFO: renamed from: D */
    public static final FieldDescriptor f97601D;

    /* JADX INFO: renamed from: E */
    public static final FieldDescriptor f97602E;

    /* JADX INFO: renamed from: F */
    public static final FieldDescriptor f97603F;

    /* JADX INFO: renamed from: G */
    public static final FieldDescriptor f97604G;

    /* JADX INFO: renamed from: H */
    public static final FieldDescriptor f97605H;

    /* JADX INFO: renamed from: I */
    public static final FieldDescriptor f97606I;

    /* JADX INFO: renamed from: J */
    public static final FieldDescriptor f97607J;

    /* JADX INFO: renamed from: K */
    public static final FieldDescriptor f97608K;

    /* JADX INFO: renamed from: L */
    public static final FieldDescriptor f97609L;

    /* JADX INFO: renamed from: M */
    public static final FieldDescriptor f97610M;

    /* JADX INFO: renamed from: N */
    public static final FieldDescriptor f97611N;

    /* JADX INFO: renamed from: O */
    public static final FieldDescriptor f97612O;

    /* JADX INFO: renamed from: P */
    public static final FieldDescriptor f97613P;

    /* JADX INFO: renamed from: Q */
    public static final FieldDescriptor f97614Q;

    /* JADX INFO: renamed from: R */
    public static final FieldDescriptor f97615R;

    /* JADX INFO: renamed from: S */
    public static final FieldDescriptor f97616S;

    /* JADX INFO: renamed from: T */
    public static final FieldDescriptor f97617T;

    /* JADX INFO: renamed from: U */
    public static final FieldDescriptor f97618U;

    /* JADX INFO: renamed from: V */
    public static final FieldDescriptor f97619V;

    /* JADX INFO: renamed from: W */
    public static final FieldDescriptor f97620W;

    /* JADX INFO: renamed from: X */
    public static final FieldDescriptor f97621X;

    /* JADX INFO: renamed from: Y */
    public static final FieldDescriptor f97622Y;

    /* JADX INFO: renamed from: Z */
    public static final FieldDescriptor f97623Z;

    /* JADX INFO: renamed from: a */
    public static final f7v0 f97624a = new f7v0();

    /* JADX INFO: renamed from: a0 */
    public static final FieldDescriptor f97625a0;

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f97626b;

    /* JADX INFO: renamed from: b0 */
    public static final FieldDescriptor f97627b0;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f97628c;

    /* JADX INFO: renamed from: c0 */
    public static final FieldDescriptor f97629c0;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f97630d;

    /* JADX INFO: renamed from: d0 */
    public static final FieldDescriptor f97631d0;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f97632e;

    /* JADX INFO: renamed from: e0 */
    public static final FieldDescriptor f97633e0;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f97634f;

    /* JADX INFO: renamed from: f0 */
    public static final FieldDescriptor f97635f0;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f97636g;

    /* JADX INFO: renamed from: g0 */
    public static final FieldDescriptor f97637g0;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f97638h;

    /* JADX INFO: renamed from: h0 */
    public static final FieldDescriptor f97639h0;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f97640i;

    /* JADX INFO: renamed from: i0 */
    public static final FieldDescriptor f97641i0;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f97642j;

    /* JADX INFO: renamed from: j0 */
    public static final FieldDescriptor f97643j0;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f97644k;

    /* JADX INFO: renamed from: k0 */
    public static final FieldDescriptor f97645k0;

    /* JADX INFO: renamed from: l */
    public static final FieldDescriptor f97646l;

    /* JADX INFO: renamed from: l0 */
    public static final FieldDescriptor f97647l0;

    /* JADX INFO: renamed from: m */
    public static final FieldDescriptor f97648m;

    /* JADX INFO: renamed from: m0 */
    public static final FieldDescriptor f97649m0;

    /* JADX INFO: renamed from: n */
    public static final FieldDescriptor f97650n;

    /* JADX INFO: renamed from: n0 */
    public static final FieldDescriptor f97651n0;

    /* JADX INFO: renamed from: o */
    public static final FieldDescriptor f97652o;

    /* JADX INFO: renamed from: o0 */
    public static final FieldDescriptor f97653o0;

    /* JADX INFO: renamed from: p */
    public static final FieldDescriptor f97654p;

    /* JADX INFO: renamed from: p0 */
    public static final FieldDescriptor f97655p0;

    /* JADX INFO: renamed from: q */
    public static final FieldDescriptor f97656q;

    /* JADX INFO: renamed from: q0 */
    public static final FieldDescriptor f97657q0;

    /* JADX INFO: renamed from: r */
    public static final FieldDescriptor f97658r;

    /* JADX INFO: renamed from: r0 */
    public static final FieldDescriptor f97659r0;

    /* JADX INFO: renamed from: s */
    public static final FieldDescriptor f97660s;

    /* JADX INFO: renamed from: s0 */
    public static final FieldDescriptor f97661s0;

    /* JADX INFO: renamed from: t */
    public static final FieldDescriptor f97662t;

    /* JADX INFO: renamed from: t0 */
    public static final FieldDescriptor f97663t0;

    /* JADX INFO: renamed from: u */
    public static final FieldDescriptor f97664u;

    /* JADX INFO: renamed from: u0 */
    public static final FieldDescriptor f97665u0;

    /* JADX INFO: renamed from: v */
    public static final FieldDescriptor f97666v;

    /* JADX INFO: renamed from: v0 */
    public static final FieldDescriptor f97667v0;

    /* JADX INFO: renamed from: w */
    public static final FieldDescriptor f97668w;

    /* JADX INFO: renamed from: w0 */
    public static final FieldDescriptor f97669w0;

    /* JADX INFO: renamed from: x */
    public static final FieldDescriptor f97670x;

    /* JADX INFO: renamed from: x0 */
    public static final FieldDescriptor f97671x0;

    /* JADX INFO: renamed from: y */
    public static final FieldDescriptor f97672y;

    /* JADX INFO: renamed from: y0 */
    public static final FieldDescriptor f97673y0;

    /* JADX INFO: renamed from: z */
    public static final FieldDescriptor f97674z;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("systemInfo");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f97626b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventName");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f97628c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isThickClient");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(37);
        f97630d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientType");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(61);
        f97632e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelDownloadLogEvent");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(3);
        f97634f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customModelLoadLogEvent");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(20);
        f97636g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("customModelInferenceLogEvent");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(4);
        f97638h = builder7.withProperty(hlr0Var7.m135771b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customModelCreateLogEvent");
        hlr0 hlr0Var8 = new hlr0();
        hlr0Var8.m135770a(29);
        f97640i = builder8.withProperty(hlr0Var8.m135771b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("onDeviceFaceDetectionLogEvent");
        hlr0 hlr0Var9 = new hlr0();
        hlr0Var9.m135770a(5);
        f97642j = builder9.withProperty(hlr0Var9.m135771b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("onDeviceFaceLoadLogEvent");
        hlr0 hlr0Var10 = new hlr0();
        hlr0Var10.m135770a(59);
        f97644k = builder10.withProperty(hlr0Var10.m135771b()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("onDeviceTextDetectionLogEvent");
        hlr0 hlr0Var11 = new hlr0();
        hlr0Var11.m135770a(6);
        f97646l = builder11.withProperty(hlr0Var11.m135771b()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("onDeviceTextDetectionLoadLogEvent");
        hlr0 hlr0Var12 = new hlr0();
        hlr0Var12.m135770a(79);
        f97648m = builder12.withProperty(hlr0Var12.m135771b()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("onDeviceBarcodeDetectionLogEvent");
        hlr0 hlr0Var13 = new hlr0();
        hlr0Var13.m135770a(7);
        f97650n = builder13.withProperty(hlr0Var13.m135771b()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("onDeviceBarcodeLoadLogEvent");
        hlr0 hlr0Var14 = new hlr0();
        hlr0Var14.m135770a(58);
        f97652o = builder14.withProperty(hlr0Var14.m135771b()).build();
        FieldDescriptor.Builder builder15 = FieldDescriptor.builder("onDeviceImageLabelCreateLogEvent");
        hlr0 hlr0Var15 = new hlr0();
        hlr0Var15.m135770a(48);
        f97654p = builder15.withProperty(hlr0Var15.m135771b()).build();
        FieldDescriptor.Builder builder16 = FieldDescriptor.builder("onDeviceImageLabelLoadLogEvent");
        hlr0 hlr0Var16 = new hlr0();
        hlr0Var16.m135770a(49);
        f97656q = builder16.withProperty(hlr0Var16.m135771b()).build();
        FieldDescriptor.Builder builder17 = FieldDescriptor.builder("onDeviceImageLabelDetectionLogEvent");
        hlr0 hlr0Var17 = new hlr0();
        hlr0Var17.m135770a(18);
        f97658r = builder17.withProperty(hlr0Var17.m135771b()).build();
        FieldDescriptor.Builder builder18 = FieldDescriptor.builder("onDeviceObjectCreateLogEvent");
        hlr0 hlr0Var18 = new hlr0();
        hlr0Var18.m135770a(26);
        f97660s = builder18.withProperty(hlr0Var18.m135771b()).build();
        FieldDescriptor.Builder builder19 = FieldDescriptor.builder("onDeviceObjectLoadLogEvent");
        hlr0 hlr0Var19 = new hlr0();
        hlr0Var19.m135770a(27);
        f97662t = builder19.withProperty(hlr0Var19.m135771b()).build();
        FieldDescriptor.Builder builder20 = FieldDescriptor.builder("onDeviceObjectInferenceLogEvent");
        hlr0 hlr0Var20 = new hlr0();
        hlr0Var20.m135770a(28);
        f97664u = builder20.withProperty(hlr0Var20.m135771b()).build();
        FieldDescriptor.Builder builder21 = FieldDescriptor.builder("onDevicePoseDetectionLogEvent");
        hlr0 hlr0Var21 = new hlr0();
        hlr0Var21.m135770a(44);
        f97666v = builder21.withProperty(hlr0Var21.m135771b()).build();
        FieldDescriptor.Builder builder22 = FieldDescriptor.builder("onDeviceSegmentationLogEvent");
        hlr0 hlr0Var22 = new hlr0();
        hlr0Var22.m135770a(45);
        f97668w = builder22.withProperty(hlr0Var22.m135771b()).build();
        FieldDescriptor.Builder builder23 = FieldDescriptor.builder("onDeviceSmartReplyLogEvent");
        hlr0 hlr0Var23 = new hlr0();
        hlr0Var23.m135770a(19);
        f97670x = builder23.withProperty(hlr0Var23.m135771b()).build();
        FieldDescriptor.Builder builder24 = FieldDescriptor.builder("onDeviceLanguageIdentificationLogEvent");
        hlr0 hlr0Var24 = new hlr0();
        hlr0Var24.m135770a(21);
        f97672y = builder24.withProperty(hlr0Var24.m135771b()).build();
        FieldDescriptor.Builder builder25 = FieldDescriptor.builder("onDeviceTranslationLogEvent");
        hlr0 hlr0Var25 = new hlr0();
        hlr0Var25.m135770a(22);
        f97674z = builder25.withProperty(hlr0Var25.m135771b()).build();
        FieldDescriptor.Builder builder26 = FieldDescriptor.builder("cloudFaceDetectionLogEvent");
        hlr0 hlr0Var26 = new hlr0();
        hlr0Var26.m135770a(8);
        f97598A = builder26.withProperty(hlr0Var26.m135771b()).build();
        FieldDescriptor.Builder builder27 = FieldDescriptor.builder("cloudCropHintDetectionLogEvent");
        hlr0 hlr0Var27 = new hlr0();
        hlr0Var27.m135770a(9);
        f97599B = builder27.withProperty(hlr0Var27.m135771b()).build();
        FieldDescriptor.Builder builder28 = FieldDescriptor.builder("cloudDocumentTextDetectionLogEvent");
        hlr0 hlr0Var28 = new hlr0();
        hlr0Var28.m135770a(10);
        f97600C = builder28.withProperty(hlr0Var28.m135771b()).build();
        FieldDescriptor.Builder builder29 = FieldDescriptor.builder("cloudImagePropertiesDetectionLogEvent");
        hlr0 hlr0Var29 = new hlr0();
        hlr0Var29.m135770a(11);
        f97601D = builder29.withProperty(hlr0Var29.m135771b()).build();
        FieldDescriptor.Builder builder30 = FieldDescriptor.builder("cloudImageLabelDetectionLogEvent");
        hlr0 hlr0Var30 = new hlr0();
        hlr0Var30.m135770a(12);
        f97602E = builder30.withProperty(hlr0Var30.m135771b()).build();
        FieldDescriptor.Builder builder31 = FieldDescriptor.builder("cloudLandmarkDetectionLogEvent");
        hlr0 hlr0Var31 = new hlr0();
        hlr0Var31.m135770a(13);
        f97603F = builder31.withProperty(hlr0Var31.m135771b()).build();
        FieldDescriptor.Builder builder32 = FieldDescriptor.builder("cloudLogoDetectionLogEvent");
        hlr0 hlr0Var32 = new hlr0();
        hlr0Var32.m135770a(14);
        f97604G = builder32.withProperty(hlr0Var32.m135771b()).build();
        FieldDescriptor.Builder builder33 = FieldDescriptor.builder("cloudSafeSearchDetectionLogEvent");
        hlr0 hlr0Var33 = new hlr0();
        hlr0Var33.m135770a(15);
        f97605H = builder33.withProperty(hlr0Var33.m135771b()).build();
        FieldDescriptor.Builder builder34 = FieldDescriptor.builder("cloudTextDetectionLogEvent");
        hlr0 hlr0Var34 = new hlr0();
        hlr0Var34.m135770a(16);
        f97606I = builder34.withProperty(hlr0Var34.m135771b()).build();
        FieldDescriptor.Builder builder35 = FieldDescriptor.builder("cloudWebSearchDetectionLogEvent");
        hlr0 hlr0Var35 = new hlr0();
        hlr0Var35.m135770a(17);
        f97607J = builder35.withProperty(hlr0Var35.m135771b()).build();
        FieldDescriptor.Builder builder36 = FieldDescriptor.builder("automlImageLabelingCreateLogEvent");
        hlr0 hlr0Var36 = new hlr0();
        hlr0Var36.m135770a(23);
        f97608K = builder36.withProperty(hlr0Var36.m135771b()).build();
        FieldDescriptor.Builder builder37 = FieldDescriptor.builder("automlImageLabelingLoadLogEvent");
        hlr0 hlr0Var37 = new hlr0();
        hlr0Var37.m135770a(24);
        f97609L = builder37.withProperty(hlr0Var37.m135771b()).build();
        FieldDescriptor.Builder builder38 = FieldDescriptor.builder("automlImageLabelingInferenceLogEvent");
        hlr0 hlr0Var38 = new hlr0();
        hlr0Var38.m135770a(25);
        f97610M = builder38.withProperty(hlr0Var38.m135771b()).build();
        FieldDescriptor.Builder builder39 = FieldDescriptor.builder("isModelDownloadedLogEvent");
        hlr0 hlr0Var39 = new hlr0();
        hlr0Var39.m135770a(39);
        f97611N = builder39.withProperty(hlr0Var39.m135771b()).build();
        FieldDescriptor.Builder builder40 = FieldDescriptor.builder("deleteModelLogEvent");
        hlr0 hlr0Var40 = new hlr0();
        hlr0Var40.m135770a(40);
        f97612O = builder40.withProperty(hlr0Var40.m135771b()).build();
        FieldDescriptor.Builder builder41 = FieldDescriptor.builder("aggregatedAutomlImageLabelingInferenceLogEvent");
        hlr0 hlr0Var41 = new hlr0();
        hlr0Var41.m135770a(30);
        f97613P = builder41.withProperty(hlr0Var41.m135771b()).build();
        FieldDescriptor.Builder builder42 = FieldDescriptor.builder("aggregatedCustomModelInferenceLogEvent");
        hlr0 hlr0Var42 = new hlr0();
        hlr0Var42.m135770a(31);
        f97614Q = builder42.withProperty(hlr0Var42.m135771b()).build();
        FieldDescriptor.Builder builder43 = FieldDescriptor.builder("aggregatedOnDeviceFaceDetectionLogEvent");
        hlr0 hlr0Var43 = new hlr0();
        hlr0Var43.m135770a(32);
        f97615R = builder43.withProperty(hlr0Var43.m135771b()).build();
        FieldDescriptor.Builder builder44 = FieldDescriptor.builder("aggregatedOnDeviceBarcodeDetectionLogEvent");
        hlr0 hlr0Var44 = new hlr0();
        hlr0Var44.m135770a(33);
        f97616S = builder44.withProperty(hlr0Var44.m135771b()).build();
        FieldDescriptor.Builder builder45 = FieldDescriptor.builder("aggregatedOnDeviceImageLabelDetectionLogEvent");
        hlr0 hlr0Var45 = new hlr0();
        hlr0Var45.m135770a(34);
        f97617T = builder45.withProperty(hlr0Var45.m135771b()).build();
        FieldDescriptor.Builder builder46 = FieldDescriptor.builder("aggregatedOnDeviceObjectInferenceLogEvent");
        hlr0 hlr0Var46 = new hlr0();
        hlr0Var46.m135770a(35);
        f97618U = builder46.withProperty(hlr0Var46.m135771b()).build();
        FieldDescriptor.Builder builder47 = FieldDescriptor.builder("aggregatedOnDeviceTextDetectionLogEvent");
        hlr0 hlr0Var47 = new hlr0();
        hlr0Var47.m135770a(36);
        f97619V = builder47.withProperty(hlr0Var47.m135771b()).build();
        FieldDescriptor.Builder builder48 = FieldDescriptor.builder("aggregatedOnDevicePoseDetectionLogEvent");
        hlr0 hlr0Var48 = new hlr0();
        hlr0Var48.m135770a(46);
        f97620W = builder48.withProperty(hlr0Var48.m135771b()).build();
        FieldDescriptor.Builder builder49 = FieldDescriptor.builder("aggregatedOnDeviceSegmentationLogEvent");
        hlr0 hlr0Var49 = new hlr0();
        hlr0Var49.m135770a(47);
        f97621X = builder49.withProperty(hlr0Var49.m135771b()).build();
        FieldDescriptor.Builder builder50 = FieldDescriptor.builder("pipelineAccelerationInferenceEvents");
        hlr0 hlr0Var50 = new hlr0();
        hlr0Var50.m135770a(69);
        f97622Y = builder50.withProperty(hlr0Var50.m135771b()).build();
        FieldDescriptor.Builder builder51 = FieldDescriptor.builder("remoteConfigLogEvent");
        hlr0 hlr0Var51 = new hlr0();
        hlr0Var51.m135770a(42);
        f97623Z = builder51.withProperty(hlr0Var51.m135771b()).build();
        FieldDescriptor.Builder builder52 = FieldDescriptor.builder("inputImageConstructionLogEvent");
        hlr0 hlr0Var52 = new hlr0();
        hlr0Var52.m135770a(50);
        f97625a0 = builder52.withProperty(hlr0Var52.m135771b()).build();
        FieldDescriptor.Builder builder53 = FieldDescriptor.builder("leakedHandleEvent");
        hlr0 hlr0Var53 = new hlr0();
        hlr0Var53.m135770a(51);
        f97627b0 = builder53.withProperty(hlr0Var53.m135771b()).build();
        FieldDescriptor.Builder builder54 = FieldDescriptor.builder("cameraSourceLogEvent");
        hlr0 hlr0Var54 = new hlr0();
        hlr0Var54.m135770a(52);
        f97629c0 = builder54.withProperty(hlr0Var54.m135771b()).build();
        FieldDescriptor.Builder builder55 = FieldDescriptor.builder("imageLabelOptionalModuleLogEvent");
        hlr0 hlr0Var55 = new hlr0();
        hlr0Var55.m135770a(53);
        f97631d0 = builder55.withProperty(hlr0Var55.m135771b()).build();
        FieldDescriptor.Builder builder56 = FieldDescriptor.builder("languageIdentificationOptionalModuleLogEvent");
        hlr0 hlr0Var56 = new hlr0();
        hlr0Var56.m135770a(54);
        f97633e0 = builder56.withProperty(hlr0Var56.m135771b()).build();
        FieldDescriptor.Builder builder57 = FieldDescriptor.builder("faceDetectionOptionalModuleLogEvent");
        hlr0 hlr0Var57 = new hlr0();
        hlr0Var57.m135770a(60);
        f97635f0 = builder57.withProperty(hlr0Var57.m135771b()).build();
        FieldDescriptor.Builder builder58 = FieldDescriptor.builder("nlClassifierOptionalModuleLogEvent");
        hlr0 hlr0Var58 = new hlr0();
        hlr0Var58.m135770a(55);
        f97637g0 = builder58.withProperty(hlr0Var58.m135771b()).build();
        FieldDescriptor.Builder builder59 = FieldDescriptor.builder("nlClassifierClientLibraryLogEvent");
        hlr0 hlr0Var59 = new hlr0();
        hlr0Var59.m135770a(56);
        f97639h0 = builder59.withProperty(hlr0Var59.m135771b()).build();
        FieldDescriptor.Builder builder60 = FieldDescriptor.builder("accelerationAllowlistLogEvent");
        hlr0 hlr0Var60 = new hlr0();
        hlr0Var60.m135770a(57);
        f97641i0 = builder60.withProperty(hlr0Var60.m135771b()).build();
        FieldDescriptor.Builder builder61 = FieldDescriptor.builder("toxicityDetectionCreateEvent");
        hlr0 hlr0Var61 = new hlr0();
        hlr0Var61.m135770a(62);
        f97643j0 = builder61.withProperty(hlr0Var61.m135771b()).build();
        FieldDescriptor.Builder builder62 = FieldDescriptor.builder("toxicityDetectionLoadEvent");
        hlr0 hlr0Var62 = new hlr0();
        hlr0Var62.m135770a(63);
        f97645k0 = builder62.withProperty(hlr0Var62.m135771b()).build();
        FieldDescriptor.Builder builder63 = FieldDescriptor.builder("toxicityDetectionInferenceEvent");
        hlr0 hlr0Var63 = new hlr0();
        hlr0Var63.m135770a(64);
        f97647l0 = builder63.withProperty(hlr0Var63.m135771b()).build();
        FieldDescriptor.Builder builder64 = FieldDescriptor.builder("barcodeDetectionOptionalModuleLogEvent");
        hlr0 hlr0Var64 = new hlr0();
        hlr0Var64.m135770a(65);
        f97649m0 = builder64.withProperty(hlr0Var64.m135771b()).build();
        FieldDescriptor.Builder builder65 = FieldDescriptor.builder("customImageLabelOptionalModuleLogEvent");
        hlr0 hlr0Var65 = new hlr0();
        hlr0Var65.m135770a(66);
        f97651n0 = builder65.withProperty(hlr0Var65.m135771b()).build();
        FieldDescriptor.Builder builder66 = FieldDescriptor.builder("codeScannerScanApiEvent");
        hlr0 hlr0Var66 = new hlr0();
        hlr0Var66.m135770a(67);
        f97653o0 = builder66.withProperty(hlr0Var66.m135771b()).build();
        FieldDescriptor.Builder builder67 = FieldDescriptor.builder("codeScannerOptionalModuleEvent");
        hlr0 hlr0Var67 = new hlr0();
        hlr0Var67.m135770a(68);
        f97655p0 = builder67.withProperty(hlr0Var67.m135771b()).build();
        FieldDescriptor.Builder builder68 = FieldDescriptor.builder("onDeviceExplicitContentCreateLogEvent");
        hlr0 hlr0Var68 = new hlr0();
        hlr0Var68.m135770a(70);
        f97657q0 = builder68.withProperty(hlr0Var68.m135771b()).build();
        FieldDescriptor.Builder builder69 = FieldDescriptor.builder("onDeviceExplicitContentLoadLogEvent");
        hlr0 hlr0Var69 = new hlr0();
        hlr0Var69.m135770a(71);
        f97659r0 = builder69.withProperty(hlr0Var69.m135771b()).build();
        FieldDescriptor.Builder builder70 = FieldDescriptor.builder("onDeviceExplicitContentInferenceLogEvent");
        hlr0 hlr0Var70 = new hlr0();
        hlr0Var70.m135770a(72);
        f97661s0 = builder70.withProperty(hlr0Var70.m135771b()).build();
        FieldDescriptor.Builder builder71 = FieldDescriptor.builder("aggregatedOnDeviceExplicitContentLogEvent");
        hlr0 hlr0Var71 = new hlr0();
        hlr0Var71.m135770a(73);
        f97663t0 = builder71.withProperty(hlr0Var71.m135771b()).build();
        FieldDescriptor.Builder builder72 = FieldDescriptor.builder("onDeviceSelfieFaceCreateLogEvent");
        hlr0 hlr0Var72 = new hlr0();
        hlr0Var72.m135770a(74);
        f97665u0 = builder72.withProperty(hlr0Var72.m135771b()).build();
        FieldDescriptor.Builder builder73 = FieldDescriptor.builder("onDeviceSelfieFaceLoadLogEvent");
        hlr0 hlr0Var73 = new hlr0();
        hlr0Var73.m135770a(75);
        f97667v0 = builder73.withProperty(hlr0Var73.m135771b()).build();
        FieldDescriptor.Builder builder74 = FieldDescriptor.builder("onDeviceSelfieFaceLogEvent");
        hlr0 hlr0Var74 = new hlr0();
        hlr0Var74.m135770a(76);
        f97669w0 = builder74.withProperty(hlr0Var74.m135771b()).build();
        FieldDescriptor.Builder builder75 = FieldDescriptor.builder("aggregatedOnDeviceSelfieFaceLogEvent");
        hlr0 hlr0Var75 = new hlr0();
        hlr0Var75.m135770a(77);
        f97671x0 = builder75.withProperty(hlr0Var75.m135771b()).build();
        FieldDescriptor.Builder builder76 = FieldDescriptor.builder("smartReplyOptionalModuleLogEvent");
        hlr0 hlr0Var76 = new hlr0();
        hlr0Var76.m135770a(78);
        f97673y0 = builder76.withProperty(hlr0Var76.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        cux0 cux0Var = (cux0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f97626b, cux0Var.m112729d());
        objectEncoderContext2.add(f97628c, cux0Var.m112727b());
        objectEncoderContext2.add(f97630d, (Object) null);
        objectEncoderContext2.add(f97632e, cux0Var.m112726a());
        objectEncoderContext2.add(f97634f, (Object) null);
        objectEncoderContext2.add(f97636g, (Object) null);
        objectEncoderContext2.add(f97638h, (Object) null);
        objectEncoderContext2.add(f97640i, (Object) null);
        objectEncoderContext2.add(f97642j, (Object) null);
        objectEncoderContext2.add(f97644k, (Object) null);
        objectEncoderContext2.add(f97646l, (Object) null);
        objectEncoderContext2.add(f97648m, (Object) null);
        objectEncoderContext2.add(f97650n, (Object) null);
        objectEncoderContext2.add(f97652o, (Object) null);
        objectEncoderContext2.add(f97654p, (Object) null);
        objectEncoderContext2.add(f97656q, (Object) null);
        objectEncoderContext2.add(f97658r, (Object) null);
        objectEncoderContext2.add(f97660s, (Object) null);
        objectEncoderContext2.add(f97662t, (Object) null);
        objectEncoderContext2.add(f97664u, (Object) null);
        objectEncoderContext2.add(f97666v, (Object) null);
        objectEncoderContext2.add(f97668w, (Object) null);
        objectEncoderContext2.add(f97670x, (Object) null);
        objectEncoderContext2.add(f97672y, cux0Var.m112728c());
        objectEncoderContext2.add(f97674z, (Object) null);
        objectEncoderContext2.add(f97598A, (Object) null);
        objectEncoderContext2.add(f97599B, (Object) null);
        objectEncoderContext2.add(f97600C, (Object) null);
        objectEncoderContext2.add(f97601D, (Object) null);
        objectEncoderContext2.add(f97602E, (Object) null);
        objectEncoderContext2.add(f97603F, (Object) null);
        objectEncoderContext2.add(f97604G, (Object) null);
        objectEncoderContext2.add(f97605H, (Object) null);
        objectEncoderContext2.add(f97606I, (Object) null);
        objectEncoderContext2.add(f97607J, (Object) null);
        objectEncoderContext2.add(f97608K, (Object) null);
        objectEncoderContext2.add(f97609L, (Object) null);
        objectEncoderContext2.add(f97610M, (Object) null);
        objectEncoderContext2.add(f97611N, (Object) null);
        objectEncoderContext2.add(f97612O, (Object) null);
        objectEncoderContext2.add(f97613P, (Object) null);
        objectEncoderContext2.add(f97614Q, (Object) null);
        objectEncoderContext2.add(f97615R, (Object) null);
        objectEncoderContext2.add(f97616S, (Object) null);
        objectEncoderContext2.add(f97617T, (Object) null);
        objectEncoderContext2.add(f97618U, (Object) null);
        objectEncoderContext2.add(f97619V, (Object) null);
        objectEncoderContext2.add(f97620W, (Object) null);
        objectEncoderContext2.add(f97621X, (Object) null);
        objectEncoderContext2.add(f97622Y, (Object) null);
        objectEncoderContext2.add(f97623Z, (Object) null);
        objectEncoderContext2.add(f97625a0, (Object) null);
        objectEncoderContext2.add(f97627b0, (Object) null);
        objectEncoderContext2.add(f97629c0, (Object) null);
        objectEncoderContext2.add(f97631d0, (Object) null);
        objectEncoderContext2.add(f97633e0, (Object) null);
        objectEncoderContext2.add(f97635f0, (Object) null);
        objectEncoderContext2.add(f97637g0, (Object) null);
        objectEncoderContext2.add(f97639h0, (Object) null);
        objectEncoderContext2.add(f97641i0, (Object) null);
        objectEncoderContext2.add(f97643j0, (Object) null);
        objectEncoderContext2.add(f97645k0, (Object) null);
        objectEncoderContext2.add(f97647l0, (Object) null);
        objectEncoderContext2.add(f97649m0, (Object) null);
        objectEncoderContext2.add(f97651n0, (Object) null);
        objectEncoderContext2.add(f97653o0, (Object) null);
        objectEncoderContext2.add(f97655p0, (Object) null);
        objectEncoderContext2.add(f97657q0, (Object) null);
        objectEncoderContext2.add(f97659r0, (Object) null);
        objectEncoderContext2.add(f97661s0, (Object) null);
        objectEncoderContext2.add(f97663t0, (Object) null);
        objectEncoderContext2.add(f97665u0, (Object) null);
        objectEncoderContext2.add(f97667v0, (Object) null);
        objectEncoderContext2.add(f97669w0, (Object) null);
        objectEncoderContext2.add(f97671x0, (Object) null);
        objectEncoderContext2.add(f97673y0, (Object) null);
    }
}
