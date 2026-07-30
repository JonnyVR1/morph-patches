package com.tantanapp.common.network;

import com.p051p1.mobile.putong.data.User;
import java.io.IOException;
import java.io.InputStream;
import p153l.i5d0;
import p153l.kmk0;

/* JADX INFO: loaded from: classes11.dex */
public class ExceptionChecker {
    private static final String TAG = "ExceptionChecker";

    public static Exception check(i5d0 i5d0Var) {
        if (User.ID_TEAM_ACCOUNT.equals(i5d0Var.m138675u("Putong-Client-Version-Expires-At"))) {
            return new ApiExcep.ClientExpired(i5d0Var);
        }
        if (kmk0.f127509b && i5d0Var.m138675u("X-RateLimit-Remaining") != null) {
            String str = kmk0.f127508a;
        }
        int iM138673q = i5d0Var.m138673q();
        int i = iM138673q / 100;
        if (i == 2) {
            return null;
        }
        if (iM138673q == 400) {
            return new ApiExcep.Client.BadRequest(i5d0Var);
        }
        if (iM138673q == 401) {
            return new ApiExcep.Client.Unauthorized(i5d0Var);
        }
        if (iM138673q == 403) {
            return new ApiExcep.Client.Forbidden(i5d0Var);
        }
        if (iM138673q == 404) {
            return new ApiExcep.Client.NotFound(i5d0Var);
        }
        if (iM138673q == 405) {
            return new ApiExcep.Client.MethodNotAllowed(i5d0Var);
        }
        if (iM138673q == 409) {
            return new ApiExcep.Client.Conflict(i5d0Var);
        }
        if (iM138673q == 410) {
            return new ApiExcep.Client.Gone(i5d0Var);
        }
        if (iM138673q == 413) {
            return new ApiExcep.Client.RequestEntityTooLarge(i5d0Var);
        }
        if (iM138673q == 415) {
            return new ApiExcep.Client.UnsupportedMediaType(i5d0Var);
        }
        if (iM138673q == 418) {
            return new ApiExcep.Client.ImATeapot(i5d0Var);
        }
        if (iM138673q == 422) {
            return new ApiExcep.Client.UnprocessableEntity(i5d0Var);
        }
        if (iM138673q == 429) {
            String strM138675u = i5d0Var.m138675u("X-RateLimit-Reset");
            return strM138675u != null ? new ApiExcep.Client.TooManyRequests(i5d0Var, Math.min(Integer.parseInt(strM138675u), 10)) : new ApiExcep.Client.TooManyRequests(i5d0Var, 5);
        }
        if (i == 5) {
            return new ApiExcep.Server(i5d0Var);
        }
        return new Exception("code: " + iM138673q);
    }

    public static InputStream inputStreamAfterCheck(i5d0 i5d0Var) throws IOException {
        if (i5d0Var.m138673q() != 204) {
            return i5d0Var.m138670k().byteStream();
        }
        return null;
    }
}
