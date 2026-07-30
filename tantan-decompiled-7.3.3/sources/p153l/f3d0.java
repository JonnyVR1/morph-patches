package p153l;

import com.googlecode.mp4parser.AbstractBox;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/* JADX INFO: loaded from: classes7.dex */
@Aspect
public class f3d0 {

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ Throwable f96984a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ f3d0 f96985b = null;

    static {
        try {
            m123721a();
        } catch (Throwable th) {
            f96984a = th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ void m123721a() {
        f96985b = new f3d0();
    }

    /* JADX INFO: renamed from: b */
    public static f3d0 m123722b() {
        f3d0 f3d0Var = f96985b;
        if (f3d0Var != null) {
            return f3d0Var;
        }
        throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", f96984a);
    }

    @Before("this(com.googlecode.mp4parser.AbstractBox) && ((execution(public * * (..)) && !( execution(* parseDetails()) || execution(* getNumOfBytesToFirstChild()) || execution(* getType()) || execution(* isParsed()) || execution(* getHeader(*)) || execution(* parse()) || execution(* getBox(*)) || execution(* getSize()) || execution(* getOffset()) || execution(* parseDetails()) || execution(* _parseDetails(*)) || execution(* parse(*,*,*,*)) || execution(* getIsoFile()) || execution(* getParent()) || execution(* setParent(*)) || execution(* getUserType()) || execution(* setUserType(*))) && !@annotation(com.googlecode.mp4parser.annotations.DoNotParseDetail)) || @annotation(com.googlecode.mp4parser.annotations.ParseDetail))")
    /* JADX INFO: renamed from: c */
    public void m123723c(JoinPoint joinPoint) {
        if (!(joinPoint.getTarget() instanceof AbstractBox)) {
            zzq0.m222278a("Only methods in subclasses of ", AbstractBox.class.getName(), " can  be annotated with ParseDetail");
        } else {
            if (((AbstractBox) joinPoint.getTarget()).isParsed()) {
                return;
            }
            ((AbstractBox) joinPoint.getTarget()).parseDetails();
        }
    }
}
