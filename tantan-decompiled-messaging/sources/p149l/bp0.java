package p149l;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Process;
import com.sunshine.engine.base.AbstractC13484a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParserFactory;

/* JADX INFO: loaded from: classes13.dex */
public class bp0 {

    /* JADX INFO: renamed from: a */
    private static List<AbstractC13484a> f76584a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static boolean f76585b = false;

    /* JADX INFO: renamed from: l.bp0$b */
    public static class RunnableC15923b implements Runnable {
        private RunnableC15923b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            InputStream inputStreamOpen;
            Process.setThreadPriority(10);
            for (AbstractC13484a abstractC13484aM103005c = bp0.m103005c(); abstractC13484aM103005c != null; abstractC13484aM103005c = bp0.m103005c()) {
                InputStream inputStream = null;
                mediaPlayer = null;
                MediaPlayer mediaPlayer = null;
                try {
                    try {
                        boolean zExists = new File(abstractC13484aM103005c.f55654b).exists();
                        boolean z = !zExists;
                        inputStreamOpen = !zExists ? abstractC13484aM103005c.f55653a.m80976j().getResources().getAssets().open(abstractC13484aM103005c.f55654b) : new FileInputStream(new File(abstractC13484aM103005c.f55654b));
                        try {
                            bp0.m103007e(inputStreamOpen, abstractC13484aM103005c);
                            boolean z2 = true;
                            abstractC13484aM103005c.f55672t = true;
                            m7r.m153385a(abstractC13484aM103005c);
                            Bitmap bitmapM210766g = !zExists ? xsi0.m210766g(abstractC13484aM103005c.f55653a.m80976j(), abstractC13484aM103005c.f55655c) : BitmapFactory.decodeFile(abstractC13484aM103005c.f55655c);
                            if (abstractC13484aM103005c.f55656d != null) {
                                if (zExists) {
                                    mediaPlayer = new MediaPlayer();
                                    mediaPlayer.reset();
                                    mediaPlayer.setDataSource(abstractC13484aM103005c.f55656d);
                                } else {
                                    AssetFileDescriptor assetFileDescriptorM210765f = xsi0.m210765f(abstractC13484aM103005c.f55653a.m80976j(), abstractC13484aM103005c.f55656d);
                                    if (assetFileDescriptorM210765f != null) {
                                        MediaPlayer mediaPlayer2 = new MediaPlayer();
                                        mediaPlayer2.reset();
                                        mediaPlayer2.setDataSource(assetFileDescriptorM210765f.getFileDescriptor(), assetFileDescriptorM210765f.getStartOffset(), assetFileDescriptorM210765f.getLength());
                                        mediaPlayer = mediaPlayer2;
                                    }
                                }
                            }
                            if (bitmapM210766g != null) {
                                abstractC13484aM103005c.f55653a.m80973g("in parse").m80973g("   entity.hashCode()=" + abstractC13484aM103005c.hashCode()).m80973g("   bmp.hashCode()=" + bitmapM210766g.hashCode()).m80973g("   entity.configPath=" + abstractC13484aM103005c.f55654b).m80973g("   entity.picPath=" + abstractC13484aM103005c.f55655c).m80973g("   entity.inAsset=" + z);
                                if (bitmapM210766g.isRecycled()) {
                                    abstractC13484aM103005c.f55653a.m80973g("   bmp.isRecycled() in parse").m80977k();
                                    z2 = false;
                                } else {
                                    if (mediaPlayer != null) {
                                        mediaPlayer.prepare();
                                    }
                                    abstractC13484aM103005c.mo80958j(bitmapM210766g, mediaPlayer);
                                }
                            } else {
                                z2 = false;
                            }
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException e) {
                                    xsi0.m210769j(e);
                                }
                            }
                            if (!z2) {
                                abstractC13484aM103005c.f55653a.m80982r(abstractC13484aM103005c);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            inputStream = inputStreamOpen;
                            xsi0.m210769j(e);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e3) {
                                    xsi0.m210769j(e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException e4) {
                                    xsi0.m210769j(e4);
                                }
                            }
                            abstractC13484aM103005c.f55653a.m80982r(abstractC13484aM103005c);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpen = null;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static synchronized AbstractC13484a m103005c() {
        if (f76584a.size() > 0) {
            return f76584a.remove(0);
        }
        f76585b = false;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m103006d(AbstractC13484a abstractC13484a) {
        if (abstractC13484a != null) {
            f76584a.add(abstractC13484a);
            if (!f76585b) {
                f76585b = true;
                new Thread(new RunnableC15923b()).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m103007e(InputStream inputStream, AbstractC13484a abstractC13484a) throws Exception {
        SAXParserFactory.newInstance().newSAXParser().parse(inputStream, abstractC13484a.mo80953e());
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m103008f(AbstractC13484a abstractC13484a) {
        f76584a.remove(abstractC13484a);
    }
}
