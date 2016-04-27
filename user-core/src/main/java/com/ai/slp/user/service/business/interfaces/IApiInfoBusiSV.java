package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.apiinfo.param.ApiInfoRequest;
import com.ai.slp.user.api.apiinfo.param.ApiInfoResponse;
import com.ai.slp.user.api.apiinfo.param.CreateApiInfoRequest;
import com.ai.slp.user.api.apiinfo.param.UcApiInfoParams;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteResponse;

public interface IApiInfoBusiSV {

    CreateUserFavoriteResponse insertApiInfo(CreateApiInfoRequest saveApiInfoRequest)
            throws BusinessException, SystemException;

    void updateApiInfo(UcApiInfoParams ucApiInfoParams) throws BusinessException, SystemException;

    PageInfo<ApiInfoResponse> queryApiInfo(ApiInfoRequest apiInfoRequest)
            throws BusinessException, SystemException;
}