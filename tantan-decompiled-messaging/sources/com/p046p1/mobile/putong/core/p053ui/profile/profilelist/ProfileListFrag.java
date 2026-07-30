package com.p046p1.mobile.putong.core.p053ui.profile.profilelist;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.GreetingPermission;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RiskOtherData;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p046p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p046p1.mobile.putong.core.p053ui.FloatShadowButton;
import com.p046p1.mobile.putong.core.p053ui.GradientBgWithShadowButton;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.profile.EditProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.ParallaxView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct_CustomTransition;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.ProfileCreateData;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.report.C8829f;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.core.p053ui.vip.greet.ProfileSendContainerView;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.core.util.DebugUtil;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.Contact;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.PicVerification;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.SwipeExtraScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialOperation;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.joor.Reflect;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.CoverGuideView;
import p147v.SimpleCoverGuideView;
import p147v.VButton;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VProgressBar;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.a1m;
import p149l.aoa0;
import p149l.ark;
import p149l.bk90;
import p149l.boa0;
import p149l.bq90;
import p149l.bt0;
import p149l.c40;
import p149l.cll0;
import p149l.cme;
import p149l.cne;
import p149l.cp60;
import p149l.cqa0;
import p149l.cua0;
import p149l.cwf0;
import p149l.d30;
import p149l.d5m;
import p149l.dj90;
import p149l.dle;
import p149l.dna0;
import p149l.e30;
import p149l.e51;
import p149l.epa0;
import p149l.ezc0;
import p149l.f30;
import p149l.f5a0;
import p149l.f6c0;
import p149l.f9j;
import p149l.f9k0;
import p149l.fap;
import p149l.fj90;
import p149l.fna0;
import p149l.fr90;
import p149l.ft4;
import p149l.g30;
import p149l.g5a0;
import p149l.gd70;
import p149l.gne;
import p149l.goe;
import p149l.grk;
import p149l.gta0;
import p149l.gwp;
import p149l.h7c0;
import p149l.h7n;
import p149l.hn2;
import p149l.hpd0;
import p149l.hra0;
import p149l.i0e;
import p149l.i0g0;
import p149l.ick0;
import p149l.ie90;
import p149l.ih90;
import p149l.iqa0;
import p149l.ir90;
import p149l.iua0;
import p149l.j4p;
import p149l.j760;
import p149l.jg90;
import p149l.jjb0;
import p149l.jle;
import p149l.jo0;
import p149l.jpa0;
import p149l.jta0;
import p149l.kea0;
import p149l.koa0;
import p149l.kr90;
import p149l.l33;
import p149l.l9a0;
import p149l.l9b;
import p149l.loe;
import p149l.lra0;
import p149l.ls90;
import p149l.lsi0;
import p149l.mb90;
import p149l.mcr;
import p149l.mi90;
import p149l.mkd0;
import p149l.mm90;
import p149l.mqa0;
import p149l.mqi0;
import p149l.mt90;
import p149l.myc0;
import p149l.n3b0;
import p149l.ne90;
import p149l.nkp;
import p149l.nmn;
import p149l.o660;
import p149l.o6j0;
import p149l.o7r;
import p149l.och0;
import p149l.ogl0;
import p149l.ok3;
import p149l.osi0;
import p149l.ota0;
import p149l.p420;
import p149l.p660;
import p149l.pqa0;
import p149l.qer;
import p149l.qib0;
import p149l.qp8;
import p149l.r4w;
import p149l.r65;
import p149l.rlt;
import p149l.roj0;
import p149l.rqa0;
import p149l.rxg0;
import p149l.rzb0;
import p149l.sb90;
import p149l.swh0;
import p149l.t100;
import p149l.t7c0;
import p149l.tke;
import p149l.tkp;
import p149l.tme;
import p149l.toa0;
import p149l.tpd0;
import p149l.tqa0;
import p149l.ttn;
import p149l.tvf;
import p149l.u2a0;
import p149l.u4c0;
import p149l.u59;
import p149l.uc80;
import p149l.uf90;
import p149l.upa;
import p149l.uqd0;
import p149l.uta0;
import p149l.v9j;
import p149l.vdj;
import p149l.vwb;
import p149l.w0c0;
import p149l.w85;
import p149l.w9a0;
import p149l.w9j;
import p149l.wc80;
import p149l.wg90;
import p149l.wge0;
import p149l.wn90;
import p149l.woa0;
import p149l.wq90;
import p149l.wqa0;
import p149l.wsh;
import p149l.x0m;
import p149l.x2c0;
import p149l.x9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xh0;
import p149l.xma;
import p149l.xne;
import p149l.ya5;
import p149l.yij0;
import p149l.yj90;
import p149l.yqa0;
import p149l.yz9;
import p149l.zl90;
import p149l.zp90;
import p149l.zpd0;
import p149l.zva0;
import p149l.zvf0;
import p149l.zzc0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListFrag extends AutoReleaseVideoFrag implements View.OnClickListener, x0m {

    /* JADX INFO: renamed from: G4 */
    public static cwf0 f33608G4 = new cwf0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: H4 */
    public static Field f33609H4 = Reflect.m221135on((Class<?>) Toolbar.class).field0("mMenuView");

    /* JADX INFO: renamed from: I4 */
    public static CategorySuggestions f33610I4;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f33611A;

    /* JADX INFO: renamed from: A1 */
    public VLinear f33612A1;

    /* JADX INFO: renamed from: A3 */
    public View f33614A3;

    /* JADX INFO: renamed from: A4 */
    public boolean f33615A4;

    /* JADX INFO: renamed from: B */
    public View f33616B;

    /* JADX INFO: renamed from: B4 */
    public boolean f33620B4;

    /* JADX INFO: renamed from: C */
    public TabLayout f33621C;

    /* JADX INFO: renamed from: C3 */
    public int f33624C3;

    /* JADX INFO: renamed from: C4 */
    public final hra0 f33625C4;

    /* JADX INFO: renamed from: D */
    public VFrame f33626D;

    /* JADX INFO: renamed from: D3 */
    public boolean f33629D3;

    /* JADX INFO: renamed from: D4 */
    public d30 f33630D4;

    /* JADX INFO: renamed from: E */
    public VProgressBar f33631E;

    /* JADX INFO: renamed from: E0 */
    public VFrame_Shadow f33632E0;

    /* JADX INFO: renamed from: E3 */
    public ProfileCreateData f33635E3;

    /* JADX INFO: renamed from: E4 */
    public HashMap<View, View> f33636E4;

    /* JADX INFO: renamed from: F */
    public VFrame f33637F;

    /* JADX INFO: renamed from: F0 */
    public VFrame_FlipContainer f33638F0;

    /* JADX INFO: renamed from: F4 */
    public Set<String> f33642F4;

    /* JADX INFO: renamed from: G */
    public VProgressBar f33643G;

    /* JADX INFO: renamed from: G0 */
    public VImage f33644G0;

    /* JADX INFO: renamed from: G3 */
    public LikedUser f33647G3;

    /* JADX INFO: renamed from: H */
    public ParallaxView f33648H;

    /* JADX INFO: renamed from: H0 */
    public VText f33649H0;

    /* JADX INFO: renamed from: H3 */
    public LikeUser f33652H3;

    /* JADX INFO: renamed from: I */
    public VLinear f33653I;

    /* JADX INFO: renamed from: I0 */
    public VLinear f33654I0;

    /* JADX INFO: renamed from: I3 */
    public User f33657I3;

    /* JADX INFO: renamed from: J */
    public FrameLayout f33658J;

    /* JADX INFO: renamed from: J0 */
    public VFrame_FlipContainer f33659J0;

    /* JADX INFO: renamed from: K */
    public CardView f33663K;

    /* JADX INFO: renamed from: K0 */
    public VImage f33664K0;

    /* JADX INFO: renamed from: L */
    public CardView f33668L;

    /* JADX INFO: renamed from: L0 */
    public FrameLayout f33669L0;

    /* JADX INFO: renamed from: M */
    public CardView f33673M;

    /* JADX INFO: renamed from: M0 */
    public GradientBgWithShadowButton f33674M0;

    /* JADX INFO: renamed from: N */
    public RoundedRectangleProgressView f33678N;

    /* JADX INFO: renamed from: N0 */
    public VFrame_Shadow f33679N0;

    /* JADX INFO: renamed from: N1 */
    public d5m f33680N1;

    /* JADX INFO: renamed from: O */
    public RoundedRectangleProgressView f33683O;

    /* JADX INFO: renamed from: O0 */
    public VFrame_Shadow f33684O0;

    /* JADX INFO: renamed from: P */
    public VImage f33688P;

    /* JADX INFO: renamed from: P0 */
    public RelativeLayout f33689P0;

    /* JADX INFO: renamed from: P3 */
    public String f33692P3;

    /* JADX INFO: renamed from: Q */
    public VImage f33693Q;

    /* JADX INFO: renamed from: Q0 */
    public RelativeLayout f33694Q0;

    /* JADX INFO: renamed from: R */
    public VText f33698R;

    /* JADX INFO: renamed from: R0 */
    public VLinear f33699R0;

    /* JADX INFO: renamed from: S */
    public VText f33703S;

    /* JADX INFO: renamed from: S0 */
    public VButton f33704S0;

    /* JADX INFO: renamed from: S3 */
    public CityCData f33707S3;

    /* JADX INFO: renamed from: T */
    public ViewStub f33708T;

    /* JADX INFO: renamed from: T0 */
    public VButton f33709T0;

    /* JADX INFO: renamed from: U */
    public ViewStub f33713U;

    /* JADX INFO: renamed from: U0 */
    public ConstraintLayout f33714U0;

    /* JADX INFO: renamed from: V */
    public RecyclerView f33718V;

    /* JADX INFO: renamed from: V0 */
    public FrameLayout f33719V0;

    /* JADX INFO: renamed from: W */
    public FloatShadowButton f33723W;

    /* JADX INFO: renamed from: W0 */
    public View f33724W0;

    /* JADX INFO: renamed from: W3 */
    public View f33727W3;

    /* JADX INFO: renamed from: X */
    public View f33728X;

    /* JADX INFO: renamed from: X0 */
    public VEditText f33729X0;

    /* JADX INFO: renamed from: X1 */
    public j760<Integer, Integer> f33730X1;

    /* JADX INFO: renamed from: X3 */
    public View f33732X3;

    /* JADX INFO: renamed from: Y */
    public RelativeLayout f33733Y;

    /* JADX INFO: renamed from: Y0 */
    public VText f33734Y0;

    /* JADX INFO: renamed from: Y1 */
    public c40 f33735Y1;

    /* JADX INFO: renamed from: Y3 */
    public ViewTreeObserver.OnGlobalLayoutListener f33737Y3;

    /* JADX INFO: renamed from: Z */
    public VFrame_Shadow f33738Z;

    /* JADX INFO: renamed from: Z0 */
    public FrameLayout f33739Z0;

    /* JADX INFO: renamed from: Z1 */
    public SimpleCoverGuideView f33740Z1;

    /* JADX INFO: renamed from: Z3 */
    public boolean f33742Z3;

    /* JADX INFO: renamed from: a1 */
    public View f33743a1;

    /* JADX INFO: renamed from: a2 */
    public CoverGuideView f33744a2;

    /* JADX INFO: renamed from: a4 */
    public boolean f33746a4;

    /* JADX INFO: renamed from: b1 */
    public TextView f33747b1;

    /* JADX INFO: renamed from: b2 */
    public LinearLayoutManager f33748b2;

    /* JADX INFO: renamed from: b4 */
    public xh0 f33750b4;

    /* JADX INFO: renamed from: c1 */
    public ProfileSendContainerView f33751c1;

    /* JADX INFO: renamed from: c4 */
    public User f33754c4;

    /* JADX INFO: renamed from: d1 */
    public VFrame_Shadow f33755d1;

    /* JADX INFO: renamed from: d4 */
    public final C22392a<roj0> f33758d4;

    /* JADX INFO: renamed from: e1 */
    public RelativeLayout f33759e1;

    /* JADX INFO: renamed from: e4 */
    public boolean f33762e4;

    /* JADX INFO: renamed from: f1 */
    public SuperLikeComboAnimView f33763f1;

    /* JADX INFO: renamed from: f4 */
    public boolean f33766f4;

    /* JADX INFO: renamed from: g1 */
    public TextView f33767g1;

    /* JADX INFO: renamed from: g4 */
    public int f33770g4;

    /* JADX INFO: renamed from: h1 */
    public VFrame_Shadow f33771h1;

    /* JADX INFO: renamed from: h4 */
    public final RecyclerView.AbstractC0582t f33774h4;

    /* JADX INFO: renamed from: i1 */
    public RelativeLayout f33775i1;

    /* JADX INFO: renamed from: i4 */
    public String f33778i4;

    /* JADX INFO: renamed from: j1 */
    public VImage f33779j1;

    /* JADX INFO: renamed from: j2 */
    public User f33780j2;

    /* JADX INFO: renamed from: j4 */
    public final List<hn2<?>> f33782j4;

    /* JADX INFO: renamed from: k0 */
    public RelativeLayout f33783k0;

    /* JADX INFO: renamed from: k1 */
    public VLinear f33784k1;

    /* JADX INFO: renamed from: k2 */
    public User f33785k2;

    /* JADX INFO: renamed from: k3 */
    public ValueAnimator f33786k3;

    /* JADX INFO: renamed from: k4 */
    public cme f33787k4;

    /* JADX INFO: renamed from: l1 */
    public VFrame_Shadow f33788l1;

    /* JADX INFO: renamed from: l4 */
    public dna0 f33791l4;

    /* JADX INFO: renamed from: m1 */
    public VFrame_Shadow f33792m1;

    /* JADX INFO: renamed from: m3 */
    public String f33794m3;

    /* JADX INFO: renamed from: m4 */
    public dle f33795m4;

    /* JADX INFO: renamed from: n1 */
    public VRelative f33796n1;

    /* JADX INFO: renamed from: n2 */
    public j760<List<Literatures>, List<LiteraturesComments>> f33797n2;

    /* JADX INFO: renamed from: n3 */
    public boolean f33798n3;

    /* JADX INFO: renamed from: n4 */
    public gne f33799n4;

    /* JADX INFO: renamed from: o1 */
    public View f33800o1;

    /* JADX INFO: renamed from: o2 */
    public Animator f33801o2;

    /* JADX INFO: renamed from: o4 */
    public tke f33803o4;

    /* JADX INFO: renamed from: p0 */
    public VText f33804p0;

    /* JADX INFO: renamed from: p1 */
    public View f33805p1;

    /* JADX INFO: renamed from: p4 */
    public tme f33808p4;

    /* JADX INFO: renamed from: q1 */
    public ProfileCustomBar f33809q1;

    /* JADX INFO: renamed from: q4 */
    public loe f33812q4;

    /* JADX INFO: renamed from: r1 */
    public View f33813r1;

    /* JADX INFO: renamed from: r4 */
    public cne f33816r4;

    /* JADX INFO: renamed from: s1 */
    public VFrame f33817s1;

    /* JADX INFO: renamed from: s4 */
    public goe f33820s4;

    /* JADX INFO: renamed from: t1 */
    public LinearLayout f33821t1;

    /* JADX INFO: renamed from: t2 */
    public Media f33822t2;

    /* JADX INFO: renamed from: t3 */
    public String f33823t3;

    /* JADX INFO: renamed from: t4 */
    public pqa0 f33824t4;

    /* JADX INFO: renamed from: u1 */
    public VText f33825u1;

    /* JADX INFO: renamed from: u4 */
    public jle f33828u4;

    /* JADX INFO: renamed from: v1 */
    public VLinear f33829v1;

    /* JADX INFO: renamed from: v2 */
    public boolean f33830v2;

    /* JADX INFO: renamed from: v4 */
    public cqa0 f33832v4;

    /* JADX INFO: renamed from: w1 */
    public VLinear f33833w1;

    /* JADX INFO: renamed from: w2 */
    public boolean f33834w2;

    /* JADX INFO: renamed from: w4 */
    public fna0 f33836w4;

    /* JADX INFO: renamed from: x1 */
    public VLinear f33837x1;

    /* JADX INFO: renamed from: x2 */
    public PicCertGuideView f33838x2;

    /* JADX INFO: renamed from: x4 */
    public l33 f33840x4;

    /* JADX INFO: renamed from: y1 */
    public VLinear f33841y1;

    /* JADX INFO: renamed from: y4 */
    public boolean f33844y4;

    /* JADX INFO: renamed from: z */
    public VFrame f33845z;

    /* JADX INFO: renamed from: z1 */
    public VImage f33846z1;

    /* JADX INFO: renamed from: z2 */
    public dj90 f33847z2;

    /* JADX INFO: renamed from: z4 */
    public int f33849z4;

    /* JADX INFO: renamed from: B1 */
    public boolean f33617B1 = true;

    /* JADX INFO: renamed from: C1 */
    public final boolean f33622C1 = false;

    /* JADX INFO: renamed from: D1 */
    public tpd0 f33627D1 = new tpd0("show_share_tip_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: E1 */
    public tpd0 f33633E1 = new tpd0("show_share_today_tip_count" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: F1 */
    public uqd0 f33639F1 = new uqd0("show_share_tip_data_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: G1 */
    public tpd0 f33645G1 = new tpd0("show_share_tip_user_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: H1 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f33650H1 = new tpd0("show_pic_post_dialog_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: I1 */
    public zpd0 f33655I1 = new zpd0("last_auto_call_video_chat_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: J1 */
    public hpd0 f33660J1 = new hpd0("is_show_shimmer" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: K1 */
    public final boolean f33665K1 = m94571s();

    /* JADX INFO: renamed from: L1 */
    public final boolean f33670L1 = false;

    /* JADX INFO: renamed from: M1 */
    public boolean f33675M1 = false;

    /* JADX INFO: renamed from: O1 */
    public final C22392a<User> f33685O1 = C22392a.m221512b();

    /* JADX INFO: renamed from: P1 */
    public User f33690P1 = null;

    /* JADX INFO: renamed from: Q1 */
    public int f33695Q1 = 0;

    /* JADX INFO: renamed from: R1 */
    public int f33700R1 = -1;

    /* JADX INFO: renamed from: S1 */
    public int f33705S1 = -1;

    /* JADX INFO: renamed from: T1 */
    public boolean f33710T1 = false;

    /* JADX INFO: renamed from: U1 */
    public boolean f33715U1 = false;

    /* JADX INFO: renamed from: V1 */
    public boolean f33720V1 = false;

    /* JADX INFO: renamed from: W1 */
    public boolean f33725W1 = false;

    /* JADX INFO: renamed from: c2 */
    public boolean f33752c2 = false;

    /* JADX INFO: renamed from: d2 */
    public boolean f33756d2 = false;

    /* JADX INFO: renamed from: e2 */
    public boolean f33760e2 = false;

    /* JADX INFO: renamed from: f2 */
    public boolean f33764f2 = false;

    /* JADX INFO: renamed from: g2 */
    public boolean f33768g2 = false;

    /* JADX INFO: renamed from: h2 */
    public int f33772h2 = 0;

    /* JADX INFO: renamed from: i2 */
    public boolean f33776i2 = false;

    /* JADX INFO: renamed from: l2 */
    public boolean f33789l2 = false;

    /* JADX INFO: renamed from: m2 */
    public final C22392a<roj0> f33793m2 = C22392a.m221512b();

    /* JADX INFO: renamed from: p2 */
    public boolean f33806p2 = false;

    /* JADX INFO: renamed from: q2 */
    public long f33810q2 = 0;

    /* JADX INFO: renamed from: r2 */
    public HashMap<String, String> f33814r2 = new HashMap<>();

    /* JADX INFO: renamed from: s2 */
    public boolean f33818s2 = false;

    /* JADX INFO: renamed from: u2 */
    public boolean f33826u2 = false;

    /* JADX INFO: renamed from: y2 */
    public dj90 f33842y2 = new dj90(this, this);

    /* JADX INFO: renamed from: A2 */
    public fj90 f33613A2 = new fj90(this, this);

    /* JADX INFO: renamed from: B2 */
    public ProfileImagesItemHolder f33618B2 = new ProfileImagesItemHolder(this, this);

    /* JADX INFO: renamed from: C2 */
    public ne90 f33623C2 = new ne90(this, this);

    /* JADX INFO: renamed from: D2 */
    public jg90 f33628D2 = new wg90(this, this);

    /* JADX INFO: renamed from: E2 */
    public woa0 f33634E2 = new woa0(this, this);

    /* JADX INFO: renamed from: F2 */
    public aoa0 f33640F2 = new mqa0(this, this);

    /* JADX INFO: renamed from: G2 */
    public jpa0 f33646G2 = new jpa0(this, this);

    /* JADX INFO: renamed from: H2 */
    public mi90 f33651H2 = new mi90(this, this);

    /* JADX INFO: renamed from: I2 */
    public kr90 f33656I2 = new kr90(this, this);

    /* JADX INFO: renamed from: J2 */
    public ie90 f33661J2 = new ie90(this, this);

    /* JADX INFO: renamed from: K2 */
    public toa0 f33666K2 = new toa0(this, this);

    /* JADX INFO: renamed from: L2 */
    public yj90 f33671L2 = new yj90(this, this);

    /* JADX INFO: renamed from: M2 */
    public xne f33676M2 = new xne(this, this);

    /* JADX INFO: renamed from: N2 */
    public koa0 f33681N2 = new koa0(this, this);

    /* JADX INFO: renamed from: O2 */
    public zp90 f33686O2 = new bq90(this, this);

    /* JADX INFO: renamed from: P2 */
    public ir90 f33691P2 = new ir90(this, this);

    /* JADX INFO: renamed from: Q2 */
    public uf90 f33696Q2 = new uf90(this, this);

    /* JADX INFO: renamed from: R2 */
    public cua0 f33701R2 = new uta0(this, this);

    /* JADX INFO: renamed from: S2 */
    public wq90 f33706S2 = new fr90(this, this);

    /* JADX INFO: renamed from: T2 */
    public wqa0 f33711T2 = new yqa0(this, this);

    /* JADX INFO: renamed from: U2 */
    public pqa0 f33716U2 = new rqa0(this, this);

    /* JADX INFO: renamed from: V2 */
    public kea0 f33721V2 = new kea0(this, this);

    /* JADX INFO: renamed from: W2 */
    public ls90 f33726W2 = new ls90(this, this);

    /* JADX INFO: renamed from: X2 */
    public ProfileReportItemHolder f33731X2 = new ProfileReportItemHolder(this, this);

    /* JADX INFO: renamed from: Y2 */
    public gta0 f33736Y2 = new gta0(this, this);

    /* JADX INFO: renamed from: Z2 */
    public tqa0 f33741Z2 = new tqa0(this, this);

    /* JADX INFO: renamed from: a3 */
    public zl90 f33745a3 = new zl90(this, this);

    /* JADX INFO: renamed from: b3 */
    public jta0 f33749b3 = new jta0(this, this);

    /* JADX INFO: renamed from: c3 */
    public ota0 f33753c3 = new ota0(this, this);

    /* JADX INFO: renamed from: d3 */
    public iqa0 f33757d3 = new iqa0(this, this);

    /* JADX INFO: renamed from: e3 */
    public bk90 f33761e3 = new bk90(this, this);

    /* JADX INFO: renamed from: f3 */
    public iua0 f33765f3 = new iua0(this, this);

    /* JADX INFO: renamed from: g3 */
    public zva0 f33769g3 = new zva0(this, this);

    /* JADX INFO: renamed from: h3 */
    public boa0 f33773h3 = new boa0(this, this);

    /* JADX INFO: renamed from: i3 */
    public mt90 f33777i3 = new mt90();

    /* JADX INFO: renamed from: j3 */
    public boolean f33781j3 = false;

    /* JADX INFO: renamed from: l3 */
    public boolean f33790l3 = false;

    /* JADX INFO: renamed from: o3 */
    public boolean f33802o3 = false;

    /* JADX INFO: renamed from: p3 */
    public String f33807p3 = "";

    /* JADX INFO: renamed from: q3 */
    public boolean f33811q3 = false;

    /* JADX INFO: renamed from: r3 */
    public boolean f33815r3 = false;

    /* JADX INFO: renamed from: s3 */
    public boolean f33819s3 = true;

    /* JADX INFO: renamed from: u3 */
    public boolean f33827u3 = false;

    /* JADX INFO: renamed from: v3 */
    public boolean f33831v3 = false;

    /* JADX INFO: renamed from: w3 */
    public boolean f33835w3 = false;

    /* JADX INFO: renamed from: x3 */
    public int f33839x3 = 0;

    /* JADX INFO: renamed from: y3 */
    public String f33843y3 = "";

    /* JADX INFO: renamed from: z3 */
    public String f33848z3 = "";

    /* JADX INFO: renamed from: B3 */
    public RelationshipStatus f33619B3 = RelationshipStatus.get("unknown_");

    /* JADX INFO: renamed from: F3 */
    public boolean f33641F3 = false;

    /* JADX INFO: renamed from: J3 */
    public int f33662J3 = -1;

    /* JADX INFO: renamed from: K3 */
    public final ArrayList<View> f33667K3 = new ArrayList<>();

    /* JADX INFO: renamed from: L3 */
    public final ArrayList<TextView> f33672L3 = new ArrayList<>();

    /* JADX INFO: renamed from: M3 */
    public final ArrayList<View> f33677M3 = new ArrayList<>();

    /* JADX INFO: renamed from: N3 */
    public final ArrayList<View> f33682N3 = new ArrayList<>();

    /* JADX INFO: renamed from: O3 */
    public int f33687O3 = 4;

    /* JADX INFO: renamed from: Q3 */
    public int f33697Q3 = (xdl0.m208412y0() - t100.m186890d(60.0f)) / 2;

    /* JADX INFO: renamed from: R3 */
    public boolean f33702R3 = false;

    /* JADX INFO: renamed from: T3 */
    public NewNewProfileCard.InterfaceC7863d f33712T3 = new C8701i();

    /* JADX INFO: renamed from: U3 */
    public d30 f33717U3 = new C8702j();

    /* JADX INFO: renamed from: V3 */
    public List<e30<d5m>> f33722V3 = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$6 */
    public class ResultReceiverC86926 extends ResultReceiver {
        final /* synthetic */ boolean val$matched;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultReceiverC86926(Handler handler, boolean z) {
            super(handler);
            this.val$matched = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m52380b() {
            ProfileListFrag.this.act().setResult(SwipeDirection.LEFT.getValue());
            ProfileListFrag.this.act().m66873d2();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (i != -1 || this.val$matched) {
                return;
            }
            ProfileListFrag.this.m20592l4(new Runnable() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33863a.m52380b();
                }
            });
        }
    }

    public class ProfileEditInfoException extends RuntimeException {
        public ProfileEditInfoException() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$a */
    public class C8693a implements VFrame_Shadow.InterfaceC22542a {
        public C8693a() {
        }

        @Override // p147v.VFrame_Shadow.InterfaceC22542a
        /* JADX INFO: renamed from: a */
        public void mo52381a() {
            boolean zIsFemale = false;
            ((ViewGroup) ProfileListFrag.this.mo51066J1().act().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
            boolean zEquals = TextUtils.equals(ProfileListFrag.this.f33780j2.f56011id, rxg0.m181572j().f161468m);
            xdl0.m208345M0(ProfileListFrag.this.f33763f1, true);
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            SuperLikeComboAnimView superLikeComboAnimView = profileListFrag.f33763f1;
            boolean zM81303a = NullChecker.m81303a(profileListFrag.f33780j2);
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (zM81303a) {
                zIsFemale = profileListFrag2.f33780j2.isFemale();
            } else if (NullChecker.m81303a(profileListFrag2.f33785k2) && !ProfileListFrag.this.f33785k2.isFemale()) {
                zIsFemale = true;
            }
            superLikeComboAnimView.m55788r(zEquals, true, zIsFemale);
        }

        @Override // p147v.VFrame_Shadow.InterfaceC22542a
        /* JADX INFO: renamed from: b */
        public void mo52382b() {
            ((ViewGroup) ProfileListFrag.this.mo51066J1().act().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.m208345M0(ProfileListFrag.this.f33763f1, false);
            wge0.m203034f().m203036c(ProfileListFrag.this.f33780j2.f56011id, ProfileListFrag.this.f33763f1.m55791u(), false, OMSDialogPositon.p_suggest_user_profile_info_view);
            ProfileListFrag.this.m52271id();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$b */
    public class C8694b extends RecyclerView.AbstractC0582t {
        public C8694b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFrag.this.m52015rd();
            ProfileListFrag.this.m52333sd(recyclerView.canScrollVertically(-1));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$c */
    public class C8695c extends RecyclerView.AbstractC0582t {
        public C8695c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFrag.this.f33770g4 += i2;
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            if (!profileListFrag.f33802o3) {
                profileListFrag.f33618B2.m52810S1(profileListFrag.f33770g4);
            }
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (profileListFrag2.f33802o3 || !NullChecker.m81303a(profileListFrag2.f33618B2.f34059u)) {
                return;
            }
            if (i2 == 0 && ProfileListFrag.this.f33770g4 == 0) {
                ProfileListFrag.this.m52284l9();
            }
            if (i2 != 0) {
                ProfileListFrag profileListFrag3 = ProfileListFrag.this;
                profileListFrag3.f33723W.setTranslationY((-profileListFrag3.f33770g4) + ProfileListFrag.this.f33772h2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$d */
    public class C8696d implements e30<Throwable> {
        public C8696d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.m81303a(CoreModule.m29932K().getUserById(ProfileListFrag.this.f33794m3)) && !CoreModule.m29932K().getUserById(ProfileListFrag.this.f33794m3).unilateralBlock()) {
                CoreModule.f17545c.f19639e0.m169374Ba(ProfileListFrag.this.f33794m3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$e */
    public class C8697e implements e30<C4319c> {
        public C8697e() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C4319c c4319c) {
            if (c4319c != C4319c.f15548i) {
                if (c4319c == C4319c.f15550k) {
                    ProfileListFrag.this.m52240d9();
                }
            } else {
                ProfileListFrag profileListFrag = ProfileListFrag.this;
                if (profileListFrag.f33780j2 == null) {
                    profileListFrag.f33718V.setVisibility(4);
                    ProfileListFrag.this.f33648H.setVisibility(4);
                    ProfileListFrag.this.f33643G.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$f */
    public class C8698f extends pqa0 {
        public C8698f(a1m a1mVar, mcr mcrVar) {
            super(a1mVar, mcrVar);
        }

        @Override // p149l.hn2
        /* JADX INFO: renamed from: k */
        public boolean mo52385k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$g */
    public class C8699g extends C0608n {
        public C8699g(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$h */
    public class C8700h implements d30 {
        public C8700h() {
        }

        @Override // p149l.d30
        public void call() {
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            xdl0.m208344M(profileListFrag.f33784k1, xdl0.m208349O0(profileListFrag.f33788l1) || xdl0.m208349O0(ProfileListFrag.this.f33792m1));
            if (xdl0.m208349O0(ProfileListFrag.this.f33788l1) && xdl0.m208349O0(ProfileListFrag.this.f33792m1)) {
                xdl0.m208327D0(ProfileListFrag.this.f33697Q3, ProfileListFrag.this.f33788l1);
                xdl0.m208327D0(ProfileListFrag.this.f33697Q3, ProfileListFrag.this.f33792m1);
                ProfileListFrag profileListFrag2 = ProfileListFrag.this;
                profileListFrag2.m52048A8(profileListFrag2.f33788l1);
                ProfileListFrag profileListFrag3 = ProfileListFrag.this;
                profileListFrag3.m52048A8(profileListFrag3.f33792m1);
            } else if (xdl0.m208349O0(ProfileListFrag.this.f33788l1)) {
                xdl0.m208327D0(ProfileListFrag.this.f33697Q3, ProfileListFrag.this.f33788l1);
                ProfileListFrag profileListFrag4 = ProfileListFrag.this;
                profileListFrag4.m52048A8(profileListFrag4.f33788l1);
            }
            ProfileListFrag.this.m52111K8();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$i */
    public class C8701i implements NewNewProfileCard.InterfaceC7863d {
        public C8701i() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$j */
    public class C8702j implements d30 {
        public C8702j() {
        }

        @Override // p149l.d30
        public void call() {
            Intent intentM50739q2 = ProfileAct.m50739q2(ProfileListFrag.this.getContext(), ProfileListFrag.this.m94569i2().f56011id, "preview_card", false, false, ProfileListFrag.this.f33680N1 != null ? ProfileListFrag.this.f33680N1.getShowPictureIndex() : -1);
            intentM50739q2.putExtra("preview_user_info", ProfileListFrag.this.m94569i2());
            ProfileListFrag.this.startActivity(intentM50739q2);
            ProfileListFrag.this.act().overridePendingTransition(rzb0.f161653y, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$k */
    public class ViewTreeObserverOnGlobalLayoutListenerC8703k implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8703k() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m52387b(View view) {
            if (qib0.f154713b0.f139232c != null) {
                zvf0.m220399u("e_live_video_quickchat_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("anchorId", ProfileListFrag.this.f33794m3), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"));
                ProfileListFrag.this.f33781j3 = true;
                qib0.f154713b0.f139232c.mo67289uq(ProfileListFrag.this.act(), ProfileListFrag.this.f33794m3, "profile");
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if ((!xdl0.m208349O0(ProfileListFrag.this.f33784k1) && !xdl0.m208349O0(ProfileListFrag.this.f33755d1) && !xdl0.m208349O0(ProfileListFrag.this.f33714U0) && !xdl0.m208349O0(ProfileListFrag.this.f33694Q0)) || xdl0.m208349O0(ProfileListFrag.this.f33767g1)) {
                xdl0.m208344M(ProfileListFrag.this.f33714U0, true);
                return;
            }
            boolean zM208349O0 = xdl0.m208349O0(ProfileListFrag.this.f33714U0);
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            if (!zM208349O0) {
                xdl0.m208344M(profileListFrag.f33784k1, false);
                xdl0.m208344M(ProfileListFrag.this.f33755d1, false);
                xdl0.m208344M(ProfileListFrag.this.f33694Q0, false);
                xdl0.m208344M(ProfileListFrag.this.f33784k1, false);
                xdl0.m208344M(ProfileListFrag.this.f33714U0, true);
                return;
            }
            View view = profileListFrag.f33727W3;
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (view == null) {
                profileListFrag2.f33727W3 = o7r.m163037a(profileListFrag2.getContext()).inflate(f6c0.f95677Za, (ViewGroup) null);
                ProfileListFrag.this.f33727W3.setOnClickListener(new View.OnClickListener() { // from class: l.l5a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f126098a.m52387b(view2);
                    }
                });
            } else if (profileListFrag2.f33727W3.getParent() != null && ProfileListFrag.this.f33727W3.getParent() == ProfileListFrag.this.f33732X3) {
                return;
            } else {
                xdl0.m208394p0(ProfileListFrag.this.f33727W3);
            }
            ProfileListFrag profileListFrag3 = ProfileListFrag.this;
            if (profileListFrag3.f33612A1 == null) {
                profileListFrag3.m52335t9();
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ProfileListFrag.this.f33612A1.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.bottomMargin = t100.f167255d;
            int i = t100.f167260i;
            layoutParams.leftMargin = -i;
            layoutParams.rightMargin = -i;
            xdl0.m208344M(ProfileListFrag.this.f33612A1, false);
            xdl0.m208344M(ProfileListFrag.this.f33733Y, false);
            xdl0.m208344M(ProfileListFrag.this.f33771h1, false);
            ((ViewGroup) ProfileListFrag.this.f33612A1.getParent()).addView(ProfileListFrag.this.f33727W3, layoutParams);
            zvf0.m220368A("e_live_video_quickchat_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("anchorId", ProfileListFrag.this.f33794m3), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"));
            ProfileListFrag profileListFrag4 = ProfileListFrag.this;
            profileListFrag4.f33732X3 = (View) profileListFrag4.f33727W3.getParent();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$l */
    public class C8704l extends RecyclerView.AbstractC0576n {
        public C8704l() {
        }

        /* JADX INFO: renamed from: f */
        public final int m52388f(View view) {
            view.measure(View.MeasureSpec.makeMeasureSpec(ProfileListFrag.this.f33718V.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            return view.getMeasuredHeight();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.C0588z c0588z) {
            super.onDrawOver(canvas, recyclerView, c0588z);
            int iMax = 0;
            View childAt = recyclerView.getChildAt(0);
            if (childAt == null) {
                return;
            }
            int layoutPosition = recyclerView.getChildViewHolder(childAt).getLayoutPosition();
            for (int i = layoutPosition; i >= 0; i--) {
                if (ProfileListFrag.this.f33777i3.m156189L(i)) {
                    int i2 = layoutPosition + 1;
                    if (i2 < ProfileListFrag.this.f33777i3.getItemCount() && ProfileListFrag.this.f33777i3.m156189L(i2)) {
                        iMax = Math.max(ProfileListFrag.this.f33748b2.getDecoratedTop(recyclerView.getChildAt(1)), 0);
                    }
                    mt90 mt90Var = ProfileListFrag.this.f33777i3;
                    RecyclerView.AbstractC0566d0 abstractC0566d0CreateViewHolder = mt90Var.createViewHolder(recyclerView, mt90Var.getItemViewType(i));
                    ProfileListFrag.this.f33777i3.bindViewHolder(abstractC0566d0CreateViewHolder, i);
                    int iM52388f = m52388f(abstractC0566d0CreateViewHolder.itemView);
                    canvas.save();
                    if (iMax < abstractC0566d0CreateViewHolder.itemView.getMeasuredHeight() && iMax > 0) {
                        canvas.translate(0.0f, iMax - iM52388f);
                    }
                    abstractC0566d0CreateViewHolder.itemView.draw(canvas);
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public ProfileListFrag() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.uz90
            @Override // p149l.e30
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((C4319c) obj).f15557c);
            }
        }));
        this.f33737Y3 = new ViewTreeObserverOnGlobalLayoutListenerC8703k();
        this.f33746a4 = false;
        this.f33758d4 = C22392a.m221512b();
        this.f33762e4 = false;
        this.f33766f4 = true;
        this.f33770g4 = 0;
        this.f33774h4 = new C8695c();
        this.f33778i4 = "";
        this.f33782j4 = new ArrayList();
        this.f33787k4 = new cme(this, this);
        this.f33791l4 = new dna0(this, this);
        this.f33795m4 = new dle(this, this);
        this.f33799n4 = new gne(this, this);
        this.f33803o4 = new tke(this, this);
        this.f33808p4 = new tme(this, this);
        this.f33812q4 = new loe(this, this);
        this.f33816r4 = new cne(this, this);
        this.f33820s4 = new goe(this, this);
        this.f33824t4 = new C8698f(this, this);
        this.f33828u4 = new jle(this, this);
        this.f33832v4 = new cqa0(this, this);
        this.f33836w4 = new fna0(this, this);
        this.f33840x4 = new l33(this, this);
        this.f33844y4 = false;
        this.f33849z4 = -1;
        this.f33615A4 = false;
        this.f33620B4 = false;
        this.f33625C4 = new hra0(this);
        this.f33630D4 = new C8700h();
        this.f33636E4 = new HashMap<>();
        creates(new e30() { // from class: l.f0a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93968a.m52298nc((Bundle) obj);
            }
        });
        this.f33642F4 = new HashSet();
    }

    /* JADX INFO: renamed from: A9 */
    private void m51831A9() {
        if (this.f33798n3) {
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.a2a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67244a.m52147Pb((User) obj);
                }
            }));
        } else {
            if (f9j.m120084a(this.f33823t3)) {
                duringCreated(C22306c.just(roj0.f160388a)).subscribe(mkd0.m154955G(new e30() { // from class: l.l2a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f125765a.m52155Qb((roj0) obj);
                    }
                }));
            }
            duringCreated(new v9j() { // from class: l.w2a0
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f184121a.m52162Rb();
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.h3a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f105587a.m52169Sb((j760) obj);
                }
            }));
            if (CoreModule.m29934N().mo60267Co()) {
                duringCreated(CoreModule.f17545c.f19678r0.m34150v5()).filter(new w9j() { // from class: l.s3a0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f162089a.m52175Tb((j760) obj);
                    }
                }).map(new w9j() { // from class: l.d4a0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ProfileListFrag.m52041y5((j760) obj);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.o4a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f141758a.m52192Vb((RelationshipStatus) obj);
                    }
                }));
            }
            if (!m52296na()) {
                m52209Y8();
            }
        }
        duringCreated(CoreModule.m29936Q().mo67257ao(userId())).subscribe(mkd0.m154956H(new e30() { // from class: l.z4a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201449a.m52199Wb((Boolean) obj);
            }
        }, new e30() { // from class: l.k5a0
            @Override // p149l.e30
            public final void call(Object obj) {
                hfw.m130790a("intl_profile_guild", ((Throwable) obj).toString());
            }
        }));
    }

    /* JADX INFO: renamed from: B5 */
    public static /* synthetic */ void m51832B5() {
        try {
            f33610I4 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f17544b.getResources().openRawResource(t7c0.f168687a));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: Bd */
    private void m51835Bd(List<Media> list) {
        m52065Cd(list, false);
    }

    /* JADX INFO: renamed from: C6 */
    public static /* synthetic */ boolean m51837C6(View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(0.875f).scaleY(0.875f).setDuration(100L).start();
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        return false;
    }

    @MainThread
    /* JADX INFO: renamed from: C8 */
    private void m51839C8() {
        if (this.f33762e4) {
            this.f33789l2 = true;
            return;
        }
        this.f33844y4 = true;
        xdl0.m208344M(this.f33648H, this.f33618B2.mo52729l());
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (!this.f33798n3) {
            m52339td();
        }
        m52044yd();
        if (mo51119m0()) {
            if (NullChecker.m81303a(wn90.m204602F().f187269a) && this.f33641F3) {
                User user = wn90.m204602F().f187269a;
                if (!TEnum.equals(this.f33780j2.profile.zodiac, user.profile.zodiac)) {
                    user.profile.zodiac = this.f33780j2.profile.zodiac;
                }
                wn90.m204602F().f187269a = this.f33780j2.mo223809clone();
                wn90.m204602F().f187269a.description = user.description;
                wn90.m204602F().f187269a.pictures = user.pictures;
                wn90.m204602F().f187269a.profile = user.profile;
                wn90.m204602F().f187269a.voice = user.voice;
                wn90.m204602F().f187269a.profile.extensions.physical.bloodType = this.f33780j2.profile.extensions.physical.bloodType;
                wn90.m204602F().f187269a.profile.extensions.interest.emoji = this.f33780j2.profile.extensions.interest.emoji;
            } else {
                this.f33641F3 = true;
                wn90.m204602F().f187269a = this.f33780j2.mo223809clone();
            }
            m52070Dd(wn90.m204602F().f187269a);
            if (upa.m194825u2()) {
                m52078F8();
            }
            m52084G8();
        } else {
            if (("home_card".equals(this.f33823t3) || "home_moment_theme_card".equals(this.f33823t3) || "liked_users".equals(this.f33823t3) || m52167S9() || m52247ea() || m52217Z9() || m52210Y9() || m52241da() || m52235ca() || m52197W9()) && mo52150Q()) {
                m52149Pd(mo51069K2(), false);
            }
            if ("home_card".equals(this.f33823t3) && fap.m120266y()) {
                m52121Ld(this.f33780j2);
            }
        }
        this.f33643G.setVisibility(4);
        this.f33718V.setVisibility(0);
        if (!mo51119m0()) {
            this.f33648H.setVisibility(0);
        }
        m52378zd();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f33849z4 == -1) {
            this.f33849z4 = CoreModule.f17545c.f19639e0.m169527p9().isVIP() ? 1 : 0;
        }
        if (!this.f33802o3 && this.f33849z4 == 0 && CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            C8699g c8699g = new C8699g(act());
            c8699g.setTargetPosition(0);
            this.f33618B2.m52787G1();
            this.f33770g4 = 0;
            this.f33723W.setTranslationY(0.0f);
            this.f33718V.getLayoutManager().startSmoothScroll(c8699g);
            m52284l9();
            this.f33849z4 = 1;
        }
    }

    /* JADX INFO: renamed from: D8 */
    public static ProfileListFrag m51843D8(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        mm90 mm90Var = new mm90();
        mm90Var.f134562a = str;
        mm90Var.f134563b = z;
        mm90Var.f134564c = z2;
        mm90Var.f134566e = str2;
        mm90Var.f134567f = z3;
        mm90Var.f134568g = RelationshipStatus.get("unknown_");
        mm90Var.f134569h = 273;
        mm90Var.f134570i = false;
        mm90Var.f134571j = true;
        mm90Var.f134572k = false;
        mm90Var.f134573l = z4;
        mm90Var.f134574m = -1;
        return m51847E8(mm90Var);
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m51844E5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: E8 */
    public static ProfileListFrag m51847E8(mm90 mm90Var) {
        ProfileListFrag profileListFrag = new ProfileListFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", mm90Var.f134562a);
        bundle.putBoolean("is_edit", mm90Var.f134564c);
        bundle.putString("input_type", mm90Var.f134565d);
        bundle.putBoolean("show_buttons", mm90Var.f134563b);
        bundle.putBoolean("canShowFollowButton", mm90Var.f134573l);
        bundle.putBoolean("no_showbuttons_infofromlocal", mm90Var.f134571j);
        bundle.putString("from", mm90Var.f134566e);
        bundle.putBoolean("open_media_picker", mm90Var.f134567f);
        bundle.putString("relationship_status", mm90Var.f134568g.toString());
        bundle.putInt("button_flag", mm90Var.f134569h);
        bundle.putBoolean("with_superlike", mm90Var.f134570i);
        bundle.putBoolean("from_gp_live", mm90Var.f134572k);
        bundle.putInt("pic_index", mm90Var.f134574m);
        bundle.putInt("pushReason", mm90Var.f134576o);
        bundle.putString("pushTag", mm90Var.f134577p);
        bundle.putSerializable("city_centre_data", mm90Var.f134578q);
        profileListFrag.setArguments(bundle);
        return profileListFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ea */
    public /* synthetic */ void m51848Ea() {
        m20581b4().m20504F(this.f33794m3).m20568z0();
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m51849F5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Fa */
    public /* synthetic */ void m51852Fa() {
        if (NullChecker.m81303a(mo51069K2())) {
            DebugUtil.m59280zk(mo51069K2(), act());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ga */
    public /* synthetic */ void m51856Ga() {
        User user = this.f33780j2;
        if (user == null || user == this.f33785k2) {
            return;
        }
        for (int i = 0; i < 10; i++) {
            Contact contactNew_ = Contact.new_();
            contactNew_.name = "张三 " + i;
            this.f33780j2.profile.contactLookups.lookups.add(contactNew_);
        }
        m51857Gd(this.f33780j2);
    }

    /* JADX INFO: renamed from: Gd */
    private void m51857Gd(User user) {
        wn90.m204602F().f187269a = user;
        m51839C8();
    }

    /* JADX INFO: renamed from: J5 */
    public static /* synthetic */ void m51864J5(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: L9 */
    private boolean m51873L9() {
        if ("from_portrait_like_list".equals(this.f33823t3)) {
            return true;
        }
        if (upa.m194706V1()) {
            return "chat_group".equals(this.f33823t3) || "chat_group_anonymity".equals(this.f33823t3) || "group_notification".equals(this.f33823t3) || "group_notification_anonymity".equals(this.f33823t3);
        }
        return false;
    }

    /* JADX INFO: renamed from: N9 */
    public static boolean m51881N9(User user) {
        return NullChecker.m81303a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched");
    }

    /* JADX INFO: renamed from: Nd */
    private void m51882Nd(User user) {
        this.f33785k2 = user;
    }

    /* JADX INFO: renamed from: P5 */
    public static /* synthetic */ Boolean m51888P5(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: R8 */
    private String m51899R8(User user) {
        CharSequence charSequenceM133849P = (CoreModule.f17545c.f19561E0.m203772B3(user) || User.isTeamAccount(user.f56011id) || user.f56011id.equals(CoreModule.m29931H().userId())) ? "" : i0g0.m133849P(user.location, false, null, i0g0.m133878r(user.location, true, false));
        if (!TextUtils.isEmpty(charSequenceM133849P)) {
            return charSequenceM133849P.toString();
        }
        if (user.location.isHideInfo() && user.location.isHideDistance()) {
            return "";
        }
        int i = user.location.distance;
        if (i < 1000) {
            return Constants.DEFAULT_UIN;
        }
        return i < 10000 ? String.valueOf((i / 1000) * 1000) : String.valueOf((i / 10000) * 10000);
    }

    /* JADX INFO: renamed from: Rd */
    private void m51900Rd(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.m29932K().getUserById("fake_risk_audit_default_" + this.f33794m3));
        }
        this.f33780j2 = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: V6 */
    public static /* synthetic */ void m51915V6(Throwable th) {
    }

    /* JADX INFO: renamed from: W8 */
    private List<hn2<?>> m51921W8(List<hn2<?>> list) {
        ArrayList arrayList = new ArrayList();
        if (this.f33802o3) {
            for (hn2<?> hn2Var : list) {
                if (hn2Var.mo52729l()) {
                    arrayList.add(hn2Var);
                    if (hn2Var.mo52385k()) {
                        arrayList.add(this.f33613A2);
                    }
                }
            }
        } else {
            hn2<?> hn2Var2 = null;
            int i = 0;
            for (hn2<?> hn2Var3 : list) {
                if (hn2Var3.mo52729l()) {
                    if (hn2Var3.mo52385k() && (i = i + 1) > 1) {
                        if (!NullChecker.m81303a(hn2Var2)) {
                            arrayList.add(this.f33842y2);
                        } else if (hn2Var2 instanceof yqa0) {
                            dj90 dj90Var = new dj90(this, this);
                            this.f33847z2 = dj90Var;
                            dj90Var.m131824v(t100.m186890d(4.0f));
                            arrayList.add(this.f33847z2);
                        } else if (hn2Var2 instanceof fr90) {
                            dj90 dj90Var2 = new dj90(this, this);
                            this.f33847z2 = dj90Var2;
                            dj90Var2.m131824v(t100.m186890d(9.0f));
                            arrayList.add(this.f33847z2);
                        } else if (hn2Var2 instanceof bq90) {
                            dj90 dj90Var3 = new dj90(this, this);
                            this.f33847z2 = dj90Var3;
                            dj90Var3.m131824v(t100.m186890d(16.0f));
                            arrayList.add(this.f33847z2);
                        } else if (hn2Var2 instanceof uta0) {
                            dj90 dj90Var4 = new dj90(this, this);
                            this.f33847z2 = dj90Var4;
                            dj90Var4.m131824v(t100.m186890d(9.0f));
                            arrayList.add(this.f33847z2);
                        } else if (hn2Var2 instanceof kr90) {
                            dj90 dj90Var5 = new dj90(this, this);
                            this.f33847z2 = dj90Var5;
                            dj90Var5.m131824v(t100.m186890d(24.0f));
                            arrayList.add(this.f33847z2);
                        } else if (hn2Var2 instanceof ir90) {
                            dj90 dj90Var6 = new dj90(this, this);
                            this.f33847z2 = dj90Var6;
                            dj90Var6.m131824v(t100.m186890d(16.0f));
                            arrayList.add(this.f33847z2);
                        } else {
                            arrayList.add(this.f33842y2);
                        }
                    }
                    arrayList.add(hn2Var3);
                    hn2Var2 = hn2Var3;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z6 */
    public static /* synthetic */ void m51932Z6(Throwable th) {
    }

    /* JADX INFO: renamed from: Z8 */
    private String m51934Z8(String str) {
        String str2 = this.f33778i4;
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : str2;
    }

    /* JADX INFO: renamed from: a6 */
    public static /* synthetic */ void m51936a6() {
    }

    /* JADX INFO: renamed from: a8 */
    public static /* synthetic */ ProfileEditInfo m51938a8(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: ad */
    private void m51939ad() {
        xdl0.m208366b0(this.f33637F, new v9j() { // from class: l.qy90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ProfileListFrag.m51844E5();
            }
        });
    }

    /* JADX INFO: renamed from: bd */
    public static String m51944bd(String str) {
        return m51950cd(str, true);
    }

    /* JADX INFO: renamed from: be */
    private void m51945be() {
        if (CoreModule.f17545c.f19639e0.m169527p9().isJailedOrRestrict()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.m29934N().isPostingMoment()) {
                return;
            }
            CoreModule.m29934N().mo60298Nr(act(), vwb.m200324f0(new Media[0]), true, "other", wsh.m205499d(), wsh.m205500e(), null);
        }
    }

    /* JADX INFO: renamed from: cd */
    public static String m51950cd(String str, boolean z) {
        if (str.matches("[ ]+")) {
            if (z) {
                lra0.m151147f(OMSTemplateModeType.space);
            }
            return OMSTemplateModeType.space;
        }
        if (str.matches("\\d+")) {
            if (z) {
                lra0.m151147f("number");
            }
            return "number";
        }
        if (str.matches("[\\p{P}+`]+")) {
            if (z) {
                lra0.m151147f("symbol");
            }
            return "symbol";
        }
        if (!str.matches("[\\p{P}\\d+`]+")) {
            return "";
        }
        if (z) {
            lra0.m151147f("number_symbol");
        }
        return "number_symbol";
    }

    /* JADX INFO: renamed from: d8 */
    public static /* synthetic */ void m51954d8() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149460r2;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19639e0.f149453q2.put(bool);
    }

    /* JADX INFO: renamed from: de */
    private void m51955de(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == 6) {
            mediaReorderCards.m50811h(5).m50672S1(null);
            return;
        }
        mediaReorderCards.m50811h(i).m50672S1(str);
        if (i < 5) {
            mediaReorderCards.m50811h(i + 1).m50672S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m50811h(i - 1).m50672S1(null);
        }
    }

    /* JADX INFO: renamed from: f8 */
    public static /* synthetic */ void m51963f8(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ void m51976j5(Throwable th) {
    }

    /* JADX INFO: renamed from: la */
    public static boolean m51988la(User user) {
        if (NullChecker.m81303a(user.localRelationship)) {
            return TEnum.equals(user.localRelationship.state, "liked") || TEnum.equals(user.localRelationship.state, "lettered") || TEnum.equals(user.localRelationship.state, "matched");
        }
        return false;
    }

    /* JADX INFO: renamed from: m7 */
    public static /* synthetic */ void m51991m7() {
    }

    /* JADX INFO: renamed from: n7 */
    public static /* synthetic */ void m51995n7(Throwable th) {
        CoreModule.f17545c.f19642f0.f19887P1 = null;
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            osi0.m165782f(R$string.f17844J7);
        }
    }

    /* JADX INFO: renamed from: n9 */
    private void m51997n9() {
        if (mo51119m0()) {
            m52278k9();
        } else if (!this.f33798n3 && NullChecker.m81303a(mo51069K2()) && mo51069K2().unilateralBlock()) {
            m52079F9();
        } else {
            m52329s9();
        }
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ void m51998o5(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: p9 */
    private void m52006p9() {
        if (!this.f33798n3 || this.f33802o3) {
            return;
        }
        duringCreated(new v9j() { // from class: l.c2a0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f78344a.m52325rb();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.d2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83343a.m52331sb((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: rd */
    public void m52015rd() {
        jg90 jg90Var = this.f33628D2;
        if (jg90Var.f117758v == null || !jg90Var.m131823u().isAttachedToWindow()) {
            if (this.f33748b2.findFirstCompletelyVisibleItemPosition() > 2) {
                this.f33809q1.m52949g(1.0f);
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        this.f33809q1.getLocationInWindow(iArr);
        float height = iArr[1] + this.f33809q1.getHeight();
        int[] iArr2 = new int[2];
        this.f33628D2.f117758v.getLocationInWindow(iArr2);
        float height2 = (height - iArr2[1]) / this.f33628D2.f117758v.getHeight();
        this.f33809q1.m52949g(height2);
        double d = height2;
        View view = this.f33813r1;
        if (d < 0.1d) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m52016s5(Throwable th) {
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ Boolean m52028v5(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m52032w5(Throwable th) {
    }

    /* JADX INFO: renamed from: w9 */
    private void m52036w9() {
        this.f33748b2 = new SmoothScrollLinearLayoutManager(getContext());
        this.f33718V.setItemAnimator(null);
        this.f33718V.setLayoutManager(this.f33748b2);
        this.f33718V.setAdapter(this.f33777i3);
        this.f33718V.addOnScrollListener(this.f33774h4);
        if (m52305oa() && !this.f33802o3) {
            this.f33718V.post(new Runnable() { // from class: l.w4a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184489a.m52356wb();
                }
            });
        }
        if (this.f33802o3) {
            this.f33718V.addItemDecoration(new C8704l());
        }
    }

    /* JADX INFO: renamed from: x9 */
    private void m52040x9() {
        gd70.m125540b().m125543e(Boolean.FALSE);
        boolean z = this.f33802o3;
        VNavigationBar vNavigationBar = this.f33611A;
        if (z) {
            xdl0.m208344M(vNavigationBar, true);
            View viewInflate = act().inflater().inflate(f6c0.f95292B9, (ViewGroup) null);
            VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174359m4);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.c5a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79358a.m52063Cb(view);
                }
            };
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.d5a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84397a.m52068Db(view);
                }
            };
            xdl0.m208329E0(vButton, onClickListener);
            this.f33611A.setLeftIconOnClick(onClickListener2);
            this.f33611A.m223589z(viewInflate);
            this.f33611A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.e5a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f89359a.m52074Eb(view);
                }
            });
            return;
        }
        xdl0.m208344M(vNavigationBar, false);
        if (m52296na() && m52244dd()) {
            m52335t9();
            this.f33834w2 = true;
            xdl0.m208344M(this.f33694Q0, false);
        } else {
            m52369y9();
        }
        if (TextUtils.equals(this.f33823t3, "impress_signal") || m52197W9() || TextUtils.equals(this.f33823t3, "from_pin_like") || m52204X9()) {
            xdl0.m208344M(this.f33751c1, false);
            xdl0.m208344M(this.f33755d1, false);
            xdl0.m208344M(this.f33771h1, false);
            xdl0.m208344M(this.f33694Q0, false);
            xdl0.m208344M(this.f33714U0, false);
            xdl0.m208344M(this.f33728X, false);
        }
        m52374z9();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ RelationshipStatus m52041y5(j760 j760Var) {
        return (RelationshipStatus) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: yd */
    private void m52044yd() {
        new ArrayList();
        this.f33777i3.m156190M(m51921W8(this.f33782j4));
        m52342u9();
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m52046z6(Throwable th) {
    }

    /* JADX INFO: renamed from: A8 */
    public void m52048A8(View view) {
        m52055B8(view, view);
    }

    /* JADX INFO: renamed from: Aa */
    public final /* synthetic */ void m52049Aa() {
        ViewGroup.LayoutParams layoutParams = this.f33840x4.m131823u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = t100.m186890d(164.0f);
            this.f33840x4.m131823u().setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Ab */
    public final /* synthetic */ void m52050Ab(Detect detect) {
        if (!NullChecker.m81303a(detect) || vwb.m200296J(detect.text)) {
            mo51123o();
            return;
        }
        j4p j4pVar = new j4p(act());
        j4pVar.m139697K(new e30() { // from class: l.p1a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146661a.m52376zb((roj0) obj);
            }
        });
        j4pVar.show();
    }

    /* JADX INFO: renamed from: Ac */
    public final /* synthetic */ void m52051Ac() {
        this.f33630D4.call();
    }

    /* JADX INFO: renamed from: Ad */
    public void m52052Ad(boolean z) {
        if (m52098I9() || m52197W9()) {
            return;
        }
        if (r65.m178035m() || sb90.m183209e(mo51069K2())) {
            if (TextUtils.equals("from_city_center_boost_cover", this.f33823t3)) {
                xdl0.m208344M(this.f33714U0, false);
                xdl0.m208344M(this.f33751c1, false);
                return;
            }
            if (TextUtils.equals("from_city_center_conv_banner", this.f33823t3) && !TextUtils.equals(this.f33794m3, CoreModule.m29931H().userId())) {
                xdl0.m208344M(this.f33714U0, false);
                xdl0.m208344M(this.f33751c1, false);
                xdl0.m208344M(this.f33739Z0, true);
                boolean zEquals = TextUtils.equals(CoreModule.f17545c.f19678r0.f20038s0.m221515e(), this.f33794m3);
                TextView textView = this.f33747b1;
                if (zEquals) {
                    textView.setText("招呼已发送");
                    this.f33747b1.setEnabled(false);
                    return;
                } else {
                    textView.setText("发送招呼");
                    this.f33747b1.setEnabled(true);
                    xdl0.m208329E0(this.f33747b1, new View.OnClickListener() { // from class: l.ry90
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f161548a.m52377zc(view);
                        }
                    });
                    return;
                }
            }
        }
        xdl0.m208344M(this.f33771h1, false);
        xdl0.m208344M(this.f33755d1, false);
        if (TextUtils.equals(this.f33823t3, "from_portrait_like_list")) {
            xdl0.m208344M(this.f33788l1, false);
            xdl0.m208344M(this.f33792m1, false);
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f33794m3);
        if (NullChecker.m81303a(conversationM32856Xe) && !TEnum.equals(conversationM32856Xe.status, "dismissed")) {
            if (TextUtils.equals(this.f33823t3, "from_portrait_like_list")) {
                xdl0.m208344M(this.f33755d1, true);
                m52048A8(this.f33755d1);
            }
            xdl0.m208325C0(this.f33728X, xdl0.m208349O0(this.f33751c1) ? t100.m186890d(164.0f) : t100.m186890d(126.0f));
            xdl0.m208344M(this.f33728X, true);
        } else if (NullChecker.m81303a(this.f33754c4) && m52273ja()) {
            if (TextUtils.equals(this.f33823t3, "from_portrait_like_list")) {
                xdl0.m208357U(this.f33784k1, t100.m186890d(10.0f));
                xdl0.m208344M(this.f33788l1, true);
                xdl0.m208344M(this.f33792m1, true);
            } else {
                boolean zM52291ma = m52291ma();
                VLinear vLinear = this.f33829v1;
                if (zM52291ma) {
                    xdl0.m208344M(vLinear, true);
                    m52129Md(true);
                } else {
                    if (NullChecker.m81303a(vLinear)) {
                        xdl0.m208344M(this.f33829v1, false);
                    }
                    xdl0.m208344M(this.f33771h1, true);
                    m52048A8(this.f33771h1);
                    m52129Md(false);
                }
            }
            xdl0.m208325C0(this.f33728X, xdl0.m208349O0(this.f33751c1) ? t100.m186890d(164.0f) : t100.m186890d(126.0f));
            xdl0.m208344M(this.f33728X, true);
        }
        if (TextUtils.equals(this.f33823t3, "from_portrait_like_list")) {
            if (z) {
                e51.m114743H(act(), new Runnable() { // from class: l.sy90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f166919a.m52051Ac();
                    }
                }, 850L);
            } else {
                this.f33630D4.call();
            }
        }
        if (!xdl0.m208349O0(this.f33751c1) && !xdl0.m208349O0(this.f33771h1) && !xdl0.m208349O0(this.f33755d1) && !xdl0.m208349O0(this.f33784k1)) {
            xdl0.m208344M(this.f33728X, false);
        }
        this.f33840x4.mo131811a(new d30() { // from class: l.ty90
            @Override // p149l.d30
            public final void call() {
                this.f172565a.m52059Bc();
            }
        });
        m52304o9();
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: B1 */
    public List<View> mo52053B1() {
        return vwb.m200324f0(this.f33718V);
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: B2 */
    public View mo52054B2() {
        return this.f33719V0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: B8 */
    public void m52055B8(View view, final View view2) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.j0a0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return ProfileListFrag.m51837C6(view2, view3, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: B9 */
    public final void m52056B9() {
        m52373z8();
        m52149Pd(null, false);
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f33794m3);
        if (NullChecker.m81303a(this.f33780j2)) {
            if (f9k0.m120089b(this.f33780j2)) {
                e51.m114743H(act(), new Runnable() { // from class: l.s4a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f162277a.m52206Xb();
                    }
                }, 1000L);
            }
            if (User.isMatched(this.f33780j2) || (NullChecker.m81303a(conversationM32856Xe) && TEnum.equals(conversationM32856Xe.status, "default"))) {
                if (NullChecker.m81303a(this.f33733Y)) {
                    xdl0.m208344M(this.f33733Y, false);
                    xdl0.m208344M(this.f33714U0, false);
                }
                if (NullChecker.m81303a(this.f33751c1)) {
                    xdl0.m208344M(this.f33751c1, false);
                }
                if (NullChecker.m81303a(this.f33728X)) {
                    xdl0.m208344M(this.f33728X, false);
                }
            }
        }
        m52363xd();
    }

    /* JADX INFO: renamed from: Ba */
    public final /* synthetic */ void m52057Ba(View view) {
        this.f33632E0.callOnClick();
    }

    /* JADX INFO: renamed from: Bb */
    public final /* synthetic */ void m52058Bb(Throwable th) {
        mo51123o();
    }

    /* JADX INFO: renamed from: Bc */
    public final /* synthetic */ void m52059Bc() {
        ViewGroup.LayoutParams layoutParams = this.f33840x4.m131823u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = t100.m186890d(xdl0.m208349O0(this.f33728X) ? 164.0f : 0.0f);
            this.f33840x4.m131823u().setLayoutParams(layoutParams);
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo51050C2() {
        return f33610I4;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: C3 */
    public View mo52060C3() {
        return this.f33618B2.m52797M0();
    }

    /* JADX INFO: renamed from: C9 */
    public final void m52061C9() {
        if (!u59.m191852w() || mo51075P1()) {
            return;
        }
        if (NullChecker.m81303a(CoreModule.f17545c.f19686t2.f148152R) && CoreModule.f17545c.f19686t2.f148152R.get().booleanValue()) {
            duringCreated(C22306c.just(roj0.f160388a)).subscribe(mkd0.m154955G(new e30() { // from class: l.vz90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183601a.m52212Yb((roj0) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f17545c.f19686t2.m168331k3(userId(), "profile", "user,description")).subscribe(mkd0.m154956H(new e30() { // from class: l.wz90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188713a.m52219Zb((CoreData) obj);
                }
            }, new e30() { // from class: l.xz90
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFrag.m52046z6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Cb */
    public final /* synthetic */ void m52063Cb(View view) {
        lra0.m151149h("button");
        final String strM123010c = ft4.m123008b().m123010c(this.f33780j2, wn90.m204602F().f187269a);
        if (ft4.m123008b().m123016i(strM123010c)) {
            act().duringCreated(CoreModule.f17545c.f19611U1.m101523i3("profile", strM123010c)).subscribe(mkd0.m154956H(new e30() { // from class: l.u0a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f172859a.m52361xb(strM123010c, (List) obj);
                }
            }, new e30() { // from class: l.v0a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f179084a.m52371yb((Throwable) obj);
                }
            }));
            return;
        }
        if (u59.m191849t() && NullChecker.m81303a(m94569i2())) {
            String strM200333k = vwb.m200333k(m94569i2().description);
            if (!TextUtils.equals(strM200333k, this.f33785k2.description) && !TextUtils.isEmpty(strM200333k.trim())) {
                DetectRequest detectRequestNew_ = DetectRequest.new_();
                detectRequestNew_.category = DetectCategoryType.get(DetectCategoryType.contact_information);
                ArrayList arrayList = new ArrayList();
                DetectText detectTextNew_ = DetectText.new_();
                detectTextNew_.key = "aboutMe";
                detectTextNew_.value = strM200333k;
                arrayList.add(detectTextNew_);
                detectRequestNew_.text = arrayList;
                act().duringCreated(ya5.m213801Q(detectRequestNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.w0a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f183740a.m52050Ab((Detect) obj);
                    }
                }, new e30() { // from class: l.x0a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f188944a.m52058Bb((Throwable) obj);
                    }
                }));
                return;
            }
        }
        mo51123o();
    }

    /* JADX INFO: renamed from: Cc */
    public final /* synthetic */ void m52064Cc(Media media, Boolean bool, Boolean bool2) {
        mo51092Z2();
    }

    /* JADX INFO: renamed from: Cd */
    public final void m52065Cd(final List<Media> list, final boolean z) {
        this.f33787k4.mo131811a(new d30() { // from class: l.g2a0
            @Override // p149l.d30
            public final void call() {
                this.f100251a.m52069Dc(z, list);
            }
        });
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo51053D2() {
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: D9 */
    public final void m52066D9() {
        int i;
        int i2;
        int i3;
        if ("liked_users".equals(this.f33823t3) || "intl_top_picks".equals(this.f33823t3) || m52167S9()) {
            LikeUser likeUserM134579m = CoreModule.f17545c.f19628a1.m134579m(this.f33794m3);
            if (likeUserM134579m == null && NullChecker.m81303a(this.f33647G3)) {
                likeUserM134579m = this.f33652H3;
            }
            if (NullChecker.m81303a(likeUserM134579m) || "intl_top_picks".equals(this.f33823t3) || m52167S9()) {
                if (!this.f33818s2) {
                    this.f33638F0.setBackgroundResource(x2c0.f190742yb);
                    this.f33632E0.setBackgroundResource(x2c0.f190742yb);
                    VImage vImage = this.f33644G0;
                    if (u59.m191811T()) {
                        i = x2c0.f190710xb;
                    } else {
                        i = IntlCountryCodeController.m28126v() ? x2c0.f189165Ab : x2c0.f190774zb;
                    }
                    vImage.setImageResource(i);
                    this.f33649H0.setTextColor(Color.parseColor("#FFDEA2"));
                    if ("liked_users".equals(this.f33823t3) || m52167S9()) {
                        xdl0.m208344M(this.f33684O0, false);
                        xdl0.m208344M(this.f33738Z, false);
                        return;
                    }
                    return;
                }
                VLinear vLinear = this.f33841y1;
                if (vLinear != null && this.f33846z1 != null) {
                    vLinear.setBackground(act().getResources().getDrawable(x2c0.f190742yb));
                    VImage vImage2 = this.f33846z1;
                    if (u59.m191811T()) {
                        i3 = x2c0.f190710xb;
                    } else {
                        i3 = IntlCountryCodeController.m28126v() ? x2c0.f189165Ab : x2c0.f190774zb;
                    }
                    vImage2.setImageResource(i3);
                }
                this.f33638F0.setBackgroundResource(x2c0.f190742yb);
                this.f33632E0.setBackgroundResource(x2c0.f190742yb);
                VImage vImage3 = this.f33644G0;
                if (u59.m191811T()) {
                    i2 = x2c0.f190710xb;
                } else {
                    i2 = IntlCountryCodeController.m28126v() ? x2c0.f189165Ab : x2c0.f190774zb;
                }
                vImage3.setImageResource(i2);
                this.f33649H0.setTextColor(Color.parseColor("#FFDEA2"));
                if ("liked_users".equals(this.f33823t3) || m52167S9()) {
                    m52097I8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Da */
    public final /* synthetic */ Boolean m52067Da(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue() || !NullChecker.m81303a(CoreModule.f17545c.m31484o3()) || n3b0.m157745t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19454u0;
        Boolean bool3 = Boolean.TRUE;
        hpd0Var.put(bool3);
        ok3.m164808G(act(), true, this.f33754c4.name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f33754c4.gender, "male"), new Runnable() { // from class: l.l1a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f125626a.m52062Ca(str, str2);
            }
        }, new Runnable() { // from class: l.n1a0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFrag.m51991m7();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: Db */
    public final /* synthetic */ void m52068Db(View view) {
        lra0.m151149h("button");
        m51073N6();
    }

    /* JADX INFO: renamed from: Dc */
    public final /* synthetic */ void m52069Dc(boolean z, List list) {
        MediaReorderCards mediaReorderCards = this.f33787k4.f81526v;
        mediaReorderCards.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (true) {
            if (i >= 6) {
                break;
            }
            mediaReorderCards.m50811h(i).setIllegalPicture(z && i < list.size());
            mediaReorderCards.m50811h(i).m50640C1(i < list.size() ? (Media) list.get(i) : null);
            mediaReorderCards.m50811h(i).setChangeAction(new g30() { // from class: l.t4a0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f167700a.m52064Cc((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (upa.m194825u2()) {
                mediaReorderCards.m50811h(i).m50644E1(i, "p_edit_profile_view");
                if (!this.f33660J1.get().booleanValue() && i == list.size()) {
                    mediaReorderCards.m50811h(i).m50666P1();
                    this.f33660J1.put(Boolean.TRUE);
                }
            }
            mediaReorderCards.m50811h(i).m50651I0(i);
            i++;
        }
        int size = list.size();
        if (size < 6) {
            m51955de(size, null, mediaReorderCards);
        }
    }

    /* JADX INFO: renamed from: Dd */
    public final void m52070Dd(User user) {
        m52076Ed(user, false);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: E */
    public void mo51056E() {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: E1 */
    public boolean mo52071E1() {
        return this.f33815r3;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: E2 */
    public j760<Integer, Integer> mo52072E2() {
        return this.f33730X1;
    }

    /* JADX INFO: renamed from: E9 */
    public final void m52073E9() {
        if (m52296na()) {
            if (!m52244dd()) {
                this.f33751c1.setViewLayoutType(3);
            } else {
                this.f33818s2 = true;
                xdl0.m208344M(this.f33751c1, false);
            }
        }
    }

    /* JADX INFO: renamed from: Eb */
    public final /* synthetic */ void m52074Eb(View view) {
        m52299nd();
    }

    /* JADX INFO: renamed from: Ec */
    public final /* synthetic */ void m52075Ec() {
        jg90 jg90Var = this.f33628D2;
        if (jg90Var instanceof wg90) {
            this.f33809q1.m52957o();
            this.f33625C4.m132658f(this.f33811q3, ((wg90) jg90Var).f186167X, this.f33809q1.f34157k, this, this.f33794m3, this.f33823t3, m52311pa(this.f33780j2) && NullChecker.m81303a(this.f33618B2.f34013J), this.f33618B2.f34013J);
        }
    }

    /* JADX INFO: renamed from: Ed */
    public final void m52076Ed(User user, boolean z) {
        m52044yd();
        m52065Cd(user.pictures, z);
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: F */
    public View mo52077F() {
        return m52244dd() ? this.f33714U0 : this.f33751c1;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: F1 */
    public User mo51058F1(boolean z) {
        if (!NullChecker.m81303a(wn90.m204602F().f187269a)) {
            CrashHelper.m81296c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        }
        return wn90.m204602F().f187269a;
    }

    /* JADX INFO: renamed from: F8 */
    public final void m52078F8() {
        if ((TextUtils.equals(this.f33823t3, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f33823t3, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO) || TextUtils.equals(this.f33823t3, CoreStaticData.ProfileFromType.FROM_THIN_POPUP)) && !this.f33764f2) {
            byte b = 1;
            this.f33764f2 = true;
            if (!upa.m194825u2()) {
                LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
                if (vwb.m200296J(LoopFragmentFactory.m51505z(loopCreateEntryType, null, m94569i2()))) {
                    return;
                }
                LoopFragmentFactory.m51477U(m94569i2(), this, null, loopCreateEntryType, this.f33823t3);
                return;
            }
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
            if (vwb.m200296J(LoopFragmentFactory.m51458B(loopCreateEntryType2, null, m94569i2(), true, true, this.f33823t3))) {
                return;
            }
            String str = this.f33823t3;
            str.getClass();
            switch (str.hashCode()) {
                case -338162810:
                    b = !str.equals(CoreStaticData.ProfileFromType.FROM_THIN_POPUP) ? (byte) -1 : (byte) 0;
                    break;
                case 182867647:
                    if (!str.equals(CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
                        b = -1;
                    }
                    break;
                case 1120730606:
                    b = !str.equals(CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    break;
                case 1:
                    loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_PROFILE_UPLOAD_PHOTO;
                    break;
                case 2:
                    loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD_UPLOAD_PHOTO;
                    break;
                default:
                    loopCreateEntryType2 = null;
                    break;
            }
            LoopFragmentFactory.m51477U(m94569i2(), this, null, loopCreateEntryType2, this.f33823t3);
        }
    }

    /* JADX INFO: renamed from: F9 */
    public final void m52079F9() {
        this.f33782j4.add(this.f33618B2);
        if (m52305oa()) {
            this.f33782j4.add(this.f33741Z2);
        }
        this.f33782j4.add(this.f33628D2);
        this.f33782j4.add(this.f33769g3);
        this.f33782j4.add(this.f33753c3);
        this.f33782j4.add(this.f33757d3);
        this.f33782j4.add(this.f33765f3);
        this.f33782j4.add(this.f33716U2);
        if (!User.ID_OFFICIAL_CHANNEL.equals(this.f33794m3) && !"from_guess_liker_result".equals(this.f33823t3)) {
            this.f33782j4.add(this.f33731X2);
        }
        if (!TextUtils.isEmpty(this.f33823t3) && (TextUtils.equals("home_card", this.f33823t3) || TextUtils.equals("share_profile", this.f33823t3) || TextUtils.equals("home_moment_theme_card", this.f33823t3))) {
            mo51075P1();
        }
        if (!mo51075P1()) {
            this.f33782j4.add(new l33(this, this));
        }
        this.f33782j4.add(this.f33840x4);
    }

    /* JADX INFO: renamed from: Fb */
    public final /* synthetic */ void m52080Fb() {
        gd70.m125540b().m125542d(act());
        startActivity(ProfileAct.m50738p2(act(), this.f33794m3, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: Fc */
    public final /* synthetic */ void m52081Fc(int i) {
        this.f33721V2.m145758Y(i);
    }

    /* JADX INFO: renamed from: Fd */
    public final void m52082Fd() {
        creates(new e30() { // from class: l.i2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110544a.m52087Gc((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f33690P1.f56011id)).map(new w9j() { // from class: l.j2a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.k2a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120703a.m52094Hc((PicVerification) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.m2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130913a.m52101Ic((PicVerification) obj);
            }
        }));
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: G */
    public void mo51060G(View... viewArr) {
        for (View view : viewArr) {
            xdl0.m208329E0(view, m52308od(this.f33780j2));
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: G0 */
    public boolean mo52083G0(User user) {
        if (user == null) {
            m51900Rd(CoreModule.m29932K().getUserById(this.f33794m3));
        }
        if (!this.f33798n3 && mo52289m3(user)) {
            return false;
        }
        if (!this.f33798n3 && this.f33831v3) {
            Relationship relationship = user.localRelationship;
            return relationship != null && TEnum.equals(relationship.state, "matched");
        }
        if (this.f33819s3) {
            return !this.f33811q3;
        }
        return false;
    }

    /* JADX INFO: renamed from: G8 */
    public final void m52084G8() {
        if (!TextUtils.equals(this.f33814r2.get("action"), SocialOperation.GAME_SIGNATURE) || this.f33764f2) {
            return;
        }
        this.f33764f2 = true;
        LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: G9 */
    public final void m52085G9() {
        this.f33648H.setVisibility(8);
        m52144P8();
        this.f33718V.setBackgroundColor(Color.parseColor("#ffffff"));
        xdl0.m208394p0(this.f33733Y);
        xdl0.m208394p0(this.f33699R0);
        xdl0.m208394p0(this.f33728X);
        this.f33733Y = null;
        this.f33699R0 = null;
        this.f33684O0 = null;
        this.f33632E0 = null;
        this.f33738Z = null;
    }

    /* JADX INFO: renamed from: Gb */
    public final /* synthetic */ void m52086Gb(d30 d30Var) {
        this.f33618B2.m52794K1(d30Var);
    }

    /* JADX INFO: renamed from: Gc */
    public final /* synthetic */ void m52087Gc(Bundle bundle) {
        m51882Nd(this.f33690P1);
        m51900Rd(this.f33690P1);
        this.f33793m2.m132487l(roj0.f160388a);
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: H0 */
    public void mo52088H0(int i) {
        this.f33705S1 = i;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: H1 */
    public View mo52089H1() {
        return (View) m52255fd(this.f33618B2.f34007G);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo51062H3() {
        return this.f33797n2;
    }

    /* JADX INFO: renamed from: H8 */
    public final void m52090H8() {
        xdl0.m208344M(this.f33733Y, false);
        if (NullChecker.m81303a(this.f33829v1)) {
            xdl0.m208344M(this.f33829v1, false);
        }
        xdl0.m208344M(this.f33771h1, false);
    }

    /* JADX INFO: renamed from: H9 */
    public final void m52091H9() {
        if ("from_intl_visitor".equals(this.f33823t3) || "from_intl_salvage".equals(this.f33823t3)) {
            xdl0.m208344M(this.f33684O0, false);
            xdl0.m208344M(this.f33738Z, false);
            xdl0.m208344M(this.f33632E0, false);
            if (NullChecker.m81303a(this.f33784k1)) {
                xdl0.m208344M(this.f33784k1, false);
            }
            if (NullChecker.m81303a(this.f33714U0)) {
                xdl0.m208344M(this.f33714U0, false);
            }
            duringCreated(CoreModule.f17545c.f19639e0.m169411L7(this.f33794m3)).subscribe(mkd0.m154956H(new e30() { // from class: l.p4a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147052a.m52286lc((List) obj);
                }
            }, new e30() { // from class: l.q4a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFrag.m51932Z6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ha */
    public final /* synthetic */ void m52092Ha(boolean z, Relationship relationship) {
        if (z) {
            this.f33752c2 = false;
            this.f33756d2 = true;
            if (NullChecker.m81303a(this.f33829v1) && xdl0.m208349O0(this.f33829v1)) {
                xdl0.m208344M(this.f33829v1, false);
                m52129Md(false);
            }
        } else {
            if (CoreModule.m29934N().mo60389so() && (m52145P9(this.f33823t3) || m52138O9())) {
                osi0.m165783g("喜欢已发送");
            }
            if (NullChecker.m81303a(this.f33829v1) && xdl0.m208349O0(this.f33829v1)) {
                m52129Md(false);
                xdl0.m208344M(this.f33829v1, false);
                xdl0.m208344M(this.f33792m1, true);
            }
            this.f33760e2 = false;
        }
        m52282kd(true);
        if (NullChecker.m81303a(this.f33632E0)) {
            xdl0.m208344M(this.f33632E0, false);
        }
    }

    /* JADX INFO: renamed from: Hb */
    public final /* synthetic */ void m52093Hb(View view) {
        zvf0.m220396r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        this.f33735Y1.m105113b();
    }

    /* JADX INFO: renamed from: Hc */
    public final /* synthetic */ Boolean m52094Hc(PicVerification picVerification) {
        return Boolean.valueOf(!this.f33690P1.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: Hd */
    public final void m52095Hd(@NonNull final RiskOtherData riskOtherData) {
        if (TextUtils.isEmpty(riskOtherData.text)) {
            return;
        }
        xdl0.m208344M(this.f33821t1, true);
        this.f33825u1.setText(riskOtherData.text);
        zvf0.m220368A("e_profile_safety_notice", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("user_risk_type", riskOtherData.type), vwb.m200311Y("risk_userid", userId()));
        xdl0.m208329E0(this.f33821t1, new View.OnClickListener() { // from class: l.i0a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110269a.m52108Jc(riskOtherData, view);
            }
        });
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: I1 */
    public boolean mo52096I1() {
        return !this.f33830v2;
    }

    /* JADX INFO: renamed from: I8 */
    public final void m52097I8() {
        xdl0.m208344M(this.f33733Y, false);
        boolean zM52291ma = m52291ma();
        VLinear vLinear = this.f33829v1;
        if (zM52291ma) {
            xdl0.m208344M(vLinear, true);
            m52129Md(true);
        } else {
            if (NullChecker.m81303a(vLinear)) {
                xdl0.m208344M(this.f33829v1, false);
            }
            xdl0.m208344M(this.f33771h1, true);
            m52129Md(false);
        }
        xdl0.m208329E0(this.f33771h1, new View.OnClickListener() { // from class: l.n4a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137055a.m52057Ba(view);
            }
        });
    }

    /* JADX INFO: renamed from: I9 */
    public boolean m52098I9() {
        User user;
        if (mo51119m0() || (user = this.f33780j2) == null || TextUtils.equals(user.f56011id, CoreModule.m29931H().userId())) {
            return false;
        }
        return this.f33780j2.isBannedNew() || this.f33780j2.isAccountCancellation();
    }

    /* JADX INFO: renamed from: Ia */
    public final /* synthetic */ void m52099Ia(boolean z, Throwable th) {
        if (z) {
            this.f33752c2 = false;
        } else {
            this.f33760e2 = false;
        }
        m52282kd(false);
    }

    /* JADX INFO: renamed from: Ib */
    public final /* synthetic */ void m52100Ib() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(userId())) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(userId()).m60124fp().profileSmall())) {
            CoreModule.f17545c.f19642f0.m32664Gp(act(), false, userId(), CoreModule.f17545c.f19639e0.m169524oa(userId()).m60124fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: Ic */
    public final /* synthetic */ void m52101Ic(PicVerification picVerification) {
        User user = this.f33690P1;
        user.verifications = picVerification;
        m51882Nd(user);
        m51900Rd(this.f33690P1);
        this.f33793m2.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Id */
    public final void m52102Id(boolean z) {
        act().startActivity(ReportAct.m54631d2(act(), this.f33794m3, "", z, new ResultReceiverC86926(null, z), "profile", TextUtils.equals("home_card", this.f33823t3)));
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: J */
    public View mo52103J() {
        return this.f33738Z;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo51066J1() {
        return this;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo51067J3() {
        if (this.f33785k2 == null || this.f33780j2 == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f33793m2.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: J8 */
    public final void m52104J8() {
        if (m52145P9(this.f33823t3) || m52138O9()) {
            if (!CoreModule.m29934N().mo60332Wm() || m52318qa()) {
                xdl0.m208344M(this.f33771h1, false);
                return;
            }
            this.f33746a4 = false;
            this.f33775i1.setBackground(act().getResources().getDrawable(x2c0.f189299Eh));
            this.f33779j1.setImageDrawable(act().getResources().getDrawable(x2c0.f189518Lh));
            VLinear vLinear = this.f33841y1;
            if (vLinear != null && this.f33846z1 != null) {
                vLinear.setBackground(act().getResources().getDrawable(x2c0.f189299Eh));
                this.f33846z1.setImageDrawable(act().getResources().getDrawable(x2c0.f189518Lh));
            }
            boolean zM52291ma = m52291ma();
            VLinear vLinear2 = this.f33829v1;
            if (zM52291ma) {
                xdl0.m208344M(vLinear2, true);
                m52129Md(true);
            } else {
                if (NullChecker.m81303a(vLinear2)) {
                    xdl0.m208344M(this.f33829v1, false);
                }
                xdl0.m208344M(this.f33771h1, true);
                m52129Md(false);
            }
        }
    }

    /* JADX INFO: renamed from: J9 */
    public boolean m52105J9() {
        if (!NullChecker.m81303a(vwb.m200346r(CoreModule.m29934N().mo60278Gm(), new w9j() { // from class: l.h2a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105505a.m52293mc((String) obj);
            }
        }))) {
            return this.f33742Z3;
        }
        this.f33742Z3 = false;
        return false;
    }

    /* JADX INFO: renamed from: Ja */
    public final /* synthetic */ void m52106Ja(boolean z) {
        if (z) {
            this.f33752c2 = true;
        } else {
            this.f33760e2 = true;
        }
    }

    /* JADX INFO: renamed from: Jb */
    public final /* synthetic */ void m52107Jb() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(userId())) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(userId()).m60124fp().profileSmall())) {
            CoreModule.f17545c.f19642f0.m32664Gp(act(), true, userId(), CoreModule.f17545c.f19639e0.m169524oa(userId()).m60124fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: Jc */
    public final /* synthetic */ void m52108Jc(RiskOtherData riskOtherData, View view) {
        wc80.m202636e().m202649q(uc80.m192995a(new gwp(act())));
        zvf0.m220399u("e_profile_safety_notice", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("user_risk_type", riskOtherData.type));
    }

    /* JADX INFO: renamed from: Jd */
    public final void m52109Jd() {
        this.f33757d3.m208599V(false);
        this.f33765f3.m208599V(false);
        this.f33753c3.m208599V(false);
        this.f33769g3.m208599V(false);
        this.f33761e3.m208599V(false);
    }

    @Override // p149l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo51069K2() {
        if (this.f33780j2 == null && !mo52130N2()) {
            m51900Rd(CoreModule.m29932K().getUserById(this.f33794m3));
        }
        if (this.f33780j2 == null && !m52252fa()) {
            CrashHelper.m81297d(new IllegalStateException("profilelist user is null id " + userId() + " from : " + from() + " afterGetUserInfo : " + this.f33844y4), 1000);
        }
        return this.f33780j2;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: K3 */
    public int mo52110K3() {
        return this.f33700R1;
    }

    /* JADX INFO: renamed from: K8 */
    public void m52111K8() {
        xdl0.m208344M(this.f33728X, (NullChecker.m81303a(this.f33755d1) && xdl0.m208349O0(this.f33755d1)) || (NullChecker.m81303a(this.f33771h1) && xdl0.m208349O0(this.f33771h1)) || ((NullChecker.m81303a(this.f33751c1) && xdl0.m208349O0(this.f33751c1)) || (NullChecker.m81303a(this.f33784k1) && xdl0.m208349O0(this.f33784k1))));
    }

    /* JADX INFO: renamed from: K9 */
    public final boolean m52112K9() {
        return (!upa.m194633F1() || this.f33802o3 || TextUtils.isEmpty(this.f33794m3) || !CoreModule.f17545c.f19642f0.m33158vh(this.f33794m3) || m52224aa()) ? false : true;
    }

    /* JADX INFO: renamed from: Ka */
    public final /* synthetic */ void m52113Ka(GreetingPermission greetingPermission) {
        if (TextUtils.equals(this.f33823t3, "impress_signal") || TextUtils.equals(this.f33823t3, "from_pin_like")) {
            return;
        }
        if (!NullChecker.m81303a(greetingPermission) || !greetingPermission.enable || !NullChecker.m81303a(CoreModule.m29932K().getUserById(this.f33794m3))) {
            if (CoreModule.m29934N().mo60267Co()) {
                m52194Vd();
                return;
            } else {
                this.f33751c1.setViewLayoutType(2);
                m52149Pd(mo51069K2(), false);
                return;
            }
        }
        if (CoreModule.m29934N().mo60267Co()) {
            m52194Vd();
            return;
        }
        if (TextUtils.equals(this.f33823t3, "impress_signal")) {
            return;
        }
        xdl0.m208344M(this.f33632E0, false);
        xdl0.m208344M(this.f33751c1, false);
        this.f33751c1.setViewLayoutType(1);
        this.f33751c1.mo56287q(act(), this.f33823t3, CoreModule.m29932K().getUserById(this.f33794m3), new u2a0(this), m52358wd());
        xdl0.m208344M(this.f33751c1, true);
        m52149Pd(mo51069K2(), false);
    }

    /* JADX INFO: renamed from: Kb */
    public final /* synthetic */ void m52114Kb() {
        zvf0.m220399u("e_blacklist", "p_user_profile_more_popup", j760.m140076a("blacklist_management", "add"));
        CoreModule.m29934N().mo60305Pf(act(), this.f33780j2, CoreModule.m29934N().mo60288Kk(this.f33780j2));
    }

    /* JADX INFO: renamed from: Kc */
    public final /* synthetic */ void m52115Kc(roj0 roj0Var) {
        if (TextUtils.equals(this.f33823t3, "home_card")) {
            act().setResult(SwipeDirection.RIGHT.getValue());
            act().m66873d2();
        } else {
            xdl0.m208344M(this.f33724W0, false);
            xdl0.m208344M(this.f33719V0, false);
        }
    }

    /* JADX INFO: renamed from: Kd */
    public final void m52116Kd() {
        if (TextUtils.isEmpty(this.f33729X0.getText().toString().trim())) {
            return;
        }
        zvf0.m220399u("e_new_profile_message_send", pageId(), j760.m140076a("matched_left_time", m52203X8()));
        Message messageNew_ = Message.new_();
        messageNew_.value = this.f33729X0.getText().toString().trim();
        messageNew_.messageType = MessageType.get("text");
        this.f33729X0.setText("");
        if (TextUtils.equals(this.f33823t3, "home_card")) {
            CoreModule.f17545c.f19642f0.f19887P1 = userId();
        }
        act().hideInput();
        duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32623Dn(userId(), messageNew_, null).flatMap(new w9j() { // from class: l.k0a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.l0a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125482a.m52115Kc((roj0) obj);
            }
        }, new e30() { // from class: l.m0a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFrag.m51995n7((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L8 */
    public x9j<Boolean, Boolean, Boolean> m52117L8(final String str, final String str2) {
        return new x9j() { // from class: l.g0a0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f100030a.m52067Da(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: La */
    public final /* synthetic */ void m52118La() {
        this.f33618B2.f34062x.m223140b0();
    }

    /* JADX INFO: renamed from: Lb */
    public final /* synthetic */ void m52119Lb() {
        zvf0.m220399u("e_blacklist", "p_user_profile_more_popup", j760.m140076a("blacklist_management", Action.remove));
        CoreModule.m29934N().mo60305Pf(act(), this.f33780j2, CoreModule.m29934N().mo60288Kk(this.f33780j2));
    }

    /* JADX INFO: renamed from: Lc */
    public final /* synthetic */ void m52120Lc(int i, boolean z) {
        this.f33618B2.m52793J1(i, z);
    }

    /* JADX INFO: renamed from: Ld */
    public final void m52121Ld(final User user) {
        xdl0.m208329E0(this.f33669L0, new View.OnClickListener() { // from class: l.x3a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190876a.m52148Pc(user, view);
            }
        });
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: M */
    public boolean mo52122M() {
        if (upa.m194706V1()) {
            return TextUtils.equals(this.f33823t3, "chat_group_anonymity") || TextUtils.equals(this.f33823t3, "chat_group");
        }
        return false;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: M0 */
    public View mo52123M0() {
        return this.f33648H;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: M8, reason: merged with bridge method [inline-methods] */
    public ArrayList<j760<String, d30>> mo29633C4() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.m200311Y("user id", new d30() { // from class: l.n2a0
            @Override // p149l.d30
            public final void call() {
                this.f136780a.m51848Ea();
            }
        }));
        arrayList.add(vwb.m200311Y("用户位置信息", new d30() { // from class: l.o2a0
            @Override // p149l.d30
            public final void call() {
                this.f141517a.m51852Fa();
            }
        }));
        arrayList.add(vwb.m200311Y("mock 共同联系人", new d30() { // from class: l.p2a0
            @Override // p149l.d30
            public final void call() {
                this.f146826a.m51856Ga();
            }
        }));
        arrayList.add(vwb.m200311Y("认证气泡本地数据清理：" + CoreModule.f17545c.f19639e0.f149460r2.get() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17545c.f19639e0.f149453q2.get(), new d30() { // from class: l.q2a0
            @Override // p149l.d30
            public final void call() {
                ProfileListFrag.m51954d8();
            }
        }));
        arrayList.add(vwb.m200311Y("弹出先发like弹窗", new d30() { // from class: l.r2a0
            @Override // p149l.d30
            public final void call() {
                xdx.m208433A().m208464N(CoreModule.m29932K().me_().f56011id);
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: M9 */
    public final boolean m52125M9() {
        User user;
        if (TextUtils.isEmpty(this.f33794m3) || (user = this.f33780j2) == null || user.isMe()) {
            return false;
        }
        if (this.f33754c4 == null) {
            this.f33754c4 = CoreModule.m29934N().getUserById(this.f33794m3);
        }
        return CoreModule.m29934N().mo60371mn(this.f33780j2) || CoreModule.m29934N().mo60371mn(this.f33754c4);
    }

    /* JADX INFO: renamed from: Ma */
    public final /* synthetic */ void m52126Ma(Boolean bool) {
        m52052Ad(true);
    }

    /* JADX INFO: renamed from: Mb */
    public final /* synthetic */ void m52127Mb(boolean z, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (TextUtils.equals(c22545a.f209159a.toString(), "分享给朋友看看")) {
            zvf0.m220396r("e_share_to_third_app", "p_user_profile_more_popup");
            if (f9k0.m120090c(userId())) {
                lsi0.m151595y("此用户不可被分享");
            } else {
                ark.m98451U0(act(), "share_bottom", new d30() { // from class: l.q1a0
                    @Override // p149l.d30
                    public final void call() {
                        this.f152118a.m52100Ib();
                    }
                }, new d30() { // from class: l.r1a0
                    @Override // p149l.d30
                    public final void call() {
                        this.f157256a.m52107Jb();
                    }
                });
            }
        } else if (TextUtils.equals(c22545a.f209159a.toString(), act().getString(R$string.f18868r))) {
            m52102Id(z);
        } else if (TextUtils.equals(c22545a.f209159a.toString(), "取消喜欢")) {
            zvf0.m220399u("e_unlike", "p_user_profile_more_popup", vwb.m200311Y("unlike_from", "profile"), vwb.m200311Y("other_user_id", NullChecker.m81303a(this.f33780j2) ? this.f33780j2.f56011id : ""));
            CoreModule.m29934N().mo60318T7(act(), this.f33780j2, this.f33823t3, null);
        } else if (TextUtils.equals(c22545a.f209159a.toString(), "取消关注")) {
            CoreModule.m29934N().mo60330Vp(act(), this.f33780j2, this.f33823t3);
        } else if (TextUtils.equals(c22545a.f209159a.toString(), act().getString(R$string.f18568h5))) {
            m52171Sd(act(), act().getString(R$string.f19081y2), act().getString(R$string.f18568h5), m52172T8(), new d30() { // from class: l.s1a0
                @Override // p149l.d30
                public final void call() {
                    this.f161871a.m52114Kb();
                }
            });
        } else if (TextUtils.equals(c22545a.f209159a.toString(), act().getString(R$string.f18991v2))) {
            m52171Sd(act(), act().getString(R$string.f19081y2), act().getString(R$string.f18991v2), m52287ld(NullChecker.m81303a(this.f33780j2) && this.f33780j2.isFemale()), new d30() { // from class: l.t1a0
                @Override // p149l.d30
                public final void call() {
                    this.f167299a.m52119Lb();
                }
            });
        }
        this.f33735Y1.m105113b();
    }

    /* JADX INFO: renamed from: Mc */
    public final /* synthetic */ void m52128Mc(int i, boolean z) {
        this.f33618B2.m52793J1(i, z);
    }

    /* JADX INFO: renamed from: Md */
    public void m52129Md(boolean z) {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: N2 */
    public boolean mo52130N2() {
        return this.f33790l3;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: N3 */
    public View mo52131N3() {
        return this.f33747b1;
    }

    /* JADX INFO: renamed from: N8 */
    public User m52132N8() {
        if (IntlCountryCodeController.m28116l() && !yij0.m214932J(m94569i2().profile.studies.qualification) && !m94569i2().profile.studies.active) {
            wn90.m204602F().f187269a.profile.studies.school = "";
        }
        if (NullChecker.m81303a(wn90.m204602F().f187269a) && this.f33832v4.m108241V()) {
            wn90.m204602F().f187269a.profile.extensions.momentSwitch.noSyncMoment.clear();
            wn90.m204602F().f187269a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f33832v4.m108240U() ? "false" : "true");
        }
        User userMo223809clone = wn90.m204602F().f187269a.mo223809clone();
        userMo223809clone.settings = null;
        return userMo223809clone.subtract(this.f33780j2);
    }

    /* JADX INFO: renamed from: Na */
    public final /* synthetic */ void m52133Na(roj0 roj0Var) {
        this.f33754c4 = CoreModule.m29934N().getUserById(this.f33794m3);
        m52052Ad(false);
    }

    /* JADX INFO: renamed from: Nb */
    public final /* synthetic */ void m52134Nb() {
        ArrayList arrayList = new ArrayList();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_user_profile_more_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("other_user_id", NullChecker.m81303a(this.f33780j2) ? this.f33780j2.f56011id : ""));
        if (m52263ha()) {
            arrayList.add("分享给朋友看看");
        }
        if (CoreModule.m29934N().mo60389so()) {
            cwf0VarM133794c.m109040p(vwb.m200311Y("share_pop_from_which", "profile"));
            if (m52279ka()) {
                arrayList.add("取消喜欢");
            } else if (m52125M9()) {
                arrayList.add("取消关注");
            }
        }
        arrayList.add(act().getString(R$string.f18868r));
        if (m52145P9(this.f33823t3) || m52153Q9()) {
            if (CoreModule.m29934N().mo60288Kk(this.f33780j2)) {
                cwf0VarM133794c.m109040p(vwb.m200311Y("blacklist_management", Action.remove));
                arrayList.add(act().getString(R$string.f18991v2));
            } else {
                cwf0VarM133794c.m109040p(vwb.m200311Y("blacklist_management", "add"));
                arrayList.add(act().getString(R$string.f18568h5));
            }
        }
        int iIndexOf = arrayList.indexOf(act().getString(R$string.f18868r));
        i0e.m133797f(cwf0VarM133794c);
        c40.C16057b c16057b = new c40.C16057b(getContext());
        final boolean zMo52083G0 = mo52083G0(mo51069K2());
        c16057b.m105167T(new DialogInterface.OnDismissListener() { // from class: l.g1a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m105156I(act().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.h1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105292a.m52093Hb(view);
            }
        }).m105164Q(arrayList).m105165R(new int[]{iIndexOf}, new int[]{w0c0.f183782L}).m105169V(new c40.InterfaceC16059d() { // from class: l.i1a0
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f110434a.m52127Mb(zMo52083G0, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f33735Y1 = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: Nc */
    public final /* synthetic */ void m52135Nc(User user, String str) {
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", user.f56011id);
        intent.putExtra("heart_confession_content", str);
        m52368y8(SwipeDirection.UP.getValue(), intent);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: O1 */
    public boolean mo52136O1() {
        return m52160R9();
    }

    /* JADX INFO: renamed from: O8 */
    public final User m52137O8() {
        User userMo223809clone = this.f33780j2.mo223809clone();
        if (this.f33832v4.m108241V()) {
            userMo223809clone.profile.extensions.momentSwitch.noSyncMoment.clear();
            userMo223809clone.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f33832v4.m108240U() ? "false" : "true");
        }
        return userMo223809clone.subtract(this.f33780j2);
    }

    /* JADX INFO: renamed from: O9 */
    public final boolean m52138O9() {
        return TextUtils.equals(this.f33823t3, "from_conversation_search_view");
    }

    /* JADX INFO: renamed from: Oa */
    public final /* synthetic */ void m52139Oa(View view) {
        m52227ae();
    }

    /* JADX INFO: renamed from: Ob */
    public final /* synthetic */ void m52140Ob(d30 d30Var) {
        this.f33618B2.m52796L1(d30Var, null);
    }

    /* JADX INFO: renamed from: Oc */
    public final /* synthetic */ void m52141Oc(final User user, final String str) {
        if (u59.m191827f0()) {
            fap.m120263t(act(), "intl_letter_profile", new d30() { // from class: l.f1a0
                @Override // p149l.d30
                public final void call() {
                    this.f94059a.m52135Nc(user, str);
                }
            });
            return;
        }
        if (!tkp.m189529d()) {
            swh0.m186264s1(act(), "intl_letter_profile");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", user.f56011id);
        intent.putExtra("heart_confession_content", str);
        m52368y8(SwipeDirection.UP.getValue(), intent);
    }

    /* JADX INFO: renamed from: Od */
    public void m52142Od() {
        String str;
        this.pageHelper.m109041q(pageId());
        C8829f.m54696b().m54701f(this.f33823t3);
        if (this.f33802o3) {
            return;
        }
        String str2 = this.f33794m3;
        String strRelativeTimeForTrack = "";
        if (TextUtils.equals("home_card", this.f33823t3) || TextUtils.equals("from_city_center_conv_banner", this.f33823t3)) {
            str = "home";
        } else {
            str = (TextUtils.equals("home_menu", this.f33823t3) || this.f33802o3) ? "" : "other";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f33798n3 ? "true" : "false");
            User userById = CoreModule.m29932K().getUserById(this.f33794m3);
            boolean z = false;
            if (NullChecker.m81303a(userById)) {
                if (!userById.location.isHideUpdateTime() && !userById.isMe() && !CoreModule.f17545c.f19561E0.m203801x3(userById) && (userById.isMe() || User.isMatched(this.f33780j2) || mqi0.m155944o() - userById.location.updatedTime <= 1.728E8d)) {
                    strRelativeTimeForTrack = userById.relativeTimeForTrack();
                }
                Relationship relationship = userById.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    jSONObject.put("is_match", 0);
                } else {
                    jSONObject.put("is_match", 1);
                }
                jSONObject.put("distance", m51899R8(userById));
                jSONObject.put("lastactivity_time", strRelativeTimeForTrack);
            }
            jSONObject.put("refer_source", m51934Z8(this.f33823t3));
            if (TextUtils.equals("from_city_center_conv_banner", this.f33823t3) || (NullChecker.m81303a(this.f33780j2) && this.f33780j2.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            this.pageHelper.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: P */
    public boolean mo52143P(String str) {
        return false;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo51075P1() {
        return this.f33798n3;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: P8 */
    public final void m52144P8() {
        if (this.f33802o3) {
            this.f33718V.setFocusableInTouchMode(true);
            this.f33718V.setDescendantFocusability(131072);
            this.f33718V.setFocusable(true);
        }
    }

    /* JADX INFO: renamed from: P9 */
    public final boolean m52145P9(String str) {
        return CoreModule.m29934N().mo60308Qm(str);
    }

    /* JADX INFO: renamed from: Pa */
    public final /* synthetic */ void m52146Pa(View view) {
        m52266hd();
    }

    /* JADX INFO: renamed from: Pb */
    public final /* synthetic */ void m52147Pb(User user) {
        m51882Nd(user);
        m51900Rd(user);
        this.f33793m2.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Pc */
    public final /* synthetic */ void m52148Pc(final User user, View view) {
        if (user == null) {
            user = this.f33780j2;
        }
        tkp.m189532g(act(), user, new e30() { // from class: l.m4a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131268a.m52141Oc(user, (String) obj);
            }
        }, "intl_letter_profile");
        zvf0.m220399u("liked_users".equals(this.f33823t3) ? "e_iliked_letter" : "e_letter_bar", pageId(), j760.m140076a("is_privileged", cll0.m107558e(swh0.m186191G())));
    }

    /* JADX INFO: renamed from: Pd */
    public final void m52149Pd(User user, boolean z) {
        if (user == null) {
            user = this.f33780j2;
        }
        final User user2 = user;
        this.f33751c1.mo56284H(user2, z, z ? new e30() { // from class: l.s2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161968a.m52163Rc(user2, (String) obj);
            }
        } : new e30() { // from class: l.t2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167454a.m52170Sc(user2, (String) obj);
            }
        }, new u2a0(this), this.f33823t3);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Q */
    public boolean mo52150Q() {
        if ("from_guess_liker_result".equals(this.f33823t3) || m52197W9() || !CoreModule.m29934N().mo60267Co()) {
            return false;
        }
        return m52201Wd();
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: Q2 */
    public View mo52151Q2() {
        return (View) m52255fd(this.f33618B2.f34063y);
    }

    /* JADX INFO: renamed from: Q8 */
    public final void m52152Q8() {
        xh0 xh0Var = this.f33750b4;
        if (xh0Var == null) {
            return;
        }
        xh0Var.m208717c();
        this.f33750b4 = null;
    }

    /* JADX INFO: renamed from: Q9 */
    public boolean m52153Q9() {
        return TextUtils.equals(this.f33823t3, "from_find_partner");
    }

    /* JADX INFO: renamed from: Qa */
    public final /* synthetic */ void m52154Qa(View view) {
        m52276jd();
    }

    /* JADX INFO: renamed from: Qb */
    public final /* synthetic */ void m52155Qb(roj0 roj0Var) {
        m51900Rd(mo51069K2());
        m51882Nd(CoreModule.m29932K().me_());
        if (this.f33780j2 == null || this.f33785k2 == null) {
            return;
        }
        this.f33793m2.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Qc */
    public final /* synthetic */ void m52156Qc(int i) {
        this.f33628D2.f117758v.setVisibility(i);
    }

    /* JADX INFO: renamed from: Qd */
    public final void m52157Qd() {
        if (IntlCountryCodeController.m28126v()) {
            xdl0.m208357U(this.f33644G0, t100.m186890d(1.0f));
            xdl0.m208359W(this.f33644G0, t100.m186890d(1.0f));
            this.f33644G0.setImageDrawable(act().getResources().getDrawable(x2c0.f189518Lh));
            VImage vImage = this.f33846z1;
            if (vImage != null) {
                xdl0.m208357U(vImage, t100.m186890d(1.0f));
                xdl0.m208359W(this.f33846z1, t100.m186890d(1.0f));
                this.f33846z1.setImageDrawable(act().getResources().getDrawable(x2c0.f189518Lh));
            }
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo51078R() {
        return CoreModule.f17545c.f19663m0.f19463x0.get().booleanValue();
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo51079R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: R1 */
    public void mo52158R1(final int i) {
        this.f33721V2.mo131811a(new d30() { // from class: l.z3a0
            @Override // p149l.d30
            public final void call() {
                this.f201327a.m52081Fc(i);
            }
        });
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: R2 */
    public View mo52159R2() {
        return (View) m52255fd(this.f33618B2.f34021N);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public void m52338tc() {
        LiveService liveService;
        if (mo52366y2() && NullChecker.m81303a(this.f33618B2.f34053g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f33618B2;
            profileImagesItemHolder.m52814V0(profileImagesItemHolder.f34053g1, false);
        }
        if (CoreModule.m29934N().mo60285K8()) {
            CoreModule.m29934N().mo60275Fm(userId(), m52105J9());
        }
        act().m66873d2();
        if (rlt.m179882c(this.f33823t3) && !this.f33781j3 && (liveService = qib0.f154713b0.f139232c) != null) {
            liveService.mo67244Tc(act(), this.f33794m3, true);
        }
        if (m52257ga()) {
            this.f33637F.getViewTreeObserver().removeOnGlobalLayoutListener(this.f33737Y3);
        }
    }

    /* JADX INFO: renamed from: R9 */
    public final boolean m52160R9() {
        return "home_card".equals(this.f33823t3);
    }

    /* JADX INFO: renamed from: Ra */
    public final /* synthetic */ void m52161Ra(View view) {
        if (!this.f33746a4) {
            m52276jd();
        } else {
            zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, pageId(), vwb.m200311Y("moments_user_id", this.f33794m3));
            yz9.m216604A(act(), this.f33780j2, true, null, LikeFrom.get("moment"), null, null, false, null);
        }
    }

    /* JADX INFO: renamed from: Rb */
    public final /* synthetic */ C22306c m52162Rb() {
        return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(this.f33794m3), CoreModule.f17545c.f19639e0.m169523o9(), new g5a0());
    }

    /* JADX INFO: renamed from: Rc */
    public final /* synthetic */ void m52163Rc(User user, String str) {
        m52062Ca(str, user.f56011id);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: S */
    public boolean mo51082S() {
        return false;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: S1 */
    public View mo52164S1() {
        return this.f33632E0;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: S2 */
    public void mo52165S2(boolean z) {
        this.f33715U1 = z;
    }

    /* JADX INFO: renamed from: S8 */
    public void m52166S8(String str, String str2, final boolean z) {
        String str3;
        if (NullChecker.m81303a(this.f33754c4)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iMo52232c0 = mo52232c0();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iMo52232c0;
            swipeExtraScData.picUploads = this.f33754c4.pictures.size();
            if (NullChecker.m81303a(this.f33780j2) && this.f33780j2.pictures.size() != this.f33754c4.pictures.size()) {
                CrashHelper.m81296c(new IllegalStateException(" profilelist picture size diff , user  " + this.f33780j2.f56011id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f33780j2.pictures.size() + " withRelation " + this.f33754c4.f56011id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f33754c4.pictures.size()));
            }
            int size = this.f33754c4.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iMo52232c0 >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = this.f33754c4.pictures.get(iMo52232c0).url;
            }
            Act act = act();
            User user = this.f33754c4;
            if (TextUtils.isEmpty(str)) {
                str3 = z ? "p_profile,superlike" : "p_home,likelimit";
            } else {
                str3 = "p_profile,letter";
            }
            if (qer.m174244o(act, user, true, z, false, str3, m52117L8(str, str2), new e30() { // from class: l.x4a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f190958a.m52092Ha(z, (Relationship) obj);
                }
            }, new e30() { // from class: l.y4a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195923a.m52099Ia(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, str, str2, new d30() { // from class: l.a5a0
                @Override // p149l.d30
                public final void call() {
                    this.f67643a.m52106Ja(z);
                }
            })) {
                if (z) {
                    this.f33752c2 = true;
                } else {
                    this.f33760e2 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: S9 */
    public boolean m52167S9() {
        return TextUtils.equals(this.f33823t3, "from_intl_meet");
    }

    /* JADX INFO: renamed from: Sa */
    public final /* synthetic */ void m52168Sa() {
        if (this.f33751c1.m104867x() || this.f33684O0 == null) {
            return;
        }
        rxg0.m181561H(this.f33638F0);
        myc0.m157001d0().f136285j.add(userId());
        myc0.m157001d0().m157010l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Sb */
    public final /* synthetic */ void m52169Sb(j760 j760Var) {
        if (!"home_card".equals(this.f33823t3) || this.f33822t2 == null) {
            m51900Rd((User) j760Var.f116564a);
            m51882Nd((User) j760Var.f116565b);
            this.f33793m2.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: Sc */
    public final /* synthetic */ void m52170Sc(User user, String str) {
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", user.f56011id);
        intent.putExtra("heart_confession_content", str);
        if (m52210Y9() || m52217Z9() || m52235ca() || m52241da() || m52229ba() || m52252fa() || m52173T9() || m52167S9()) {
            intent.putExtra("currentUserId", this.f33780j2.f56011id);
        }
        m52368y8(SwipeDirection.UP.getValue(), intent);
    }

    /* JADX INFO: renamed from: Sd */
    public final void m52171Sd(Act act, String str, String str2, String str3, final d30 d30Var) {
        xh0.C21150a c21150a = new xh0.C21150a(act);
        xh0.C21150a c21150aM208731j = c21150a.m208731j(str3);
        if (TextUtils.isEmpty(str)) {
            str = act.getString(R$string.f18136T);
        }
        c21150aM208731j.m208739r(str).m208736o(new View.OnClickListener() { // from class: l.u1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172980a.m52176Tc(d30Var, view);
            }
        }).m208726e(R$string.f18408c).m208734m(new DialogInterface.OnDismissListener() { // from class: l.v1a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ProfileListFrag.m51998o5(dialogInterface);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.w1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183982a.m52185Uc(view);
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            c21150a.m208740s(str2);
        }
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f33750b4 = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: T8 */
    public String m52172T8() {
        return CoreModule.m29932K().mo30742a().mo165299F() ? "拉黑后，ta不能对你关注、评论、点赞、打招呼，你可在“设置-隐私和通知-黑名单”内解除拉黑，是否确认要拉黑？" : act().getString(R$string.f18599i5);
    }

    /* JADX INFO: renamed from: T9 */
    public boolean m52173T9() {
        return TextUtils.equals(this.f33823t3, "from_intl_meet_likers");
    }

    /* JADX INFO: renamed from: Ta */
    public final /* synthetic */ void m52174Ta() {
        Act act = act();
        if (act != null) {
            C8455a.m47588w().m47607T(act, this.f33637F, this.f33612A1, 3000);
        }
    }

    /* JADX INFO: renamed from: Tb */
    public final /* synthetic */ Boolean m52175Tb(j760 j760Var) {
        return Boolean.valueOf(NullChecker.m81303a(j760Var) && TextUtils.equals((CharSequence) j760Var.f116564a, this.f33794m3));
    }

    /* JADX INFO: renamed from: Tc */
    public final /* synthetic */ void m52176Tc(d30 d30Var, View view) {
        m52152Q8();
        d30Var.call();
    }

    /* JADX INFO: renamed from: Td */
    public final void m52177Td() {
        if (NullChecker.m81303a(this.f33635E3) && this.f33635E3.showCountdownSendMsg) {
            this.f33810q2 = CoreModule.f17545c.f19642f0.f19865I0.get().longValue();
            xdl0.m208344M(this.f33724W0, true);
            xdl0.m208344M(this.f33719V0, true);
            xdl0.m208329E0(this.f33734Y0, new View.OnClickListener() { // from class: l.uy90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178839a.m52193Vc(view);
                }
            });
            xdl0.m208329E0(this.f33729X0, new View.OnClickListener() { // from class: l.vy90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183508a.m52200Wc(view);
                }
            });
            duringCreated(CoreModule.f17545c.f19642f0.m32737Ne(this.f33794m3)).subscribe(mkd0.m154955G(new e30() { // from class: l.wy90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188552a.m52207Xc((Conversation) obj);
                }
            }));
            bt0.m103743p(this.f33719V0, "alpha", 0L, 250L, null, 0.0f, 1.0f).start();
            zvf0.m220402x("e_new_profile_message_input", pageId());
            zvf0.m220368A("e_new_profile_message_send", pageId(), j760.m140076a("matched_left_time", m52203X8()));
            xdl0.m208344M(this.f33751c1, false);
            xdl0.m208344M(this.f33755d1, false);
            xdl0.m208344M(this.f33771h1, false);
            xdl0.m208344M(this.f33771h1, false);
            xdl0.m208344M(this.f33694Q0, false);
            xdl0.m208344M(this.f33728X, false);
        }
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: U */
    public xdl0.C21104g mo52178U() {
        int childCount = this.f33718V.getChildCount();
        RecyclerView recyclerView = this.f33718V;
        return childCount > 2 ? xdl0.m208380i0(recyclerView.getChildAt(1)) : xdl0.m208380i0(recyclerView);
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: U0 */
    public PictureView mo52179U0() {
        return this.f33618B2.m52803P0();
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: U2 */
    public void mo52180U2() {
        this.f33762e4 = true;
        m52240d9();
        if (this.f33723W.getVisibility() == 0) {
            this.f33723W.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: U8, reason: merged with bridge method [inline-methods] */
    public void m52062Ca(String str, String str2) {
        m52166S8(str, str2, true);
    }

    /* JADX INFO: renamed from: U9 */
    public boolean m52182U9() {
        return TextUtils.equals(this.f33823t3, "from_intl_visitor");
    }

    /* JADX INFO: renamed from: Ua */
    public final /* synthetic */ void m52183Ua() {
        int iM156188K;
        mt90 mt90Var = this.f33777i3;
        if (mt90Var != null && (iM156188K = mt90Var.m156188K()) >= 0) {
            this.f33718V.scrollToPosition(iM156188K);
            if (NullChecker.m81303a(this.f33748b2)) {
                this.f33748b2.scrollToPositionWithOffset(iM156188K, 0);
            }
        }
    }

    /* JADX INFO: renamed from: Ub */
    public final /* synthetic */ void m52184Ub(View view) {
        this.f33632E0.callOnClick();
    }

    /* JADX INFO: renamed from: Uc */
    public final /* synthetic */ void m52185Uc(View view) {
        m52152Q8();
    }

    /* JADX INFO: renamed from: Ud */
    public void m52186Ud(final int i) {
        new xh0.C21150a(act()).m208740s(m20604x4(R$string.f18013Oq)).m208728g(false).m208730i(R$string.f17983Nq).m208738q(R$string.f17953Mq).m208736o(new View.OnClickListener() { // from class: l.b5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73459a.m52213Yc(i, view);
            }
        }).m208726e(R$string.f18408c).m208722a().m208721g();
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: V0 */
    public void mo52187V0(boolean z) {
        this.f33725W1 = z;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: V2 */
    public RelationshipStatus mo52188V2() {
        return this.f33619B3;
    }

    /* JADX INFO: renamed from: V8 */
    public MediaReorderCard m52189V8(int i) {
        return this.f33787k4.f81526v.m50811h(i);
    }

    /* JADX INFO: renamed from: V9 */
    public boolean m52190V9() {
        return "liked_users".equals(this.f33823t3);
    }

    /* JADX INFO: renamed from: Va */
    public final /* synthetic */ void m52191Va(View view) {
        zvf0.m220396r("e_user_info_greet_to_city_cover", pageId());
        C8360d.m45896e(act(), this.f33707S3.userId);
    }

    /* JADX INFO: renamed from: Vb */
    public final /* synthetic */ void m52192Vb(RelationshipStatus relationshipStatus) {
        if (TEnum.equals(relationshipStatus, RelationshipStatus.get("matched"))) {
            if (NullChecker.m81303a(this.f33733Y)) {
                xdl0.m208344M(this.f33733Y, false);
            }
            xdl0.m208344M(this.f33714U0, false);
            if (NullChecker.m81303a(this.f33751c1)) {
                xdl0.m208344M(this.f33751c1, false);
            }
            if (CoreModule.m29934N().mo60332Wm() && NullChecker.m81303a(this.f33632E0)) {
                xdl0.m208344M(this.f33632E0, false);
            }
            if (NullChecker.m81303a(this.f33728X)) {
                xdl0.m208344M(this.f33728X, false);
                return;
            }
            return;
        }
        if (!TEnum.equals(relationshipStatus, RelationshipStatus.get("liked"))) {
            if (TEnum.equals(relationshipStatus, RelationshipStatus.get("superliked"))) {
                if (this.f33818s2) {
                    xdl0.m208344M(this.f33771h1, false);
                }
                if (NullChecker.m81303a(this.f33684O0)) {
                    xdl0.m208344M(this.f33684O0, false);
                }
                if (NullChecker.m81303a(this.f33738Z)) {
                    xdl0.m208344M(this.f33738Z, false);
                }
                if (NullChecker.m81303a(this.f33632E0)) {
                    xdl0.m208344M(this.f33632E0, false);
                    return;
                }
                return;
            }
            return;
        }
        this.f33776i2 = true;
        if (this.f33818s2 && NullChecker.m81303a(this.f33733Y) && xdl0.m208349O0(this.f33733Y)) {
            xdl0.m208344M(this.f33733Y, false);
            boolean zM52291ma = m52291ma();
            VLinear vLinear = this.f33829v1;
            if (zM52291ma) {
                xdl0.m208344M(vLinear, true);
                m52129Md(true);
            } else {
                if (NullChecker.m81303a(vLinear)) {
                    xdl0.m208344M(this.f33829v1, false);
                }
                xdl0.m208344M(this.f33771h1, true);
                m52129Md(false);
            }
            xdl0.m208329E0(this.f33771h1, new View.OnClickListener() { // from class: l.oy90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f146297a.m52184Ub(view);
                }
            });
        }
        if (NullChecker.m81303a(this.f33684O0)) {
            xdl0.m208344M(this.f33684O0, false);
        }
        if (NullChecker.m81303a(this.f33738Z)) {
            xdl0.m208344M(this.f33738Z, false);
        }
    }

    /* JADX INFO: renamed from: Vc */
    public final /* synthetic */ void m52193Vc(View view) {
        m52116Kd();
    }

    /* JADX INFO: renamed from: Vd */
    public void m52194Vd() {
        if (this.f33780j2 == null && !TextUtils.isEmpty(this.f33794m3)) {
            this.f33780j2 = CoreModule.m29932K().getUserById(this.f33794m3);
        }
        User user = this.f33780j2;
        if (user == null || User.isMatched(user) || this.f33780j2.isTeamAccount() || "liked_users".equals(this.f33823t3) || "likers".equals(this.f33823t3) || "from_boost_refactor".equals(this.f33823t3) || this.f33780j2.isMe() || m52296na() || m52197W9() || TextUtils.equals(this.f33823t3, "impress_signal") || TextUtils.equals(this.f33823t3, "from_pin_like") || TextUtils.equals(this.f33823t3, "messages_thumbnail_left") || TextUtils.equals(this.f33823t3, "messages_title") || TextUtils.equals(this.f33823t3, CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG) || TextUtils.equals(this.f33823t3, "from_city_center_conv_banner") || TextUtils.equals(this.f33823t3, "conversation_view") || TextUtils.equals(this.f33823t3, "from_city_center_boost_cover") || TextUtils.equals(this.f33823t3, "profile_bubble")) {
            return;
        }
        this.f33751c1.setViewLayoutType(1);
        this.f33751c1.mo56287q(act(), this.f33823t3, this.f33780j2, new u2a0(this), m52358wd());
        xdl0.m208344M(this.f33751c1, true);
        m52149Pd(mo51069K2(), false);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: W */
    public RecyclerView mo52195W() {
        return this.f33718V;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: W2 */
    public View mo52196W2() {
        return this.f33669L0;
    }

    /* JADX INFO: renamed from: W9 */
    public final boolean m52197W9() {
        return rlt.m179881b(this.f33823t3);
    }

    /* JADX INFO: renamed from: Wa */
    public final /* synthetic */ void m52198Wa(View view) {
        mo51113j3(SwipeDirection.LEFT.getValue());
    }

    /* JADX INFO: renamed from: Wb */
    public final /* synthetic */ void m52199Wb(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f33830v2 = zBooleanValue;
        if (zBooleanValue) {
            this.f33793m2.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: Wc */
    public final /* synthetic */ void m52200Wc(View view) {
        zvf0.m220396r("e_new_profile_message_input", pageId());
    }

    /* JADX INFO: renamed from: Wd */
    public boolean m52201Wd() {
        boolean zEquals;
        if (NullChecker.m81303a(this.f33647G3)) {
            zEquals = TEnum.equals(this.f33647G3.status, "matched");
        } else {
            zEquals = (NullChecker.m81303a(this.f33780j2) && NullChecker.m81303a(this.f33780j2.localRelationship)) ? TEnum.equals(this.f33780j2.localRelationship.state, "matched") : false;
        }
        return ("likers".equals(this.f33823t3) || m52229ba() || zEquals || "from_boost_refactor".equals(this.f33823t3)) ? false : true;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: X1 */
    public boolean mo52202X1() {
        return this.f33720V1;
    }

    /* JADX INFO: renamed from: X8 */
    public final String m52203X8() {
        long jM155944o = this.f33810q2 - mqi0.m155944o();
        if (jM155944o <= 0) {
            return "00.00.00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH.mm.ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = new Date();
        date.setTime(jM155944o);
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: renamed from: X9 */
    public final boolean m52204X9() {
        return TextUtils.equals(this.f33823t3, "home_card") && getArguments().getBoolean("long_time_no_see");
    }

    /* JADX INFO: renamed from: Xa */
    public final /* synthetic */ void m52205Xa(View view) {
        ttn.m190607a(OMSDialogPositon.p_suggest_user_profile_info_view, this.f33780j2);
        CoreModule.m29936Q().startAudienceLive(act(), CoreModule.m29936Q().getUserLiveId(this.f33780j2.f56011id), "suggest-card", null);
        CoreModule.f17545c.f19663m0.m31093d8(this.f33780j2.f56011id);
        mo51113j3(SwipeDirection.RIGHT.getValue());
    }

    /* JADX INFO: renamed from: Xb */
    public final /* synthetic */ void m52206Xb() {
        lsi0.m151595y("对方状态异常");
        act().m66873d2();
    }

    /* JADX INFO: renamed from: Xc */
    public final /* synthetic */ void m52207Xc(Conversation conversation) {
        xdl0.m208344M(this.f33724W0, false);
    }

    /* JADX INFO: renamed from: Xd */
    public final void m52208Xd(boolean z) {
        if (m52145P9(this.f33823t3) || m52138O9()) {
            this.f33754c4 = this.f33780j2;
            if (!CoreModule.m29934N().mo60332Wm() || m52318qa()) {
                return;
            }
            if (m52268ia()) {
                this.f33746a4 = false;
                this.f33775i1.setBackground(act().getResources().getDrawable(x2c0.f189299Eh));
                this.f33779j1.setImageDrawable(act().getResources().getDrawable(x2c0.f189518Lh));
                boolean zM52291ma = m52291ma();
                VLinear vLinear = this.f33829v1;
                if (zM52291ma) {
                    xdl0.m208344M(vLinear, true);
                    m52129Md(true);
                    return;
                } else {
                    if (NullChecker.m81303a(vLinear)) {
                        xdl0.m208344M(this.f33829v1, false);
                    }
                    xdl0.m208344M(this.f33771h1, true);
                    m52129Md(false);
                    return;
                }
            }
            this.f33746a4 = true;
            this.f33775i1.setBackground(act().getResources().getDrawable(x2c0.f190568st));
            this.f33779j1.setImageDrawable(act().getResources().getDrawable(x2c0.f190314l));
            boolean zM52291ma2 = m52291ma();
            VLinear vLinear2 = this.f33829v1;
            if (zM52291ma2) {
                xdl0.m208344M(vLinear2, true);
                m52129Md(true);
            } else {
                if (NullChecker.m81303a(vLinear2)) {
                    xdl0.m208344M(this.f33829v1, false);
                }
                xdl0.m208344M(this.f33771h1, true);
                m52129Md(false);
            }
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo51089Y0() {
        return this.f33718V;
    }

    /* JADX INFO: renamed from: Y8 */
    public final void m52209Y8() {
        if (m52296na() || TextUtils.equals(this.f33823t3, "from_portrait_like_list")) {
            return;
        }
        if (!(NullChecker.m81303a(this.f33635E3) && this.f33635E3.showCountdownSendMsg) && CoreModule.m29934N().mo60267Co()) {
            duringCreated(CoreModule.f17545c.f19678r0.m34077C5(this.f33794m3)).subscribe(mkd0.m154956H(new e30() { // from class: l.u4a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f173711a.m52113Ka((GreetingPermission) obj);
                }
            }, new e30() { // from class: l.v4a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFrag.m51976j5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y9 */
    public boolean m52210Y9() {
        if (TextUtils.equals(this.f33823t3, "from_meet_feed")) {
            return true;
        }
        return CoreModule.m29934N().mo60267Co() && m52217Z9();
    }

    /* JADX INFO: renamed from: Ya */
    public final /* synthetic */ void m52211Ya(View view) {
        if (m52305oa()) {
            zvf0.m220396r("e_push_profile_like", "p_push_profile");
        }
        zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, pageId(), vwb.m200311Y("moments_user_id", this.f33794m3));
        boolean zM52305oa = m52305oa();
        VFrame_Shadow vFrame_Shadow = this.f33684O0;
        if (zM52305oa) {
            vFrame_Shadow.setClickable(true);
        } else {
            vFrame_Shadow.setClickable(false);
        }
        mo51113j3(SwipeDirection.RIGHT.getValue());
    }

    /* JADX INFO: renamed from: Yb */
    public final /* synthetic */ void m52212Yb(roj0 roj0Var) {
        RiskOtherData riskOtherDataNew_ = RiskOtherData.new_();
        riskOtherDataNew_.limited = false;
        riskOtherDataNew_.type = "test";
        riskOtherDataNew_.text = "近期發佈過疑似廣告信息";
        m52095Hd(riskOtherDataNew_);
        ((bq90) this.f33686O2).m103365k0("为了您的社交体验及财产安全，请先互相了解建立信任后再添加其他平台好友");
    }

    /* JADX INFO: renamed from: Yc */
    public final /* synthetic */ void m52213Yc(int i, View view) {
        if (i == m94569i2().pictures.size()) {
            wn90.m204602F().f187269a.pictures = this.f33780j2.pictures;
        } else {
            wn90.m204602F().f187269a.pictures = vwb.m200339n(m94569i2().pictures, new w9j() { // from class: l.d0a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m52294md();
    }

    /* JADX INFO: renamed from: Yd */
    public final void m52214Yd() {
        String str;
        Boolean boolValueOf = Boolean.valueOf(!n3b0.m157745t());
        String str2 = this.f33823t3;
        str2.getClass();
        switch (str2) {
            case "home_moment_theme_card":
            case "home_card":
                str = "profile";
                break;
            case "photo_album_feed_from_nearby_falls_feed":
                str = "nearby";
                break;
            case "from_meet_picks_card":
            case "from_meet_picks_feed":
            case "from_new_meet_picks_feed":
            case "from_meet_profile":
            case "from_meet_feed":
                str = "meet";
                break;
            case "liked_users":
                boolValueOf = Boolean.valueOf(!xma.m210071e4());
                str = "ilike";
                break;
            case "photo_album_feed_from_like":
                str = "like";
                break;
            case "photo_album_feed_from_emotion":
                str = Emotion.TYPE;
                break;
            default:
                str = "other";
                break;
        }
        o6j0.m162859c(MatchScData.ModuleId.mid_e_superlikeButton, pageId(), o6j0.C18854a.m162878h("moments_user_id", this.f33794m3), o6j0.C18854a.m162879i("is_privileged", boolValueOf.booleanValue()), o6j0.C18854a.m162878h("showfrom_superlike", str));
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Z */
    public void mo52215Z(final int i) {
        this.f33628D2.mo131811a(new d30() { // from class: l.y3a0
            @Override // p149l.d30
            public final void call() {
                this.f195781a.m52156Qc(i);
            }
        });
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Z1 */
    public boolean mo52216Z1() {
        if (!this.f33835w3 && (!CoreModule.m29936Q().mo67255a().mo124834a() || !this.f33831v3)) {
            if (CoreModule.m29934N().mo60306Pm()) {
                return false;
            }
            if (!"photo_album_feed_from_nearby_focus".equals(this.f33823t3) && !"photo_album_feed_from_nearby_falls_feed".equals(this.f33823t3) && !"photo_album_feed_from_like".equals(this.f33823t3) && !"from_recommend_like".equals(this.f33823t3) && !"photo_album_feed_from_emotion".equals(this.f33823t3) && !"from_portrait_like_list".equals(this.f33823t3) && !"form_my_pet".equals(this.f33823t3) && !"chat_group".equals(this.f33823t3) && !"chat_group_anonymity".equals(this.f33823t3) && !"group_notification".equals(this.f33823t3) && !"group_notification_anonymity".equals(this.f33823t3) && !"moment_visitor".equals(this.f33823t3) && !"from_mew_tags".equals(this.f33823t3) && !"from_literature_third".equals(this.f33823t3) && !"photo_album_feed_from_discover_discussion".equals(this.f33823t3) && !"photo_album_feed_from_activity".equals(this.f33823t3) && !"photo_album_feed_viewers".equals(this.f33823t3) && !"photo_album_feed_from_discover_dating".equals(this.f33823t3) && !"photo_album_feed_from_activity_tab_one".equals(this.f33823t3) && !"photo_album_feed_from_activity_tab_two".equals(this.f33823t3) && !"photo_album_feed_from_search_result".equals(this.f33823t3) && !"photo_album_feed_from_poi_aggregation".equals(this.f33823t3)) {
                return false;
            }
        }
        return (this.f33798n3 || this.f33802o3) ? false : true;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Z2 */
    public int mo51092Z2() {
        MediaReorderCards mediaReorderCards = this.f33787k4.f81526v;
        if (!NullChecker.m81303a(mediaReorderCards)) {
            return 0;
        }
        if (mediaReorderCards.m50811h(0).m50794n()) {
            CrashHelper.m81296c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !mediaReorderCards.m50811h(i2).m50794n(); i2++) {
            arrayList.add(mediaReorderCards.m50811h(i2).f32976N);
            if (!TEnum.equals(mediaReorderCards.m50811h(i2).f32976N.status, "normal")) {
                i++;
            }
        }
        int size = arrayList.size();
        if (!NullChecker.m81303a(wn90.m204602F().f187269a)) {
            CrashHelper.m81296c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
            wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        }
        if (size > 0) {
            wn90.m204602F().f187269a.pictures = arrayList;
        } else if (wn90.m204602F().f187269a.pictures.isEmpty()) {
            wn90.m204602F().f187269a.pictures = this.f33780j2.pictures;
        }
        if (size <= 6) {
            m51955de(size, null, mediaReorderCards);
        }
        return i;
    }

    /* JADX INFO: renamed from: Z9 */
    public boolean m52217Z9() {
        return TextUtils.equals(this.f33823t3, "from_meet_picks_feed") || TextUtils.equals(this.f33823t3, "from_meet_picks_card");
    }

    /* JADX INFO: renamed from: Za */
    public final /* synthetic */ void m52218Za(View view) {
        if (m52305oa()) {
            zvf0.m220396r("e_push_profile_dislike", "p_push_profile");
        }
        zvf0.m220399u("e_dislikeButton", pageId(), vwb.m200311Y("moments_user_id", this.f33794m3));
        mo51113j3(SwipeDirection.LEFT.getValue());
    }

    /* JADX INFO: renamed from: Zb */
    public final /* synthetic */ void m52219Zb(CoreData coreData) {
        if (NullChecker.m81303a(coreData)) {
            if (NullChecker.m81303a(coreData.userRisk)) {
                m52095Hd(coreData.userRisk);
            }
            if (!NullChecker.m81303a(coreData.descriptionRisk) || TextUtils.isEmpty(coreData.descriptionRisk.text)) {
                return;
            }
            zp90 zp90Var = this.f33686O2;
            if (zp90Var instanceof bq90) {
                ((bq90) zp90Var).m103365k0(coreData.descriptionRisk.text);
            }
        }
    }

    /* JADX INFO: renamed from: Zc */
    public final /* synthetic */ void m52220Zc(Media media, int i) {
        if (media instanceof Video) {
            m52189V8(i).m50714z1((Video) media);
        } else {
            m52189V8(i).m50708w1((Picture) media);
        }
        mo51092Z2();
        if (upa.m194825u2()) {
            for (int i2 = 0; i2 < 6; i2++) {
                m52189V8(i2).m50644E1(i2, "p_edit_profile_view");
            }
        }
    }

    /* JADX INFO: renamed from: Zd */
    public final void m52221Zd(int i) {
        if (i > 0) {
            m52186Ud(i);
        } else {
            m52294md();
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: a0 */
    public boolean mo52222a0() {
        return this.f33725W1;
    }

    /* JADX INFO: renamed from: a9 */
    public boolean m52223a9() {
        return (TEnum.equals(this.f33619B3, "unknown_") && !this.f33811q3 && this.f33819s3) || TEnum.equals(this.f33619B3, "matched");
    }

    /* JADX INFO: renamed from: aa */
    public final boolean m52224aa() {
        return TextUtils.equals(this.f33823t3, "from_recommend_like") || TextUtils.equals(this.f33823t3, "conversation_view") || TextUtils.equals(this.f33823t3, "messages_title") || TextUtils.equals(this.f33823t3, CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG) || TextUtils.equals(this.f33823t3, "messages_cover") || TextUtils.equals(this.f33823t3, "messages_friend_comment_toast") || TextUtils.equals(this.f33823t3, "messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: ab */
    public final /* synthetic */ void m52225ab(View view) {
        if (u59.m191811T() && "liked_users".equals(this.f33823t3) && NullChecker.m81303a(CoreModule.f17545c.f19628a1.m134579m(this.f33794m3))) {
            nmn.m160123g(act(), new nmn.C18733a(this.f33780j2.f56011id, ""), "");
        } else {
            if (ogl0.m164247Z()) {
                wge0.m203034f().m203036c(this.f33780j2.f56011id, 1, true, OMSDialogPositon.p_suggest_user_profile_info_view);
            }
            m52271id();
        }
    }

    /* JADX INFO: renamed from: ac */
    public final /* synthetic */ void m52226ac(Bundle bundle) {
        if (this.f33798n3) {
            if (this.f33802o3) {
                act().setTitle(m20604x4(R$string.f19008vj));
            } else {
                act().setTitle(m20604x4(R$string.f18488ei));
            }
        }
        CoreModule.f17545c.f19639e0.f149479u0.put(Boolean.FALSE);
    }

    @Override // p149l.bml
    public /* bridge */ /* synthetic */ Activity act() {
        return super.act();
    }

    /* JADX INFO: renamed from: ae */
    public void m52227ae() {
        o6j0.m162861e("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("is_reply", 0), j760.m140076a("is_match", 1), j760.m140076a("owner_id", this.f33780j2.f56011id));
        act().startActivity(MessagesAct.m48943i2(act(), this.f33780j2.f56011id, true, false));
    }

    /* JADX INFO: renamed from: b9 */
    public final void m52228b9() {
        View viewM52786G0 = this.f33618B2.m52786G0(this.f33618B2.m52801O0());
        if (NullChecker.m81303a(viewM52786G0) && !(viewM52786G0 instanceof PictureView)) {
            this.f33618B2.m52804P1();
        }
        if (w9a0.m202285m().m202293o()) {
            w9a0.m202285m().m202289D(false);
            int iM52809S0 = this.f33618B2.m52809S0() - 1;
            if (iM52809S0 <= 0 || !NullChecker.m81303a(this.f33780j2) || this.f33780j2.pictures.size() <= iM52809S0) {
                return;
            }
            w9a0.m202285m().m202287B(this.f33780j2.pictures.get(iM52809S0).url);
        }
    }

    /* JADX INFO: renamed from: ba */
    public boolean m52229ba() {
        return TextUtils.equals(this.f33823t3, "from_new_meet_likers");
    }

    /* JADX INFO: renamed from: bb */
    public final /* synthetic */ void m52230bb(Boolean bool) {
        ft4.m123008b().m123017j(bool.booleanValue());
        mo51123o();
    }

    /* JADX INFO: renamed from: bc */
    public final /* synthetic */ void m52231bc(View view) {
        m52227ae();
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: c0 */
    public int mo52232c0() {
        return this.f33618B2.m52798N0();
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: c3 */
    public boolean mo52233c3(User user) {
        if (!u59.m191823d0() || !NullChecker.m81303a(user)) {
            return false;
        }
        r4w r4wVar = r4w.INSTANCE;
        if (r4wVar.m177848C(user.f56011id)) {
            return true;
        }
        if (!user.isLoveBuzz()) {
            return false;
        }
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(user.f56011id);
        if (r4wVar.m177861o(conversationM33216zp)) {
            return r4wVar.m177848C(user.f56011id);
        }
        if (r4wVar.m177849D(conversationM33216zp)) {
            return false;
        }
        return r4wVar.m177859m(conversationM33216zp);
    }

    /* JADX INFO: renamed from: c9 */
    public final void m52234c9(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: ca */
    public boolean m52235ca() {
        return TextUtils.equals(this.f33823t3, "from_new_meet_picks_feed");
    }

    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ void m52236cb(roj0 roj0Var) {
        m51839C8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: cc */
    public final /* synthetic */ void m52237cc(j760 j760Var) {
        User user = (User) j760Var.f116564a;
        this.f33780j2 = user;
        if (User.isMatched(user) && NullChecker.m81303a(this.f33632E0)) {
            xdl0.m208344M(this.f33632E0, false);
            xdl0.m208344M(this.f33751c1, false);
        }
        xdl0.m208329E0(this.f33755d1, new View.OnClickListener() { // from class: l.qz90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157015a.m52231bc(view);
            }
        });
        m52104J8();
        m52052Ad(false);
    }

    /* JADX INFO: renamed from: ce */
    public void m52238ce() {
        lra0.m151149h("android_back");
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: d1 */
    public int mo52239d1() {
        int i = this.f33705S1;
        this.f33705S1 = -1;
        return i;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        o660 o660VarM167645d = p660.m167645d();
        this.f33778i4 = o660VarM167645d == null ? "" : o660VarM167645d.m162820c();
        duringCreated(this.f33793m2).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.d3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83485a.m52236cb((roj0) obj);
            }
        }, new e30() { // from class: l.n3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.o3a0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f141645a.m52242db();
            }
        }).filter(new w9j() { // from class: l.p3a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileListFrag.m51888P5((Boolean) obj);
            }
        }).flatMap(new w9j() { // from class: l.q3a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.r3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157515a.m52248eb((Long) obj);
            }
        }, new e30() { // from class: l.t3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFrag.m52016s5((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new C8697e()));
        duringCreated(new v9j() { // from class: l.u3a0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f173587a.m52253fb();
            }
        }).filter(new w9j() { // from class: l.v3a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileListFrag.m52028v5((Boolean) obj);
            }
        }).flatMap(new w9j() { // from class: l.w3a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.e3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
            }
        }));
        creates(new e30() { // from class: l.f3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFrag.m51849F5((Bundle) obj);
            }
        }, new d30() { // from class: l.g3a0
            @Override // p149l.d30
            public final void call() {
                ProfileListFrag.m51936a6();
            }
        });
        creates(new e30() { // from class: l.i3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110633a.m52258gb((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.j3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116019a.m52269ib((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.k3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120809a.m52280kb((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.l3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125856a.m52285lb((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.m3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131030a.m52297nb((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public final void m52240d9() {
        if (NullChecker.m81303a(this.f33614A3)) {
            this.f33637F.removeView(this.f33614A3);
            this.f33614A3 = null;
        }
    }

    /* JADX INFO: renamed from: da */
    public boolean m52241da() {
        return TextUtils.equals(this.f33823t3, "from_new_meet_see_feed");
    }

    /* JADX INFO: renamed from: db */
    public final /* synthetic */ C22306c m52242db() {
        return C22306c.just(Boolean.valueOf(!this.f33802o3 && m52223a9()));
    }

    /* JADX INFO: renamed from: dc */
    public final /* synthetic */ void m52243dc(roj0 roj0Var) {
        if (m52305oa()) {
            xdl0.m208344M(this.f33755d1, false);
        }
    }

    /* JADX INFO: renamed from: dd */
    public final boolean m52244dd() {
        return u59.m191812U();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        if ((act() instanceof EditProfileAct) || (act() instanceof ProfileAct_CustomTransition)) {
            return false;
        }
        act();
        return false;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: e2 */
    public void mo52245e2() {
        this.f33618B2.mo131811a(new d30() { // from class: l.o1a0
            @Override // p149l.d30
            public final void call() {
                this.f141418a.m52118La();
            }
        });
    }

    /* JADX INFO: renamed from: e9 */
    public final void m52246e9() {
        if ((!m51873L9() && !"liked_users_anchor".equals(this.f33823t3) && !"from_greet_act".equals(this.f33823t3)) || this.f33811q3 || TextUtils.equals(this.f33794m3, CoreModule.m29931H().userId())) {
            return;
        }
        duringCreated(m52260gd()).subscribe(mkd0.m154955G(new e30() { // from class: l.zy90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205669a.m52126Ma((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.m29934N().getMomentsPreviousSub()).subscribe(mkd0.m154955G(new e30() { // from class: l.az90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72344a.m52133Na((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ea */
    public boolean m52247ea() {
        return TextUtils.equals(this.f33823t3, "from_picks");
    }

    /* JADX INFO: renamed from: eb */
    public final /* synthetic */ void m52248eb(Long l2) {
        if (mo52143P(this.f33794m3)) {
            return;
        }
        CoreModule.f17545c.f19639e0.m169454W9(this.f33794m3).subscribe(mkd0.m154956H(new e30() { // from class: l.rz90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFrag.m51864J5((roj0) obj);
            }
        }, new C8696d()));
    }

    /* JADX INFO: renamed from: ec */
    public final /* synthetic */ Boolean m52249ec(String str) {
        return Boolean.valueOf(TextUtils.equals("from_city_center_conv_banner", this.f33823t3));
    }

    /* JADX INFO: renamed from: ed */
    public final boolean m52250ed(String str) {
        if (!u59.m191812U() || TextUtils.equals("likers", str) || TextUtils.equals("from_mew_tags", str) || TextUtils.equals("from_portrait_like_list", str) || TextUtils.equals("from_literature_third", str) || CoreModule.f17545c.f19663m0.m31020L6(this.f33794m3) || CoreModule.f17545c.f19663m0.m31024M6(this.f33794m3) || TextUtils.equals("from_boost_refactor", str) || TextUtils.equals("live_user_card", str) || m52197W9() || m52173T9()) {
            return false;
        }
        return !IntlCountryCodeController.m28119o() || nkp.m159986e();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.v2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179367a.m52226ac((Bundle) obj);
            }
        });
        duringCreated(CoreModule.m29934N().getMomentLikeChangedSub()).subscribe(mkd0.m154955G(new e30() { // from class: l.x2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f189142a.m52237cc((j760) obj);
            }
        }));
        duringCreated(C4750p.f20079f0).subscribe(mkd0.m154955G(new e30() { // from class: l.y2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFrag.m51963f8((roj0) obj);
            }
        }));
        duringCreated(C4750p.f20080g0).subscribe(mkd0.m154955G(new e30() { // from class: l.z2a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201173a.m52243dc((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19636d0.m215895j3()).subscribe(mkd0.m154950B());
        m52272j9();
        duringCreated(CoreModule.f17545c.f19678r0.f20038s0).filter(new w9j() { // from class: l.a3a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67339a.m52249ec((String) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.b3a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72817a.m52254fc((String) obj);
            }
        }));
        if (u59.m191812U()) {
            CoreModule.f17545c.f19595P1.f179756R.subscribe(mkd0.m154955G(new e30() { // from class: l.c3a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f78463a.m52259gc((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f9 */
    public final void m52251f9() {
        if ((m51873L9() || "liked_users_anchor".equals(this.f33823t3)) && !this.f33811q3 && !TextUtils.equals(this.f33794m3, CoreModule.m29931H().userId())) {
            xdl0.m208329E0(this.f33755d1, new View.OnClickListener() { // from class: l.hz90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110186a.m52139Oa(view);
                }
            });
            if (TextUtils.equals(this.f33823t3, "from_portrait_like_list")) {
                xdl0.m208329E0(this.f33792m1, new View.OnClickListener() { // from class: l.iz90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f115546a.m52146Pa(view);
                    }
                });
                xdl0.m208329E0(this.f33788l1, new View.OnClickListener() { // from class: l.kz90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f125364a.m52154Qa(view);
                    }
                });
            }
            xdl0.m208329E0(this.f33771h1, new View.OnClickListener() { // from class: l.lz90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130643a.m52161Ra(view);
                }
            });
        }
        if (ogl0.m164248a0() && (("home_card".equals(this.f33823t3) || "home_moment_theme_card".equals(this.f33823t3)) && !CoreModule.f17545c.f19639e0.m169476c8() && !CoreModule.f17545c.f19639e0.m169520na().isJailed() && swh0.m186270v0() > 0 && !myc0.m157001d0().f136285j.contains(userId()) && myc0.m157001d0().m157005f0())) {
            this.f33649H0.setText(String.valueOf(swh0.m186270v0()));
            e51.m114743H(act(), new Runnable() { // from class: l.mz90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136356a.m52168Sa();
                }
            }, 1000L);
        }
        VLinear vLinear = this.f33612A1;
        if (vLinear != null && xdl0.m208349O0(vLinear) && C8455a.m47588w().m47602N()) {
            C8455a.m47588w().f30475a = true;
            this.f33612A1.post(new Runnable() { // from class: l.nz90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141196a.m52174Ta();
                }
            });
        } else if (zzc0.m221015f0()) {
            if (("home_card".equals(this.f33823t3) || "home_moment_theme_card".equals(this.f33823t3)) && rxg0.m181572j().m181593q(this.f33794m3)) {
                rxg0.m181572j().m181581D(this, this.f33780j2, this.f33638F0, 2000);
            }
        }
    }

    /* JADX INFO: renamed from: fa */
    public boolean m52252fa() {
        return TextUtils.equals(this.f33823t3, "push_like");
    }

    /* JADX INFO: renamed from: fb */
    public final /* synthetic */ C22306c m52253fb() {
        return C22306c.just(Boolean.valueOf(this.f33798n3));
    }

    /* JADX INFO: renamed from: fc */
    public final /* synthetic */ void m52254fc(String str) {
        if (TextUtils.equals(str, this.f33794m3)) {
            m52052Ad(false);
        }
    }

    /* JADX INFO: renamed from: fd */
    public <T> T m52255fd(T t) {
        if (t != null) {
            return t;
        }
        ick0.m135358a();
        return null;
    }

    @Override // p149l.a1m
    public String from() {
        return this.f33823t3;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo51106g3() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super.mo20586g4(bundle);
        m52346ud();
        m52040x9();
        m51939ad();
        if (NullChecker.m81303a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo134126m();
        }
        if (mo51119m0()) {
            m52085G9();
        } else {
            m52290m9();
        }
        m52267i9();
        m52251f9();
        m52246e9();
        m52066D9();
        m52349v9();
        m52111K8();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m52177Td();
        m52208Xd(true);
        m52323r9();
        m52036w9();
        if (m52305oa()) {
            m52056B9();
        }
        if (CoreModule.m29934N().mo60285K8()) {
            CoreModule.m29934N().mo60268Cr(act(), userId(), new e30() { // from class: l.yy90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200718a.m52265hc((Boolean) obj);
                }
            });
        }
        m52304o9();
        m52091H9();
        if (m52197W9()) {
            m52317q9();
        }
        if (r65.m178035m() && TextUtils.equals("from_greet_act", this.f33823t3)) {
            m52052Ad(false);
        }
        m52061C9();
    }

    /* JADX INFO: renamed from: g9 */
    public void m52256g9() {
        this.f33835w3 = getArguments().getBoolean("canShowFollowButton");
        this.f33662J3 = getArguments().getInt("pic_index", -1);
        this.f33794m3 = getArguments().getString("user_id");
        this.f33823t3 = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f33794m3)) {
            CrashHelper.m81297d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f33823t3), 1000);
            act().m66873d2();
            return;
        }
        this.f33798n3 = this.f33794m3.equals(CoreModule.m29931H().userId());
        this.f33802o3 = getArguments().getBoolean("is_edit");
        this.f33807p3 = getArguments().getString("input_type");
        this.f33811q3 = getArguments().getBoolean("show_buttons");
        this.f33819s3 = getArguments().getBoolean("no_showbuttons_infofromlocal", true);
        this.f33624C3 = getArguments().getInt("button_flag", 273);
        this.f33629D3 = getArguments().getBoolean("with_superlike", false) && this.f33811q3;
        this.f33619B3 = RelationshipStatus.get(getArguments().getString("relationship_status"));
        this.f33692P3 = getArguments().getString("gift_msg_id");
        this.f33635E3 = (ProfileCreateData) getArguments().getSerializable("profile_create_data");
        this.f33707S3 = (CityCData) getArguments().getSerializable("city_centre_data");
        if ("live_profile_voice_mask_mode".equals(this.f33823t3)) {
            this.f33815r3 = false;
        } else {
            this.f33815r3 = !this.f33802o3;
        }
        if (TextUtils.equals(this.f33823t3, "liked_users") || m52167S9() || m52247ea() || m52210Y9() || m52217Z9()) {
            if (NullChecker.m81303a(CoreModule.f17545c.f19625Z0.m163902C3(this.f33794m3))) {
                this.f33647G3 = CoreModule.f17545c.f19625Z0.m163902C3(this.f33794m3);
                getArguments().putSerializable("liked_user", this.f33647G3);
            } else if (NullChecker.m81303a(getArguments().getSerializable("liked_user"))) {
                this.f33647G3 = (LikedUser) getArguments().getSerializable("liked_user");
            }
        }
        if (u59.m191827f0() && fap.m120262p(this.f33794m3)) {
            this.f33624C3 = 257;
        }
        if (NullChecker.m81303a(CoreModule.m29932K().getUserById(this.f33794m3))) {
            this.f33657I3 = CoreModule.m29932K().getUserById(this.f33794m3);
            getArguments().putSerializable("saved_user", this.f33657I3);
        } else if (NullChecker.m81303a(getArguments().getSerializable("saved_user"))) {
            this.f33657I3 = (User) getArguments().getSerializable("saved_user");
        }
        if (mo52136O1()) {
            CoreBusinessModule.f17537g.m146315b().f133031b = this.f33794m3;
        }
        CoreBusinessModule.f17537g.m146315b().f133032c = this.f33657I3;
        CoreBusinessModule.f17537g.m146315b().f133033d = this.f33657I3;
        CoreBusinessModule.f17537g.m146315b().f133034e = this.f33657I3;
        this.f33827u3 = getArguments().getBoolean("open_media_picker");
        this.f33831v3 = getArguments().getBoolean("from_gp_live");
        if (m94571s() && TextUtils.equals(this.f33823t3, "preview_card")) {
            this.f33790l3 = true;
            this.f33690P1 = (User) getArguments().getSerializable("preview_user_info");
        }
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f33814r2 = (HashMap) serializable;
        }
        this.f33839x3 = getArguments().getInt("pushReason");
        this.f33843y3 = getArguments().getString("pushTag");
        if (this.f33798n3 && m52305oa()) {
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: ga */
    public final boolean m52257ga() {
        return rlt.m179880a(this.f33823t3);
    }

    /* JADX INFO: renamed from: gb */
    public final /* synthetic */ void m52258gb(Bundle bundle) {
        if (this.f33798n3) {
            if (this.f33802o3) {
                act().setTitle(m20604x4(R$string.f19008vj));
            } else {
                act().setTitle(m20604x4(R$string.f18488ei));
            }
        }
        CoreModule.f17545c.f19639e0.f149479u0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: gc */
    public final /* synthetic */ void m52259gc(roj0 roj0Var) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        m51073N6();
    }

    /* JADX INFO: renamed from: gd */
    public final C22306c<Boolean> m52260gd() {
        return CoreModule.f17545c.f19642f0.m32820Ue(this.f33794m3).map(new w9j() { // from class: l.e0a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: h2 */
    public View mo52261h2() {
        return this.f33804p0;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo51108h3() {
        duringCreated(CoreModule.f17545c.f19639e0.m169454W9(userId()).flatMap(new w9j() { // from class: l.bz90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19682s1.m34369s3();
            }
        }).map(new w9j() { // from class: l.cz90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f83075a.m52362xc((List) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.dz90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88462a.m52372yc((j760) obj);
            }
        }, new e30() { // from class: l.ez90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFrag.m52032w5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h9 */
    public final void m52262h9() {
        if (TextUtils.equals(this.f33823t3, "from_auto_scroll_to_question")) {
            e51.m114744I(this, new Runnable() { // from class: l.f2a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94161a.m52183Ua();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: ha */
    public final boolean m52263ha() {
        User user;
        if (this.f33794m3 != null && (user = this.f33780j2) != null && !user.isMe() && !this.f33780j2.isTeamAccount()) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f33794m3);
            if ((NullChecker.m81303a(conversationM32856Xe) && !TEnum.equals(conversationM32856Xe.status, "dismissed")) || User.isMatched(mo51069K2())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hb */
    public final /* synthetic */ Boolean m52264hb() {
        if (this.f33802o3 && this.f33827u3) {
            ((ProfileAct) act()).m50765X2(0);
            this.f33827u3 = false;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: hc */
    public final /* synthetic */ void m52265hc(Boolean bool) {
        this.f33742Z3 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: hd */
    public void m52266hd() {
        if (this.f33760e2) {
            lsi0.m151580j("网络不给力，稍后再试吧");
        } else {
            m52166S8(null, null, false);
            zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, pageId(), vwb.m200311Y("moments_user_id", this.f33794m3));
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo51111i3() {
        return this.f33770g4;
    }

    /* JADX INFO: renamed from: i9 */
    public final void m52267i9() {
        m52073E9();
        if (TextUtils.equals("from_city_center_boost_cover", this.f33823t3)) {
            xdl0.m208344M(this.f33714U0, false);
            xdl0.m208344M(this.f33739Z0, false);
            return;
        }
        if (TextUtils.equals("from_city_center_conv_banner", this.f33823t3) && !TextUtils.equals(this.f33794m3, CoreModule.m29931H().userId())) {
            xdl0.m208344M(this.f33714U0, false);
            xdl0.m208344M(this.f33739Z0, true);
            zvf0.m220402x("e_user_info_greet_to_city_cover", pageId());
            xdl0.m208329E0(this.f33747b1, new View.OnClickListener() { // from class: l.a4a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f67487a.m52191Va(view);
                }
            });
            return;
        }
        if (this.f33811q3) {
            if (NullChecker.m81303a(this.f33780j2) && CoreModule.f17545c.f19663m0.m31020L6(this.f33780j2.f56011id)) {
                xdl0.m208329E0(this.f33704S0, new View.OnClickListener() { // from class: l.b4a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f73324a.m52198Wa(view);
                    }
                });
                xdl0.m208329E0(this.f33709T0, new View.OnClickListener() { // from class: l.c4a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f79164a.m52205Xa(view);
                    }
                });
                return;
            }
            if (("home_card".equals(this.f33823t3) || "home_moment_theme_card".equals(this.f33823t3) || "liked_users".equals(this.f33823t3) || "from_guess_liker_result".equals(this.f33823t3) || m52210Y9() || m52247ea() || m52217Z9() || m52241da() || m52235ca() || m52197W9()) && mo52150Q() && NullChecker.m81303a(this.f33733Y)) {
                m52373z8();
            }
            if (fap.m120266y() && "home_card".equals(this.f33823t3) && NullChecker.m81303a(this.f33733Y)) {
                this.f33632E0.setVisibility(4);
                this.f33654I0.setVisibility(0);
                this.f33638F0 = this.f33659J0;
                this.f33644G0 = this.f33664K0;
                if (u59.m191827f0()) {
                    this.f33674M0.setButtonColorStart(Color.parseColor("#ffa067"));
                    this.f33674M0.setButtonColorEnd(Color.parseColor("#ff3f45"));
                }
            }
            this.f33684O0.setOnClickListener(new View.OnClickListener() { // from class: l.e4a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f89261a.m52211Ya(view);
                }
            });
            this.f33738Z.setOnClickListener(new View.OnClickListener() { // from class: l.f4a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94750a.m52218Za(view);
                }
            });
            if ((vdj.m198001c() || nkp.m159986e() || !IntlCountryCodeController.m28119o()) && !"from_guess_liker_result".equals(this.f33823t3)) {
                boolean zM52197W9 = m52197W9();
                VFrame_Shadow vFrame_Shadow = this.f33632E0;
                if (zM52197W9) {
                    vFrame_Shadow.setVisibility(4);
                } else {
                    vFrame_Shadow.setVisibility(0);
                    this.f33632E0.setOnClickListener(new View.OnClickListener() { // from class: l.g4a0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f100553a.m52225ab(view);
                        }
                    });
                    if (ogl0.m164247Z() && mo52136O1()) {
                        this.f33632E0.setOnLongPressListener(new C8693a());
                    }
                }
            } else {
                this.f33632E0.setVisibility(4);
            }
            if (this.f33632E0.getVisibility() == 4) {
                this.f33654I0.setVisibility(8);
            }
            m52048A8(this.f33632E0);
            m52048A8(this.f33738Z);
            m52048A8(this.f33684O0);
        }
    }

    /* JADX INFO: renamed from: ia */
    public boolean m52268ia() {
        if (NullChecker.m81303a(this.f33754c4)) {
            return m51988la(this.f33754c4) || m51881N9(this.f33754c4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ib */
    public final /* synthetic */ void m52269ib(Bundle bundle) {
        m52321qd();
        if (this.f33802o3 && NullChecker.m81303a(bundle)) {
            m51900Rd(CoreModule.m29932K().me_());
            if (NullChecker.m81303a(wn90.m204602F().f187269a)) {
                m52070Dd(wn90.m204602F().f187269a);
                mo51067J3();
            }
        }
        xdl0.m208366b0(act().findViewById(R.id.content), new v9j() { // from class: l.py90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f151822a.m52264hb();
            }
        });
    }

    /* JADX INFO: renamed from: ic */
    public final /* synthetic */ void m52270ic(View view) {
        m52227ae();
    }

    /* JADX INFO: renamed from: id */
    public void m52271id() {
        if (m52305oa()) {
            zvf0.m220396r("e_push_profile_superlike", "p_push_profile");
        }
        if (!CoreModule.m29934N().mo60267Co() || !this.f33776i2 || !m52160R9()) {
            m52214Yd();
            mo51113j3(SwipeDirection.UP.getValue());
        } else {
            if (!NullChecker.m81303a(this.f33754c4)) {
                this.f33754c4 = this.f33780j2;
            }
            m52276jd();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM52359x8 = m52359x8(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM52359x8;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo51113j3(final int i) {
        SwipeDirection swipeDirection = SwipeDirection.UP;
        if (i == swipeDirection.getValue() && ezc0.m118907m0() && !ezc0.m118906i0().getAllowUpSwipe() && swh0.m186273w0(CoreModule.f17545c.m31484o3().superLikeLimit.remainToday()) == 0 && !mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
            C8764c.m53412M1(act(), "p_profile,superlike", Privilege.vip_super_like, null, null, false, this.f33780j2);
            return;
        }
        if (mo52366y2() && NullChecker.m81303a(this.f33618B2.f34053g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f33618B2;
            profileImagesItemHolder.m52814V0(profileImagesItemHolder.f34053g1, false);
        }
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", this.f33618B2.m52798N0());
        if (!NullChecker.m81303a(this.f33780j2)) {
            act().m66873d2();
            return;
        }
        int iM52798N0 = this.f33618B2.m52798N0();
        int size = this.f33780j2.pictures.size();
        User user = this.f33780j2;
        if (iM52798N0 < size) {
            intent.putExtra("currentImageUrl", user.pictures.get(this.f33618B2.m52798N0()).url);
        } else {
            intent.putExtra("currentImageUrl", user.hasPic() ? this.f33780j2.m60124fp().url : "");
            CrashHelper.m81296c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        if (m52210Y9() || m52217Z9() || m52235ca() || m52241da() || m52229ba() || m52182U9() || m52173T9() || m52167S9()) {
            intent.putExtra("currentUserId", this.f33780j2.f56011id);
        }
        if (m52305oa()) {
            if (NullChecker.m81303a(this.f33780j2)) {
                qer.m174243n(act(), this.f33780j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "home", null, new e30() { // from class: l.q0a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f152021a.m52324ra(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.b1a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f72501a.m52330sa(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        if (m52197W9()) {
            if (NullChecker.m81303a(this.f33780j2)) {
                qer.m174243n(act(), this.f33780j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, this.f33823t3, null, new e30() { // from class: l.m1a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f130817a.m52336ta(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.x1a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f189040a.m52343ua(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
            }
        } else if (TextUtils.equals(this.f33823t3, "from_boost_refactor")) {
            if (NullChecker.m81303a(this.f33780j2)) {
                qer.m174247r(act(), this.f33780j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new f30() { // from class: l.y1a0
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        this.f195398a.m52360xa((User) obj, (Relationship) obj2);
                    }
                });
            }
        } else if (!TextUtils.equals(this.f33823t3, "from_find_partner")) {
            act().setResult(i, intent);
            act().m66873d2();
        } else if (NullChecker.m81303a(this.f33780j2)) {
            qer.m174243n(act(), this.f33780j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "from_find_partner", null, new e30() { // from class: l.z1a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201059a.m52370ya(i, intent, (Relationship) obj);
                }
            }, new e30() { // from class: l.b2a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72678a.m52375za(i, intent, (Throwable) obj);
                }
            }, pageId(), null, null, null);
        }
    }

    /* JADX INFO: renamed from: j9 */
    public void m52272j9() {
        if (ft4.m123008b().m123014g()) {
            act().duringCreated(CoreModule.f17545c.f19611U1.f75278S).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.h5a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f105939a.m52230bb((Boolean) obj);
                }
            }, new e30() { // from class: l.i5a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFrag.m51915V6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: ja */
    public boolean m52273ja() {
        Relationship relationship = this.f33754c4.localRelationship;
        return relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(this.f33754c4.localRelationship.state, "default") || TEnum.equals(this.f33754c4.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: jb */
    public final /* synthetic */ Boolean m52274jb() {
        if (this.f33802o3 && !TextUtils.isEmpty(this.f33807p3)) {
            m52234c9(this.f33807p3);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: jc */
    public final /* synthetic */ void m52275jc(Relationship relationship) {
        if (CoreModule.m29932K().mo30819sg(this.f33780j2.f56011id) || User.isMatched(this.f33780j2)) {
            xdl0.m208344M(this.f33755d1, true);
            xdl0.m208329E0(this.f33755d1, new View.OnClickListener() { // from class: l.j1a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115778a.m52270ic(view);
                }
            });
            return;
        }
        if (TEnum.equals(relationship.state, "liked")) {
            if (NullChecker.m81303a(relationship.relationshipExtensions) && TEnum.equals(relationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED)) {
                if (this.f33818s2) {
                    xdl0.m208344M(this.f33714U0, true);
                    m52090H8();
                    return;
                }
                return;
            }
            if (!this.f33818s2) {
                xdl0.m208344M(this.f33632E0, true);
                return;
            } else {
                xdl0.m208344M(this.f33714U0, true);
                m52097I8();
                return;
            }
        }
        if (TEnum.equals(relationship.state, "superliked")) {
            if (this.f33818s2) {
                xdl0.m208344M(this.f33714U0, true);
                m52090H8();
                return;
            }
            return;
        }
        if (TEnum.equals(relationship.state, RelationshipStatus.disliked) || TEnum.equals(relationship.state, "blocked")) {
            return;
        }
        xdl0.m208344M(this.f33714U0, this.f33818s2);
        xdl0.m208344M(this.f33684O0, true);
        xdl0.m208344M(this.f33738Z, true);
        xdl0.m208344M(this.f33632E0, true);
    }

    /* JADX INFO: renamed from: jd */
    public void m52276jd() {
        if (this.f33752c2) {
            lsi0.m151580j("网络不给力，稍后再试吧");
        } else {
            m52062Ca(null, null);
            m52214Yd();
        }
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: k3 */
    public void mo52277k3() {
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "preEnterAnimStart");
        this.f33762e4 = true;
        this.f33618B2.mo131811a(new d30() { // from class: l.e1a0
            @Override // p149l.d30
            public final void call() {
                this.f88740a.m52320qc();
            }
        });
    }

    /* JADX INFO: renamed from: k9 */
    public final void m52278k9() {
        this.f33782j4.add(this.f33787k4);
        this.f33782j4.add(this.f33791l4);
        this.f33782j4.add(this.f33628D2);
        this.f33782j4.add(this.f33803o4);
        this.f33782j4.add(this.f33795m4);
        this.f33782j4.add(this.f33799n4);
        this.f33782j4.add(this.f33808p4);
        this.f33782j4.add(this.f33812q4);
        this.f33782j4.add(this.f33816r4);
        this.f33782j4.add(this.f33820s4);
        this.f33782j4.add(this.f33824t4);
        this.f33782j4.add(this.f33840x4);
    }

    /* JADX INFO: renamed from: ka */
    public final boolean m52279ka() {
        User user;
        if (TextUtils.isEmpty(this.f33794m3) || (user = this.f33780j2) == null || user.isMe()) {
            return false;
        }
        if (this.f33754c4 == null) {
            this.f33754c4 = CoreModule.m29934N().getUserById(this.f33794m3);
        }
        return CoreModule.m29934N().mo60274Ek(this.f33780j2) || CoreModule.m29934N().mo60274Ek(this.f33754c4);
    }

    /* JADX INFO: renamed from: kb */
    public final /* synthetic */ void m52280kb(Bundle bundle) {
        xdl0.m208366b0(act().findViewById(R.id.content), new v9j() { // from class: l.fz90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f99940a.m52274jb();
            }
        });
    }

    /* JADX INFO: renamed from: kc */
    public final /* synthetic */ void m52281kc(View view) {
        m52227ae();
    }

    /* JADX INFO: renamed from: kd */
    public void m52282kd(boolean z) {
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: l2 */
    public void mo52283l2(boolean z) {
        this.f33720V1 = z;
    }

    /* JADX INFO: renamed from: l9 */
    public final void m52284l9() {
        xdl0.m208345M0(this.f33723W, true);
        int measuredHeight = this.f33618B2.f34059u.getMeasuredHeight() - t100.m186890d(32.0f);
        this.f33772h2 = measuredHeight;
        this.f33723W.setY(measuredHeight);
        xdl0.m208329E0(this.f33723W, new View.OnClickListener() { // from class: l.ny90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141095a.m52306ob(view);
            }
        });
    }

    /* JADX INFO: renamed from: lb */
    public final /* synthetic */ void m52285lb(Bundle bundle) {
        int i = this.f33662J3;
        if (i >= 0) {
            mo52288m2(i, false);
        }
    }

    /* JADX INFO: renamed from: lc */
    public final /* synthetic */ void m52286lc(List list) {
        if (!vwb.m200296J(list)) {
            vwb.m200354z(list, new e30() { // from class: l.r0a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157158a.m52275jc((Relationship) obj);
                }
            });
            return;
        }
        if (CoreModule.m29932K().mo30819sg(this.f33780j2.f56011id) || User.isMatched(this.f33780j2)) {
            xdl0.m208344M(this.f33755d1, true);
            xdl0.m208329E0(this.f33755d1, new View.OnClickListener() { // from class: l.s0a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161762a.m52281kc(view);
                }
            });
        } else {
            xdl0.m208344M(this.f33714U0, this.f33818s2);
            xdl0.m208344M(this.f33684O0, true);
            xdl0.m208344M(this.f33738Z, true);
            xdl0.m208344M(this.f33632E0, true);
        }
    }

    /* JADX INFO: renamed from: ld */
    public String m52287ld(boolean z) {
        return z ? act().getString(R$string.f19021w2) : act().getString(R$string.f19051x2);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo51119m0() {
        return this.f33802o3;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: m2 */
    public void mo52288m2(final int i, final boolean z) {
        this.f33618B2.m131812b(new d30() { // from class: l.oz90
            @Override // p149l.d30
            public final void call() {
                this.f146388a.m52120Lc(i, z);
            }
        });
        this.f33618B2.mo131811a(new d30() { // from class: l.pz90
            @Override // p149l.d30
            public final void call() {
                this.f151927a.m52128Mc(i, z);
            }
        });
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: m3 */
    public boolean mo52289m3(User user) {
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m52290m9() {
        m51900Rd(CoreModule.m29932K().getUserById(this.f33794m3));
        this.f33718V.addOnScrollListener(new C8694b());
        if (!this.f33811q3) {
            xdl0.m208394p0(this.f33733Y);
            xdl0.m208394p0(this.f33699R0);
            xdl0.m208344M(this.f33728X, false);
            this.f33699R0 = null;
            this.f33733Y = null;
            this.f33684O0 = null;
            this.f33632E0 = null;
            this.f33738Z = null;
            return;
        }
        if ((this.f33624C3 & 1) != 1) {
            xdl0.m208345M0(this.f33684O0, false);
        }
        if ((this.f33624C3 & 256) != 256) {
            xdl0.m208345M0(this.f33738Z, false);
        }
        if ((this.f33624C3 & 16) != 16) {
            xdl0.m208345M0(this.f33632E0, false);
        }
        if (this.f33632E0.getVisibility() == 4) {
            this.f33654I0.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ma */
    public final boolean m52291ma() {
        if (CoreModule.m29934N().mo60389so()) {
            return (m52145P9(this.f33823t3) || m52138O9()) && u59.m191812U() && !m52268ia() && this.f33829v1 != null;
        }
        return false;
    }

    /* JADX INFO: renamed from: mb */
    public final /* synthetic */ void m52292mb(C4319c c4319c) {
        if (c4319c != C4319c.f15554o || this.f33802o3) {
            return;
        }
        m52228b9();
    }

    /* JADX INFO: renamed from: mc */
    public final /* synthetic */ Boolean m52293mc(String str) {
        return Boolean.valueOf(TextUtils.equals(str, userId()));
    }

    /* JADX INFO: renamed from: md */
    public final void m52294md() {
        if (vwb.m200296J(wn90.m204602F().f187269a.pictures)) {
            m20581b4().m20504F("你的个人资料页需要至少一张照片").m20556t0(R$string.f18046Q, new Runnable() { // from class: l.h4a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105820a.m51073N6();
                }
            }).m20541k0(R$string.f18408c).m20568z0();
            return;
        }
        final User userM52132N8 = m52132N8();
        User userM52137O8 = m52137O8();
        boolean z = true;
        if (NullChecker.m81303a(userM52132N8) && NullChecker.m81303a(userM52137O8) && userM52132N8.equals(userM52137O8)) {
            this.f33620B4 = true;
        }
        final User userMo223809clone = wn90.m204602F().f187269a.mo223809clone();
        final User userMo223809clone2 = this.f33780j2.mo223809clone();
        if (h7n.m129754c()) {
            ArrayList<String> arrayList = new ArrayList();
            if (NullChecker.m81303a(userM52132N8) && NullChecker.m81303a(userM52132N8.profile) && NullChecker.m81303a(userM52132N8.profile.extensions) && NullChecker.m81303a(userM52132N8.profile.extensions.basic) && !TextUtils.isEmpty(userM52132N8.description)) {
                arrayList.add("about_me");
            }
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                if (!z) {
                    sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                }
                sb.append(str);
                z = false;
            }
            o6j0.m162859c("e_profile_save_button", pageId(), o6j0.C18854a.m162878h("edit_profile_content_modified", sb.toString()));
        }
        if (!NullChecker.m81303a(userM52132N8)) {
            m51073N6();
            return;
        }
        m20595o4(R$string.f17842J5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo223809clone;
        if (NullChecker.m81303a(userM52132N8.profile) && NullChecker.m81303a(userM52132N8.profile.extensions)) {
            userM52132N8.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (upa.m194745e2() && NullChecker.m81303a(userM52132N8) && NullChecker.m81303a(userM52132N8.profile) && NullChecker.m81303a(userM52132N8.profile.extensions) && NullChecker.m81303a(userM52132N8.profile.extensions.basic) && !vwb.m200296J(userM52132N8.profile.extensions.basic.friendPurpose)) ? TEnum.equals(userM52132N8.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31621t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.i4a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileListFrag.m51938a8((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.j4a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f116150a.m52326rc(userM52132N8, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.m154959K(new e30() { // from class: l.k4a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120956a.m52332sc(zEquals, userMo223809clone, userMo223809clone2, userM52132N8, (roj0) obj);
            }
        }, new e30() { // from class: l.l4a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125986a.m52345uc(userMo223809clone2, userM52132N8, (Throwable) obj);
            }
        }, false));
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: me */
    public User mo52295me() {
        if (this.f33785k2 == null) {
            m51882Nd(CoreModule.m29932K().me_());
        }
        return this.f33785k2;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m52256g9();
        m51997n9();
        m52353vd();
        if ("my_tab_profile_like".equals(this.f33823t3)) {
            this.pageHelper.m109041q(pageId());
        } else {
            m52142Od();
        }
        if (this.f33790l3) {
            if (this.f33690P1 == null) {
                act().m66873d2();
                return;
            } else {
                m52082Fd();
                return;
            }
        }
        if (!mo52143P(this.f33794m3) && qp8.m175817b()) {
            if ("home_card".equals(this.f33823t3) && cp60.INSTANCE.m108103q(CoreModule.m29932K().getUserById(this.f33794m3))) {
                this.f33793m2.m132487l(roj0.f160388a);
                return;
            }
            CoreModule.f17545c.f19639e0.m169454W9(this.f33794m3);
        }
        m51831A9();
        p420.m167354t(act());
        m52006p9();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m52262h9();
    }

    /* JADX INFO: renamed from: na */
    public final boolean m52296na() {
        if (!NullChecker.m81303a(this.f33780j2) || this.f33780j2.isMe() || User.isMatched(this.f33780j2)) {
            return false;
        }
        return (!CoreModule.m29932K().mo30819sg(this.f33780j2.f56011id) || this.f33811q3) && m52250ed(this.f33823t3);
    }

    /* JADX INFO: renamed from: nb */
    public final /* synthetic */ void m52297nb(Bundle bundle) {
        act().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.r4a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157644a.m52292mb((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nc */
    public final /* synthetic */ void m52298nc(Bundle bundle) {
        if (this.f33798n3 && f33610I4 == null) {
            e51.m114774y(new Runnable() { // from class: l.xy90
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFrag.m51832B5();
                }
            });
        }
        CoreModule.f17545c.f19636d0.f199753R.m121230k().first().subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: nd */
    public void m52299nd() {
        if ("from_see_blind_box".equals(this.f33823t3)) {
            mo51113j3(0);
        }
        m51073N6();
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: o */
    public void mo51123o() {
        if (!this.f33802o3) {
            if (m52305oa()) {
                zvf0.m220396r("e_push_profile_quit", "p_push_profile");
            }
            if (NullChecker.m81303a(this.f33740Z1) && this.f33740Z1.m222901f()) {
                this.f33740Z1.m222900d();
                this.f33740Z1 = null;
                return;
            } else if (!NullChecker.m81303a(this.f33744a2) || !this.f33744a2.m222892d()) {
                m51073N6();
                return;
            } else {
                this.f33744a2.m222891c();
                this.f33744a2 = null;
                return;
            }
        }
        if (NullChecker.m81303a(wn90.m204602F().f187269a)) {
            boolean zEquals = TextUtils.equals(m94569i2().description, this.f33785k2.description);
            String str = "about_me_pop_ups";
            if (!TextUtils.equals(this.f33823t3, "about_me_pop_ups")) {
                str = "about_me_banner";
                if (!TextUtils.equals(this.f33823t3, "about_me_banner")) {
                    str = "edit_data_button";
                    if (!TextUtils.equals(this.f33823t3, "edit_data_button")) {
                        str = "edit_home_page";
                        if (!TextUtils.equals(this.f33823t3, "edit_home_page")) {
                            str = "other";
                        }
                    }
                }
            }
            o6j0.m162859c("e_edit_personal_profile_finish", "p_edit_profile_view", o6j0.C18854a.m162878h("about_me_is_modified", zEquals ? "no" : "yes"), o6j0.C18854a.m162878h("previous_page", str));
        }
        if (!NullChecker.m81303a(wn90.m204602F().f187269a) || !NullChecker.m81303a(this.f33780j2)) {
            m51073N6();
            return;
        }
        if (this.f33832v4.m108241V()) {
            m94569i2().profile.extensions.momentSwitch.noSyncMoment.clear();
            m94569i2().profile.extensions.momentSwitch.noSyncMoment.add(0, this.f33832v4.m108240U() ? "false" : "true");
        }
        int iMo51092Z2 = mo51092Z2();
        if (m94569i2().equals(this.f33780j2)) {
            m51073N6();
        } else {
            m52221Zd(iMo51092Z2);
        }
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public View mo52300o0() {
        return this.f33684O0;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: o1 */
    public boolean mo52301o1() {
        return this.f33715U1;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: o2 */
    public void mo52302o2() {
        this.f33762e4 = false;
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "onEnterAnimEnd");
        C22392a<roj0> c22392a = this.f33758d4;
        roj0 roj0Var = roj0.f160388a;
        c22392a.m132487l(roj0Var);
        this.f33618B2.mo131811a(new d30() { // from class: l.k1a0
            @Override // p149l.d30
            public final void call() {
                this.f120555a.m52313pc();
            }
        });
        if (this.f33789l2) {
            this.f33793m2.m132487l(roj0Var);
        }
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: o3 */
    public View mo52303o3() {
        return this.f33618B2.f34004E0;
    }

    /* JADX INFO: renamed from: o9 */
    public final void m52304o9() {
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(this.f33794m3);
        if (NullChecker.m81303a(conversationM33216zp) && TEnum.equals(conversationM33216zp.status, "default")) {
            if (NullChecker.m81303a(this.f33714U0)) {
                xdl0.m208344M(this.f33714U0, false);
            }
            if (NullChecker.m81303a(this.f33784k1)) {
                xdl0.m208344M(this.f33784k1, false);
            }
        }
        if (m52112K9()) {
            this.f33754c4 = CoreModule.m29934N().getUserById(this.f33794m3);
            if (NullChecker.m81303a(this.f33771h1)) {
                xdl0.m208344M(this.f33771h1, false);
            }
            if (NullChecker.m81303a(this.f33751c1)) {
                xdl0.m208344M(this.f33751c1, false);
            }
            if (m52296na() && m52244dd()) {
                if (NullChecker.m81303a(this.f33714U0)) {
                    xdl0.m208344M(this.f33714U0, true);
                }
                if (NullChecker.m81303a(this.f33783k0)) {
                    xdl0.m208344M(this.f33783k0, false);
                }
                if (NullChecker.m81303a(this.f33829v1)) {
                    xdl0.m208344M(this.f33829v1, true);
                }
                if (NullChecker.m81303a(this.f33612A1)) {
                    xdl0.m208344M(this.f33612A1, false);
                    return;
                }
                return;
            }
            if (NullChecker.m81303a(this.f33733Y)) {
                xdl0.m208344M(this.f33733Y, false);
            }
            if (NullChecker.m81303a(this.f33784k1)) {
                xdl0.m208344M(this.f33784k1, true);
            }
            if (NullChecker.m81303a(this.f33788l1)) {
                xdl0.m208344M(this.f33788l1, true);
                xdl0.m208329E0(this.f33788l1, new View.OnClickListener() { // from class: l.sz90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f167023a.m52312pb(view);
                    }
                });
            }
            if (NullChecker.m81303a(this.f33792m1)) {
                xdl0.m208344M(this.f33792m1, true);
                xdl0.m208329E0(this.f33792m1, new View.OnClickListener() { // from class: l.tz90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f172698a.m52319qb(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: oa */
    public boolean m52305oa() {
        return false;
    }

    /* JADX INFO: renamed from: ob */
    public final /* synthetic */ void m52306ob(View view) {
        lra0.m151149h("button");
        mo51123o();
    }

    /* JADX INFO: renamed from: oc */
    public final /* synthetic */ void m52307oc(MenuItem menuItem, View view) {
        startActivity(ProfileAct.m50738p2(act() == null ? menuItem.getActionView().getContext() : act(), this.f33794m3, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: od */
    public View.OnClickListener m52308od(User user) {
        return new View.OnClickListener() { // from class: l.gz90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105114a.m52352vc(view);
            }
        };
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ark.m98433L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.m81303a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            wn90.m204602F().f187269a.description = vwb.m200333k(stringExtra).trim();
            mo51056E();
            m51857Gd(wn90.m204602F().f187269a);
            return;
        }
        if (2 == i && NullChecker.m81303a(intent)) {
            String stringExtra2 = intent.getStringExtra("intl_friend_purpose");
            ArrayList arrayList = new ArrayList();
            arrayList.add(stringExtra2);
            wn90.m204602F().f187269a.profile.extensions.basic.intlFriendPurpose = arrayList;
            wn90.m204602F().f187269a.profile.extensions.basic.intlFriendPurposeV2 = arrayList;
            mo51056E();
            m51857Gd(wn90.m204602F().f187269a);
            return;
        }
        if (NullChecker.m81303a(intent) && i2 == -1 && LoopFragmentFactory.m51470N(i, wn90.m204602F().f187269a, intent)) {
            mo51056E();
            m51857Gd(wn90.m204602F().f187269a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                this.f33808p4.m189686R0();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.m81303a(intent)) {
            if (NullChecker.m81303a(wn90.m204602F().f187269a)) {
                LoopFragmentFactory.m51489j(act());
                if (upa.m194825u2()) {
                    m51835Bd(wn90.m204602F().f187269a.pictures);
                }
                mo51056E();
                m51857Gd(wn90.m204602F().f187269a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo51056E();
            m51857Gd(wn90.m204602F().f187269a);
        } else if (i == 3003) {
            mo51067J3();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (getActivity() instanceof NewUI1ContainerActivity) {
            menuInflater.inflate(h7c0.f106224f, menu);
            final MenuItem menuItemFindItem = menu.findItem(u4c0.f174296i8);
            menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.e2a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88907a.m52307oc(menuItemFindItem, view);
                }
            });
            CoreBusinessModule.m29908m0().mo190518e(menuItemFindItem);
            if (this.f33790l3) {
                menuItemFindItem.setVisible(false);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
        Animator animator = this.f33801o2;
        if (animator != null && animator.isRunning()) {
            this.f33801o2.end();
            this.f33801o2 = null;
        }
        C8455a.m47588w().f30475a = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (NullChecker.m81303a(wn90.m204602F().f187269a)) {
            mo51092Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo51125p() {
        return this.f33637F;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: p1 */
    public void mo52309p1(boolean z) {
        this.f33710T1 = z;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: p2 */
    public boolean mo52310p2() {
        return this.f33629D3;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo51126p3(final int i, final Media media) {
        this.f33787k4.mo131811a(new d30() { // from class: l.jz90
            @Override // p149l.d30
            public final void call() {
                this.f120364a.m52220Zc(media, i);
            }
        });
    }

    /* JADX INFO: renamed from: pa */
    public boolean m52311pa(User user) {
        Settings settings;
        List<SettingGroups> list;
        if (qp8.m175817b() && user != null && (settings = user.settings) != null && (list = settings.settingGroups) != null && !list.isEmpty() && user.settings.settingGroups.get(0) != null && user.settings.settingGroups.get(0).live != null && !user.settings.settingGroups.get(0).live.hideProfileWealthTag.booleanValue()) {
            UserWealthGradeConfig userWealthGradeConfigMo67219Gj = CoreModule.m29936Q().mo67219Gj(user.settings.settingGroups.get(0).live.wealthGrade, false);
            if (userWealthGradeConfigMo67219Gj.openNewIcon && !TextUtils.isEmpty(userWealthGradeConfigMo67219Gj.wealthIconUrl)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        if ("my_tab_profile_like".equals(this.f33823t3)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f33823t3)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f33823t3)) {
            return "p_christmas_profile";
        }
        if (NullChecker.m81303a(this.f33635E3) && this.f33635E3.showCountdownSendMsg) {
            return "p_new_profile";
        }
        if (TextUtils.isEmpty(this.f33794m3) || !mo52143P(this.f33794m3)) {
            return getArguments().getBoolean("is_edit") ? "p_edit_profile_view" : OMSDialogPositon.p_suggest_user_profile_info_view;
        }
        return "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: pb */
    public final /* synthetic */ void m52312pb(View view) {
        m52276jd();
    }

    /* JADX INFO: renamed from: pc */
    public final /* synthetic */ void m52313pc() {
        this.f33618B2.m52840y1();
    }

    /* JADX INFO: renamed from: pd */
    public void m52314pd(User user) {
        if (this.f33785k2.isPicVerificationVerified()) {
            CoreDlg.m45097r1(act());
            return;
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            CoreDlg.m44987G1(act(), act().string(R$string.f19106yr), act().string(R$string.f18164Tr), x2c0.f190611u8, act().string(R$string.f18134Sr), null, false, null, null, null, null, true, false, null, null, !this.f33798n3);
            return;
        }
        tvf.m190736n();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        CoreDlg.m44987G1(act(), act().string(R$string.f19106yr), act().string(R$string.f18164Tr), x2c0.f190611u8, act().string(R$string.f18104Rr), new d30() { // from class: l.n0a0
            @Override // p149l.d30
            public final void call() {
                this.f136487a.m52357wc();
            }
        }, true, act().string(R$string.f18074Qr), new d30() { // from class: l.o0a0
            @Override // p149l.d30
            public final void call() {
                zvf0.m220396r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new d30() { // from class: l.p0a0
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        }, null, true, false, null, null, !this.f33798n3);
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: q2 */
    public View mo52315q2() {
        return this.f33728X;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: q3 */
    public boolean mo52316q3() {
        return this.f33617B1;
    }

    /* JADX INFO: renamed from: q9 */
    public final void m52317q9() {
        if (NullChecker.m81303a(this.f33733Y)) {
            xdl0.m208344M(this.f33733Y, false);
        }
        if (NullChecker.m81303a(this.f33714U0)) {
            xdl0.m208344M(this.f33714U0, false);
        }
        if (NullChecker.m81303a(this.f33684O0)) {
            xdl0.m208344M(this.f33684O0, false);
        }
        if (NullChecker.m81303a(this.f33738Z)) {
            xdl0.m208344M(this.f33738Z, false);
        }
        if (NullChecker.m81303a(this.f33829v1)) {
            xdl0.m208344M(this.f33829v1, false);
        }
        if (NullChecker.m81303a(this.f33771h1)) {
            xdl0.m208344M(this.f33771h1, false);
        }
        if (NullChecker.m81303a(this.f33751c1)) {
            xdl0.m208344M(this.f33751c1, false);
        }
    }

    /* JADX INFO: renamed from: qa */
    public boolean m52318qa() {
        if (this.f33752c2 || this.f33756d2) {
            return true;
        }
        if (!NullChecker.m81303a(this.f33754c4.localRelationship)) {
            return false;
        }
        if (vwb.m200296J(this.f33754c4.localRelationship.status) || !this.f33754c4.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked))) {
            return NullChecker.m81303a(this.f33754c4.localRelationship.relationshipExtensions) && TEnum.equals(this.f33754c4.localRelationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED);
        }
        return true;
    }

    /* JADX INFO: renamed from: qb */
    public final /* synthetic */ void m52319qb(View view) {
        m52266hd();
    }

    /* JADX INFO: renamed from: qc */
    public final /* synthetic */ void m52320qc() {
        this.f33618B2.m52841z1();
    }

    /* JADX INFO: renamed from: qd */
    public final void m52321qd() {
        if (this.f33798n3 || !m52223a9()) {
            return;
        }
        User userById = CoreModule.m29932K().getUserById(this.f33794m3);
        if (!NullChecker.m81303a(userById) || userById.unilateralBlock() || mo52143P(this.f33794m3) || mo52233c3(userById)) {
            return;
        }
        CoreModule.m29934N().coreMomentPrevious(this.f33794m3);
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: r3 */
    public PictureView mo52322r3(int i) {
        View viewM52786G0 = this.f33618B2.m52786G0(i);
        if (viewM52786G0 instanceof PictureView) {
            return (PictureView) viewM52786G0;
        }
        if (this.f33618B2.m52786G0(0) instanceof PictureView) {
            return (PictureView) this.f33618B2.m52786G0(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: r9 */
    public final void m52323r9() {
        if (m52235ca() || m52241da()) {
            xdl0.m208344M(this.f33684O0, false);
            xdl0.m208344M(this.f33738Z, false);
            if (this.f33818s2) {
                m52097I8();
            }
        }
    }

    /* JADX INFO: renamed from: ra */
    public final /* synthetic */ void m52324ra(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: rb */
    public final /* synthetic */ C22306c m52325rb() {
        return mkd0.m154985s(this.f33798n3 ? CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged() : C22306c.just(null), CoreModule.f17545c.f19639e0.m169410Ka(this.f33794m3), CoreModule.f17545c.f19639e0.m169523o9(), new f5a0());
    }

    /* JADX INFO: renamed from: rc */
    public final /* synthetic */ C22306c m52326rc(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f17545c.f19639e0.m169385E9(user);
        }
        wn90.m204602F().f187269a.description = profileEditInfo.user.description;
        wn90.m204602F().f187269a.profile = profileEditInfo.user.profile;
        User user2 = wn90.m204602F().f187269a;
        User user3 = profileEditInfo.user;
        user2.name = user3.name;
        if (TextUtils.isEmpty(user3.pictures.get(0).url)) {
            m52076Ed(wn90.m204602F().f187269a, true);
            xdl0.m208344M(this.f33787k4.f81527w, false);
        } else {
            xdl0.m208344M(this.f33787k4.f81527w, true);
            wn90.m204602F().f187269a.pictures = profileEditInfo.user.pictures;
            m52076Ed(wn90.m204602F().f187269a, false);
        }
        throw new ProfileEditInfoException();
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: s1 */
    public boolean mo52327s1() {
        return this.f33811q3;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: s2 */
    public LikedUser mo52328s2() {
        return this.f33647G3;
    }

    /* JADX INFO: renamed from: s9 */
    public final void m52329s9() {
        this.f33782j4.add(this.f33618B2);
        if (TextUtils.equals(this.f33794m3, CoreModule.m29931H().userId())) {
            this.f33782j4.add(this.f33623C2);
        }
        if (m52305oa()) {
            this.f33782j4.add(this.f33741Z2);
        }
        this.f33782j4.add(this.f33745a3);
        this.f33782j4.add(this.f33628D2);
        this.f33782j4.add(this.f33769g3);
        this.f33782j4.add(this.f33753c3);
        this.f33782j4.add(this.f33757d3);
        this.f33782j4.add(this.f33761e3);
        this.f33782j4.add(this.f33634E2);
        if (qib0.f154713b0.f139232c.mo67233Om()) {
            this.f33782j4.add(this.f33721V2);
        }
        this.f33782j4.add(this.f33765f3);
        if (!m52197W9()) {
            this.f33782j4.add(this.f33640F2);
            this.f33640F2.m97874u0(this.f33823t3);
        }
        this.f33782j4.add(this.f33749b3);
        this.f33782j4.add(this.f33646G2);
        this.f33782j4.add(this.f33773h3);
        this.f33782j4.add(this.f33651H2);
        this.f33782j4.add(this.f33661J2);
        this.f33782j4.add(this.f33656I2);
        this.f33782j4.add(this.f33686O2);
        this.f33782j4.add(this.f33691P2);
        this.f33782j4.add(this.f33696Q2);
        this.f33782j4.add(this.f33701R2);
        this.f33782j4.add(this.f33706S2);
        this.f33782j4.add(this.f33711T2);
        this.f33782j4.add(this.f33716U2);
        if (!TextUtils.isEmpty(this.f33823t3) && (TextUtils.equals("home_card", this.f33823t3) || TextUtils.equals("share_profile", this.f33823t3) || TextUtils.equals("home_moment_theme_card", this.f33823t3))) {
            mo51075P1();
        }
        if (!User.ID_OFFICIAL_CHANNEL.equals(this.f33794m3) && !"from_guess_liker_result".equals(this.f33823t3)) {
            this.f33782j4.add(this.f33731X2);
        }
        if (!mo51075P1()) {
            this.f33782j4.add(new l33(this, this));
        }
        this.f33782j4.add(this.f33840x4);
        this.f33782j4.add(this.f33840x4);
    }

    /* JADX INFO: renamed from: sa */
    public final /* synthetic */ void m52330sa(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: sb */
    public final /* synthetic */ void m52331sb(xaj0 xaj0Var) {
        m51900Rd((User) xaj0Var.f191752b);
        m51882Nd((User) xaj0Var.f191753c);
        m52339td();
        mo51067J3();
    }

    /* JADX INFO: renamed from: sc */
    public final /* synthetic */ void m52332sc(boolean z, User user, User user2, User user3, roj0 roj0Var) {
        if (z) {
            CoreModule.f17545c.f19639e0.f149377g4.m132487l("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            zvf0.m220371D("e_upload_photos_success", pageId(), vwb.m200311Y("upload_page_name", "edit_profile_page"), vwb.m200311Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size())));
        }
        if (this.f33615A4) {
            m51945be();
            this.f33615A4 = false;
        }
        m51073N6();
        if (NullChecker.m81303a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.f17545c.f19639e0.m169395H7();
            HashMap map = new HashMap();
            map.put("Number of photos changed", Integer.valueOf(user3.pictures.size() - user2.pictures.size()));
            w85.INSTANCE.m202145m("Edited Profile", map);
        }
        if (this.f33620B4) {
            return;
        }
        wn90.m204602F().f187272d.m132487l(Integer.valueOf((NullChecker.m81303a(this.f33780j2) && this.f33780j2.status.contains(UserStatus.get(UserStatus.audit))) ? gd70.f102084d : gd70.f102085e));
    }

    /* JADX INFO: renamed from: sd */
    public final void m52333sd(boolean z) {
        if (NullChecker.m81303a(this.f33618B2.f34009H) && NullChecker.m81303a(this.f33618B2.f34015K) && NullChecker.m81303a(this.f33618B2.f34017L) && this.f33618B2.m131823u().isAttachedToWindow()) {
            if (!m52311pa(this.f33780j2) || NullChecker.m81303a(this.f33618B2.f34013J)) {
                this.f33618B2.m52839x1(z);
            }
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: t1 */
    public void mo52334t1() {
        if (mo52216Z1()) {
            this.f33628D2.mo131811a(new d30() { // from class: l.t0a0
                @Override // p149l.d30
                public final void call() {
                    this.f167136a.m52075Ec();
                }
            });
        }
    }

    /* JADX INFO: renamed from: t9 */
    public final void m52335t9() {
        epa0 epa0Var = new epa0();
        int visibility = m52153Q9() & (this.f33811q3 ^ true) ? 8 : this.f33733Y.getVisibility();
        xdl0.m208394p0(this.f33733Y);
        xdl0.m208394p0(this.f33771h1);
        epa0Var.m117609e(this.f33714U0);
        this.f33733Y = epa0Var.f92618c;
        this.f33783k0 = epa0Var.f92622g;
        this.f33738Z = epa0Var.f92621f;
        this.f33684O0 = epa0Var.f92627l;
        this.f33689P0 = epa0Var.f92628m;
        this.f33638F0 = epa0Var.f92624i;
        this.f33632E0 = epa0Var.f92623h;
        this.f33804p0 = epa0Var.f92619d;
        this.f33644G0 = epa0Var.f92625j;
        this.f33649H0 = epa0Var.f92626k;
        this.f33714U0.setVisibility(visibility);
        this.f33733Y.setVisibility(visibility);
        this.f33728X.setVisibility(visibility);
        this.f33771h1 = epa0Var.f92632q;
        this.f33829v1 = epa0Var.f92629n;
        this.f33833w1 = epa0Var.f92630o;
        VLinear vLinear = epa0Var.f92631p;
        this.f33837x1 = vLinear;
        this.f33841y1 = epa0Var.f92633r;
        this.f33846z1 = epa0Var.f92634s;
        this.f33612A1 = epa0Var.f92636u;
        xdl0.m208329E0(vLinear, new View.OnClickListener() { // from class: l.a0a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67017a.m52337tb(view);
            }
        });
        xdl0.m208329E0(this.f33833w1, new View.OnClickListener() { // from class: l.b0a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72420a.m52344ub(view);
            }
        });
        epa0Var.m117610f(act(), this.f33780j2, this.f33823t3, new d30() { // from class: l.c0a0
            @Override // p149l.d30
            public final void call() {
                this.f78123a.m52351vb();
            }
        });
        if (TextUtils.equals("home_card", this.f33823t3) && NullChecker.m81303a(this.f33780j2) && CoreModule.f17545c.f19663m0.m31020L6(this.f33780j2.f56011id)) {
            xdl0.m208344M(this.f33733Y, false);
            xdl0.m208344M(this.f33699R0, true);
        }
        m52157Qd();
    }

    /* JADX INFO: renamed from: ta */
    public final /* synthetic */ void m52336ta(int i, Intent intent, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "liked") && !TEnum.equals(relationship.state, "matched") && !TEnum.equals(relationship.state, "superliked")) {
            act().setResult(i, intent);
            act().m66873d2();
            return;
        }
        if (NullChecker.m81303a(this.f33738Z)) {
            xdl0.m208344M(this.f33738Z, false);
        }
        if (NullChecker.m81303a(this.f33684O0)) {
            xdl0.m208344M(this.f33684O0, false);
        }
        if (!TEnum.equals(relationship.state, "superliked") && !relationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) && i != SwipeDirection.UP.getValue()) {
            lsi0.m151595y("喜欢已发送");
        } else if (NullChecker.m81303a(this.f33632E0)) {
            xdl0.m208344M(this.f33632E0, false);
        }
    }

    /* JADX INFO: renamed from: tb */
    public final /* synthetic */ void m52337tb(View view) {
        m52266hd();
    }

    /* JADX INFO: renamed from: td */
    public final void m52339td() {
        m52109Jd();
        if (mo51053D2()) {
            return;
        }
        if (this.f33765f3.mo102271S()) {
            this.f33765f3.m208599V(true);
            return;
        }
        if (this.f33757d3.mo102271S()) {
            this.f33757d3.m208599V(true);
            return;
        }
        if (this.f33753c3.mo102271S()) {
            this.f33753c3.m208599V(true);
        } else if (this.f33769g3.mo102271S()) {
            this.f33769g3.m208599V(true);
        } else if (this.f33761e3.mo102271S()) {
            this.f33761e3.m208599V(true);
        }
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: u2 */
    public VPager_SquaredRefactor mo52340u2() {
        return this.f33618B2.f34062x;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: u3 */
    public void mo52341u3(int i) {
        this.f33700R1 = i;
    }

    /* JADX INFO: renamed from: u9 */
    public final void m52342u9() {
        if (!CoreModule.f17545c.f19639e0.m169520na().status.contains(UserStatus.get(UserStatus.audit)) && !CertificationUtil.m58153l() && jjb0.m141784b()) {
            xdl0.m208344M(this.f33658J, false);
            return;
        }
        PicCertGuideView picCertGuideView = this.f33838x2;
        if (picCertGuideView != null) {
            xdl0.m208344M(picCertGuideView, false);
        }
    }

    /* JADX INFO: renamed from: ua */
    public final /* synthetic */ void m52343ua(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: ub */
    public final /* synthetic */ void m52344ub(View view) {
        m52276jd();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX INFO: renamed from: uc */
    public final /* synthetic */ void m52345uc(User user, User user2, Throwable th) {
        boolean z;
        if (yij0.m214930H(th)) {
            m20599s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m20599s4();
            osi0.m165782f(R$string.f17874K7);
            return;
        }
        if (NullChecker.m81303a(act())) {
            m20599s4();
            if (th instanceof TantanException.Client.TantanForbidden) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (!tantanForbidden.isCannotModify() || TextUtils.isEmpty(tantanForbidden.message)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            CrashHelper.m81296c(new Throwable("from:" + this.f33823t3 + th.toString()));
            if (z) {
                String string = act().getString(R$string.f17737Fk);
                double dDoubleValue = (NullChecker.m81303a(user.settings) && NullChecker.m81303a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                if (NullChecker.m81303a(user2.settings) && NullChecker.m81303a(user2.settings.birthdate)) {
                    dDoubleValue = user2.settings.birthdate.doubleValue();
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis((long) dDoubleValue);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
                int iM149011T = l9b.m149011T(calendar, calendar2);
                if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iM149011T > 120) {
                    string = act().getString(R$string.f18140T3);
                } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                    string = act().getString(R$string.f18170U3);
                } else if (iM149011T > 120) {
                    string = act().getString(R$string.f18200V3);
                }
                m20581b4().m20504F(string).m20556t0(R$string.f18046Q, new Runnable() { // from class: l.h0a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f105205a.m52338tc();
                    }
                }).m20541k0(R$string.f18408c).m20568z0();
            }
        }
    }

    /* JADX INFO: renamed from: ud */
    public final void m52346ud() {
        if (m52257ga()) {
            this.f33637F.getViewTreeObserver().addOnGlobalLayoutListener(this.f33737Y3);
        }
    }

    @Override // p149l.c5m
    public String userId() {
        return this.f33794m3;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: v1 */
    public boolean mo52347v1() {
        return this.f33710T1;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: v2 */
    public boolean mo52348v2() {
        if (upa.m194706V1()) {
            return TextUtils.equals(this.f33823t3, "chat_group_anonymity") || TextUtils.equals(this.f33823t3, "group_notification_anonymity");
        }
        return false;
    }

    /* JADX INFO: renamed from: v9 */
    public final void m52349v9() {
        if (this.f33818s2 && m52247ea() && CoreModule.m29932K().mo30819sg(this.f33780j2.f56011id)) {
            m52097I8();
        }
    }

    /* JADX INFO: renamed from: va */
    public final /* synthetic */ void m52350va() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: vb */
    public final /* synthetic */ void m52351vb() {
        if (u59.m191812U()) {
            if (m52190V9()) {
                act().setResult(SwipeDirection.REMOVE.getValue());
            }
            m51073N6();
        } else if (TextUtils.equals("home_card", this.f33823t3) || m52247ea() || m52153Q9() || TextUtils.equals("home_moment_theme_card", this.f33823t3)) {
            m52097I8();
        }
    }

    /* JADX INFO: renamed from: vc */
    public final /* synthetic */ void m52352vc(View view) {
        m52314pd(this.f33780j2);
    }

    /* JADX INFO: renamed from: vd */
    public final void m52353vd() {
        if ("home_card".equals(this.f33823t3) || "home_moment_theme_card".equals(this.f33823t3)) {
            this.f33617B1 = false;
            this.f33848z3 = "swipe";
            return;
        }
        if ("conversation_view".equals(this.f33823t3)) {
            this.f33848z3 = "conversationlist";
            return;
        }
        if ("messages_thumbnail_right".equals(this.f33823t3) || "messages_thumbnail_left".equals(this.f33823t3) || "messages_title".equals(this.f33823t3) || CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG.equals(this.f33823t3) || "messages_friend_comment_toast".equals(this.f33823t3) || "profile_bubble".equals(this.f33823t3)) {
            this.f33848z3 = "conversation";
        } else if ("moments_in_profile".equals(this.f33823t3)) {
            this.f33848z3 = "personal_album";
        } else if ("home_menu".equals(this.f33823t3)) {
            this.f33848z3 = "main_menu";
        }
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: w3 */
    public View mo52354w3() {
        return this.f33618B2.f34001C;
    }

    /* JADX INFO: renamed from: wa */
    public final /* synthetic */ void m52355wa(final User user, Relationship relationship) {
        User userM169433Q9 = CoreModule.f17545c.f19639e0.m169433Q9(user.f56011id);
        if (userM169433Q9 != null) {
            user = userM169433Q9;
        }
        if (NullChecker.m81303a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.yz90
                @Override // p149l.d30
                public final void call() {
                    qib0.f154722k0.f176631d.upsert(user);
                }
            });
        }
        e51.m114743H(act(), new Runnable() { // from class: l.zz90
            @Override // java.lang.Runnable
            public final void run() {
                this.f205787a.m52350va();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: wb */
    public final /* synthetic */ void m52356wb() {
        this.f33718V.scrollBy(0, ProfileImagesItemHolder.f33997k1);
    }

    /* JADX INFO: renamed from: wc */
    public final /* synthetic */ void m52357wc() {
        zvf0.m220396r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.f17545c.f19552B0.m31620s4(), "pending")) {
            CoreDlg.m44987G1(act(), act().string(R$string.f17864Jr), act().string(R$string.f17834Ir), x2c0.f190654vj, act().string(R$string.f19076xr), null, false, null, null, null, null, true, false, null, null, !this.f33798n3);
        } else {
            tvf.m190730h(act(), OMSTemplateType.dialog);
        }
    }

    /* JADX INFO: renamed from: wd */
    public String m52358wd() {
        return m52305oa() ? grk.m127715b(this.f33839x3) : "";
    }

    /* JADX INFO: renamed from: x8 */
    public View m52359x8(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l9a0.m149004b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: xa */
    public final /* synthetic */ void m52360xa(final User user, final Relationship relationship) {
        e51.m114774y(new Runnable() { // from class: l.j5a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116281a.m52355wa(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: xb */
    public final /* synthetic */ void m52361xb(String str, List list) {
        if (vwb.m200296J(list)) {
            mo51123o();
        } else {
            ft4.m123008b().m123018k(act(), str);
        }
    }

    /* JADX INFO: renamed from: xc */
    public final /* synthetic */ j760 m52362xc(List list) {
        return vwb.m200311Y(list, BookMoviesDramasHelper.m59445l(userId()));
    }

    /* JADX INFO: renamed from: xd */
    public final void m52363xd() {
        if (NullChecker.m81303a(this.f33751c1) && this.f33751c1.getVisibility() == 0) {
            zvf0.m220402x("e_push_profile_hello", "p_push_profile");
        }
        if (NullChecker.m81303a(this.f33733Y) && this.f33733Y.getVisibility() == 0) {
            if (NullChecker.m81303a(this.f33738Z) && this.f33738Z.getVisibility() == 0) {
                zvf0.m220402x("e_push_profile_dislike", "p_push_profile");
            }
            if (NullChecker.m81303a(this.f33632E0) && this.f33632E0.getVisibility() == 0) {
                zvf0.m220402x("e_push_profile_superlike", "p_push_profile");
            }
            if (NullChecker.m81303a(this.f33684O0) && this.f33684O0.getVisibility() == 0) {
                zvf0.m220402x("e_push_profile_like", "p_push_profile");
            }
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: y0 */
    public String mo52364y0() {
        return m52305oa() ? grk.m127714a(this.f33839x3, this.f33843y3) : "";
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: y1 */
    public View mo52365y1() {
        return (View) m52255fd(this.f33618B2.f34064z);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: y2 */
    public boolean mo52366y2() {
        if (!m94571s() || this.f33802o3) {
            return och0.m163518f() && !this.f33802o3 && TextUtils.equals(this.f33823t3, "home_card");
        }
        return true;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: y3 */
    public void mo52367y3(j760<Integer, Integer> j760Var) {
        this.f33730X1 = j760Var;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        ValueAnimator valueAnimator = this.f33786k3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.mo20605y4();
    }

    /* JADX INFO: renamed from: y8 */
    public void m52368y8(int i, Intent intent) {
        if (NullChecker.m81303a(intent)) {
            intent.putExtra("currentImageIndex", mo52232c0());
            int iMo52232c0 = mo52232c0();
            int size = this.f33780j2.pictures.size();
            User user = this.f33780j2;
            if (iMo52232c0 < size) {
                intent.putExtra("currentImageUrl", user.pictures.get(mo52232c0()).url);
            } else {
                intent.putExtra("currentImageUrl", user.hasPic() ? this.f33780j2.m60124fp().url : "");
                CrashHelper.m81296c(new Exception("ProfileListFrag user pictures get index crash on acfFinish"));
            }
        }
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: y9 */
    public final void m52369y9() {
        ih90 ih90Var = new ih90();
        int visibility = this.f33733Y.getVisibility();
        xdl0.m208394p0(this.f33733Y);
        ih90Var.m136188a(this.f33694Q0);
        ih90Var.m136189b();
        RelativeLayout relativeLayout = ih90Var.f113216a;
        this.f33733Y = relativeLayout;
        this.f33783k0 = ih90Var.f113218c;
        this.f33738Z = ih90Var.f113217b;
        this.f33684O0 = ih90Var.f113224i;
        this.f33689P0 = ih90Var.f113225j;
        this.f33638F0 = ih90Var.f113221f;
        this.f33632E0 = ih90Var.f113220e;
        this.f33804p0 = ih90Var.f113219d;
        this.f33644G0 = ih90Var.f113222g;
        this.f33649H0 = ih90Var.f113223h;
        relativeLayout.setVisibility(visibility);
        this.f33728X.setVisibility(visibility);
        if (TextUtils.equals("home_card", this.f33823t3) && NullChecker.m81303a(this.f33780j2) && CoreModule.f17545c.f19663m0.m31020L6(this.f33780j2.f56011id)) {
            xdl0.m208344M(this.f33733Y, false);
            xdl0.m208344M(this.f33699R0, true);
        }
        m52157Qd();
    }

    /* JADX INFO: renamed from: ya */
    public final /* synthetic */ void m52370ya(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            lsi0.m151595y(String.format("喜欢已发送，%s将收到你的喜欢", this.f33780j2.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: yb */
    public final /* synthetic */ void m52371yb(Throwable th) {
        mo51123o();
    }

    /* JADX INFO: renamed from: yc */
    public final /* synthetic */ void m52372yc(j760 j760Var) {
        this.f33797n2 = j760Var;
        mo51067J3();
    }

    /* JADX INFO: renamed from: z8 */
    public final void m52373z8() {
        if (TextUtils.equals(this.f33823t3, "from_portrait_like_list") || TextUtils.equals(this.f33823t3, "from_city_center_conv_banner") || TextUtils.equals(this.f33823t3, "from_city_center_boost_cover") || TextUtils.equals(this.f33823t3, "impress_signal") || TextUtils.equals(this.f33823t3, "from_pin_like") || this.f33818s2) {
            return;
        }
        if (NullChecker.m81303a(this.f33733Y) && (this.f33733Y.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33733Y.getLayoutParams();
            layoutParams.bottomMargin = t100.m186890d(72.0f);
            this.f33733Y.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33771h1.getLayoutParams();
            marginLayoutParams.bottomMargin = t100.m186890d(72.0f);
            this.f33771h1.setLayoutParams(marginLayoutParams);
        }
        boolean zEquals = false;
        this.f33751c1.setVisibility(0);
        if ("liked_users".equals(this.f33823t3) || m52210Y9() || m52217Z9() || m52167S9()) {
            LikedUser likedUserM163902C3 = CoreModule.f17545c.f19625Z0.m163902C3(this.f33794m3);
            if (likedUserM163902C3 == null && NullChecker.m81303a(this.f33647G3)) {
                likedUserM163902C3 = this.f33647G3;
            }
            if (NullChecker.m81303a(likedUserM163902C3)) {
                zEquals = TEnum.equals(likedUserM163902C3.status, "superliked");
            }
        }
        this.f33751c1.mo56292I(zEquals);
        if (CoreModule.m29932K().getUserById(this.f33794m3) == null) {
            NullChecker.m81303a(this.f33657I3);
        }
        this.f33751c1.m56291C(act(), this.f33823t3, this.f33794m3, new u2a0(this), m52358wd());
        this.f33840x4.mo131811a(new d30() { // from class: l.d1a0
            @Override // p149l.d30
            public final void call() {
                this.f83253a.m52049Aa();
            }
        });
    }

    /* JADX INFO: renamed from: z9 */
    public final void m52374z9() {
        CoreBusinessModule.m29908m0().mo190521h(this.f33809q1);
        xdl0.m208344M(this.f33809q1.f34150d, false);
        final d30 d30Var = new d30() { // from class: l.y0a0
            @Override // p149l.d30
            public final void call() {
                this.f195286a.m52080Fb();
            }
        };
        this.f33809q1.setEditCallBack(d30Var);
        this.f33618B2.mo131811a(new d30() { // from class: l.z0a0
            @Override // p149l.d30
            public final void call() {
                this.f200948a.m52086Gb(d30Var);
            }
        });
        if (this.f33798n3) {
            return;
        }
        final d30 d30Var2 = new d30() { // from class: l.a1a0
            @Override // p149l.d30
            public final void call() {
                this.f67115a.m52134Nb();
            }
        };
        this.f33618B2.mo131811a(new d30() { // from class: l.c1a0
            @Override // p149l.d30
            public final void call() {
                this.f78238a.m52140Ob(d30Var2);
            }
        });
        this.f33809q1.setMoreCallBack(d30Var2);
        mo52334t1();
    }

    /* JADX INFO: renamed from: za */
    public final /* synthetic */ void m52375za(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: zb */
    public final /* synthetic */ void m52376zb(roj0 roj0Var) {
        mo51123o();
    }

    /* JADX INFO: renamed from: zc */
    public final /* synthetic */ void m52377zc(View view) {
        zvf0.m220396r("e_user_info_greet_to_city_cover", pageId());
        C8360d.m45896e(act(), this.f33707S3.userId);
    }

    /* JADX INFO: renamed from: zd */
    public final void m52378zd() {
        this.f33809q1.setVisibility(0);
        if (!this.f33802o3) {
            this.f33809q1.m52953k(this.f33780j2, this.f33823t3, this.f33790l3, mo51079R0());
            return;
        }
        boolean z = this.f33790l3;
        if (z) {
            this.f33809q1.m52953k(this.f33780j2, this.f33823t3, z, mo51079R0());
        }
    }
}
